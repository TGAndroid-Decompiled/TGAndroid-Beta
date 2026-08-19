package org.telegram.ui.Adapters;

import android.util.Pair;
import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ShareAlert;

public class SearchAdapterHelper {
    private boolean allResultsAreGlobal;
    private SearchAdapterHelperDelegate delegate;
    private ArrayList hashtags;
    private HashMap hashtagsByText;
    private String lastFoundChannel;
    private ArrayList localRecentResults;
    private ArrayList localSearchResults;
    private final ArrayList pendingRequestIds = new ArrayList();
    private String lastFoundUsername = null;
    private final ArrayList localServerSearch = new ArrayList();
    private final ArrayList globalSearch = new ArrayList();
    private final LongSparseArray globalSearchMap = new LongSparseArray();
    private final ArrayList groupSearch = new ArrayList();
    private final LongSparseArray groupSearchMap = new LongSparseArray();
    private final LongSparseArray phoneSearchMap = new LongSparseArray();
    private final ArrayList phonesSearch = new ArrayList();
    private int currentAccount = UserConfig.selectedAccount;
    private boolean allowGlobalResults = true;
    private boolean hashtagsLoadedFromDb = false;

    public static class HashtagObject {
        int date;
        String hashtag;
    }

    public interface SearchAdapterHelperDelegate {

        public abstract class CC {
            public static boolean $default$canApplySearchResults(SearchAdapterHelperDelegate searchAdapterHelperDelegate, int i) {
                return true;
            }

            public static LongSparseArray $default$getExcludeCallParticipants(SearchAdapterHelperDelegate searchAdapterHelperDelegate) {
                return null;
            }

            public static LongSparseArray $default$getExcludeUsers(SearchAdapterHelperDelegate searchAdapterHelperDelegate) {
                return null;
            }

            public static void $default$onSetHashtags(SearchAdapterHelperDelegate searchAdapterHelperDelegate, ArrayList arrayList, HashMap map) {
            }
        }

        boolean canApplySearchResults(int i);

        LongSparseArray getExcludeCallParticipants();

        LongSparseArray getExcludeUsers();

        void onDataSetChanged(int i);

        void onSetHashtags(ArrayList arrayList, HashMap map);
    }

    protected boolean filter(TLObject tLObject) {
        return true;
    }

    public SearchAdapterHelper(boolean z) {
        this.allResultsAreGlobal = z;
    }

    public void setAllowGlobalResults(boolean z) {
        this.allowGlobalResults = z;
    }

    public boolean isSearchInProgress() {
        return this.pendingRequestIds.size() > 0;
    }

    public void queryServerSearch(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, long j, boolean z6, int i, int i2) {
        queryServerSearch(str, z, z2, z3, z4, z5, j, z6, i, i2, 0L, null);
    }

    public void queryServerSearch(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, long j, boolean z6, int i, int i2, long j2) {
        queryServerSearch(str, z, z2, z3, z4, z5, j, z6, i, i2, j2, null);
    }

    public void queryServerSearch(final String str, boolean z, final boolean z2, final boolean z3, boolean z4, final boolean z5, long j, boolean z6, int i, final int i2, final long j2, final Runnable runnable) {
        final boolean z7;
        boolean z8;
        String str2;
        ArrayList arrayList = this.pendingRequestIds;
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(((Integer) obj).intValue(), true);
        }
        this.pendingRequestIds.clear();
        if (str == null) {
            this.groupSearch.clear();
            this.groupSearchMap.clear();
            this.globalSearch.clear();
            this.globalSearchMap.clear();
            this.localServerSearch.clear();
            this.phonesSearch.clear();
            this.phoneSearchMap.clear();
            this.delegate.onDataSetChanged(i2);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        if (str.length() > 0) {
            if (j != 0) {
                TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                if (i == 1) {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
                } else if (i == 3) {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBanned();
                } else if (i == 0) {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsKicked();
                } else {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsSearch();
                }
                tL_channels_getParticipants.filter.q = str;
                tL_channels_getParticipants.limit = 50;
                tL_channels_getParticipants.offset = 0;
                tL_channels_getParticipants.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j);
                z7 = z4;
                arrayList2.add(new Pair(tL_channels_getParticipants, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        SearchAdapterHelper.$r8$lambda$8nMTsF0cRgFdXzeKoWWyiu9bcAQ(this.f$0, str, z7, tLObject, tL_error);
                    }
                }));
            } else {
                z7 = z4;
                this.lastFoundChannel = str.toLowerCase();
            }
            z8 = false;
        } else {
            z7 = z4;
            this.groupSearch.clear();
            this.groupSearchMap.clear();
            z8 = true;
        }
        if (z) {
            if (str.length() > 0) {
                TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                tL_contacts_search.q = str;
                tL_contacts_search.limit = 20;
                arrayList2.add(new Pair(tL_contacts_search, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        SearchAdapterHelper.$r8$lambda$twGuWATPsTaEk9ejBR2vR_Tfgu8(this.f$0, i2, z2, z5, z3, z7, j2, str, tLObject, tL_error);
                    }
                }));
            } else {
                this.globalSearch.clear();
                this.globalSearchMap.clear();
                this.localServerSearch.clear();
                z8 = false;
            }
        }
        if (!z5 && z6 && str.startsWith("+") && str.length() > 3) {
            this.phonesSearch.clear();
            this.phoneSearchMap.clear();
            String strStripExceptNumbers = PhoneFormat.stripExceptNumbers(str);
            ArrayList<TLRPC.TL_contact> arrayList3 = ContactsController.getInstance(this.currentAccount).contacts;
            int size2 = arrayList3.size();
            boolean z9 = false;
            for (int i5 = 0; i5 < size2; i5++) {
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(arrayList3.get(i5).user_id));
                if (user != null && (str2 = user.phone) != null && str2.startsWith(strStripExceptNumbers)) {
                    if (!z9) {
                        z9 = user.phone.length() == strStripExceptNumbers.length();
                    }
                    this.phonesSearch.add(user);
                    this.phoneSearchMap.put(user.id, user);
                }
            }
            if (!z9) {
                this.phonesSearch.add("section");
                this.phonesSearch.add(strStripExceptNumbers);
            }
            z8 = false;
        }
        AtomicInteger atomicInteger = new AtomicInteger(0);
        ArrayList arrayList4 = new ArrayList();
        while (i3 < arrayList2.size()) {
            TLObject tLObject = (TLObject) ((Pair) arrayList2.get(i3)).first;
            arrayList4.add(null);
            final AtomicInteger atomicInteger2 = new AtomicInteger();
            final AtomicInteger atomicInteger3 = atomicInteger;
            final ArrayList arrayList5 = arrayList4;
            final int i6 = i3;
            final ArrayList arrayList6 = arrayList2;
            atomicInteger2.set(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLObject, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                    SearchAdapterHelper.$r8$lambda$4LfToSZ7_7zZ5yOfzMj4basnOVg(this.f$0, arrayList5, i6, atomicInteger2, atomicInteger3, arrayList6, i2, runnable, tLObject2, tL_error);
                }
            }));
            this.pendingRequestIds.add(Integer.valueOf(atomicInteger2.get()));
            i3++;
            arrayList2 = arrayList6;
            atomicInteger = atomicInteger3;
            arrayList4 = arrayList5;
        }
        if (z8) {
            this.delegate.onDataSetChanged(i2);
        }
    }

    public static void $r8$lambda$8nMTsF0cRgFdXzeKoWWyiu9bcAQ(SearchAdapterHelper searchAdapterHelper, String str, boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
        searchAdapterHelper.getClass();
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            searchAdapterHelper.lastFoundChannel = str.toLowerCase();
            MessagesController.getInstance(searchAdapterHelper.currentAccount).putUsers(tL_channels_channelParticipants.users, false);
            MessagesController.getInstance(searchAdapterHelper.currentAccount).putChats(tL_channels_channelParticipants.chats, false);
            searchAdapterHelper.groupSearch.clear();
            searchAdapterHelper.groupSearchMap.clear();
            searchAdapterHelper.groupSearch.addAll(tL_channels_channelParticipants.participants);
            long clientUserId = UserConfig.getInstance(searchAdapterHelper.currentAccount).getClientUserId();
            int size = tL_channels_channelParticipants.participants.size();
            for (int i = 0; i < size; i++) {
                TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i);
                long peerId = MessageObject.getPeerId(channelParticipant.peer);
                if (!z && peerId == clientUserId) {
                    searchAdapterHelper.groupSearch.remove(channelParticipant);
                } else {
                    searchAdapterHelper.groupSearchMap.put(peerId, channelParticipant);
                }
            }
        }
    }

    public static void $r8$lambda$twGuWATPsTaEk9ejBR2vR_Tfgu8(SearchAdapterHelper searchAdapterHelper, int i, boolean z, boolean z2, boolean z3, boolean z4, long j, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Chat chat;
        TLRPC.User user;
        ArrayList<TLRPC.Peer> arrayList;
        TLRPC.Chat chat2;
        TLRPC.User user2;
        if (searchAdapterHelper.delegate.canApplySearchResults(i) && tL_error == null) {
            TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
            searchAdapterHelper.globalSearch.clear();
            searchAdapterHelper.globalSearchMap.clear();
            searchAdapterHelper.localServerSearch.clear();
            MessagesController.getInstance(searchAdapterHelper.currentAccount).putChats(tL_contacts_found.chats, false);
            MessagesController.getInstance(searchAdapterHelper.currentAccount).putUsers(tL_contacts_found.users, false);
            MessagesStorage.getInstance(searchAdapterHelper.currentAccount).putUsersAndChats(tL_contacts_found.users, tL_contacts_found.chats, true, true);
            LongSparseArray longSparseArray = new LongSparseArray();
            LongSparseArray longSparseArray2 = new LongSparseArray();
            for (int i2 = 0; i2 < tL_contacts_found.chats.size(); i2++) {
                TLRPC.Chat chat3 = tL_contacts_found.chats.get(i2);
                longSparseArray.put(chat3.id, chat3);
            }
            for (int i3 = 0; i3 < tL_contacts_found.users.size(); i3++) {
                TLRPC.User user3 = tL_contacts_found.users.get(i3);
                longSparseArray2.put(user3.id, user3);
            }
            for (int i4 = 0; i4 < 2; i4++) {
                if (i4 == 0) {
                    if (searchAdapterHelper.allResultsAreGlobal) {
                        arrayList = tL_contacts_found.my_results;
                    }
                } else {
                    arrayList = tL_contacts_found.results;
                }
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    TLRPC.Peer peer = arrayList.get(i5);
                    long j2 = peer.user_id;
                    if (j2 != 0) {
                        user2 = (TLRPC.User) longSparseArray2.get(j2);
                        chat2 = null;
                    } else {
                        long j3 = peer.chat_id;
                        if (j3 != 0) {
                            chat2 = (TLRPC.Chat) longSparseArray.get(j3);
                        } else {
                            long j4 = peer.channel_id;
                            if (j4 != 0) {
                                chat2 = (TLRPC.Chat) longSparseArray.get(j4);
                            } else {
                                chat2 = null;
                                user2 = null;
                            }
                        }
                        user2 = null;
                    }
                    if (chat2 != null) {
                        if (z && ((!z2 || ChatObject.canAddBotsToChat(chat2)) && ((searchAdapterHelper.allowGlobalResults || !ChatObject.isNotInChat(chat2)) && searchAdapterHelper.filter(chat2)))) {
                            searchAdapterHelper.globalSearch.add(chat2);
                            searchAdapterHelper.globalSearchMap.put(-chat2.id, chat2);
                        }
                    } else if (user2 != null && !z2 && ((z3 || !user2.bot) && ((z4 || !user2.self) && ((searchAdapterHelper.allowGlobalResults || i4 != 1 || user2.contact) && searchAdapterHelper.filter(user2))))) {
                        searchAdapterHelper.globalSearch.add(user2);
                        searchAdapterHelper.globalSearchMap.put(user2.id, user2);
                    }
                }
            }
            if (!searchAdapterHelper.allResultsAreGlobal) {
                for (int i6 = 0; i6 < tL_contacts_found.my_results.size(); i6++) {
                    TLRPC.Peer peer2 = tL_contacts_found.my_results.get(i6);
                    long j5 = peer2.user_id;
                    if (j5 != 0) {
                        user = (TLRPC.User) longSparseArray2.get(j5);
                        chat = null;
                    } else {
                        long j6 = peer2.chat_id;
                        if (j6 != 0) {
                            chat = (TLRPC.Chat) longSparseArray.get(j6);
                        } else {
                            long j7 = peer2.channel_id;
                            if (j7 != 0) {
                                chat = (TLRPC.Chat) longSparseArray.get(j7);
                            } else {
                                chat = null;
                                user = null;
                            }
                        }
                        user = null;
                    }
                    if (chat != null) {
                        if (z && ((!z2 || ChatObject.canAddBotsToChat(chat)) && (-chat.id) != j && searchAdapterHelper.filter(chat))) {
                            searchAdapterHelper.localServerSearch.add(chat);
                            searchAdapterHelper.globalSearchMap.put(-chat.id, chat);
                        }
                    } else if (user != null && !z2 && ((z3 || !user.bot) && ((z4 || !user.self) && user.id != j && searchAdapterHelper.filter(user)))) {
                        searchAdapterHelper.localServerSearch.add(user);
                        searchAdapterHelper.globalSearchMap.put(user.id, user);
                    }
                }
            }
            searchAdapterHelper.lastFoundUsername = str.toLowerCase();
        }
    }

    public static void $r8$lambda$4LfToSZ7_7zZ5yOfzMj4basnOVg(final SearchAdapterHelper searchAdapterHelper, final ArrayList arrayList, final int i, final AtomicInteger atomicInteger, final AtomicInteger atomicInteger2, final ArrayList arrayList2, final int i2, final Runnable runnable, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        searchAdapterHelper.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SearchAdapterHelper.$r8$lambda$KEM9tdvcm39o4s0VbGsImX_uFMg(this.f$0, arrayList, i, tLObject, tL_error, atomicInteger, atomicInteger2, arrayList2, i2, runnable);
            }
        });
    }

    public static void $r8$lambda$KEM9tdvcm39o4s0VbGsImX_uFMg(SearchAdapterHelper searchAdapterHelper, ArrayList arrayList, int i, TLObject tLObject, TLRPC.TL_error tL_error, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, ArrayList arrayList2, int i2, Runnable runnable) {
        searchAdapterHelper.getClass();
        arrayList.set(i, new Pair(tLObject, tL_error));
        Integer numValueOf = Integer.valueOf(atomicInteger.get());
        if (searchAdapterHelper.pendingRequestIds.contains(numValueOf)) {
            searchAdapterHelper.pendingRequestIds.remove(numValueOf);
            if (atomicInteger2.incrementAndGet() == arrayList2.size()) {
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    RequestDelegate requestDelegate = (RequestDelegate) ((Pair) arrayList2.get(i3)).second;
                    Pair pair = (Pair) arrayList.get(i3);
                    if (pair != null) {
                        requestDelegate.run((TLObject) pair.first, (TLRPC.TL_error) pair.second);
                    }
                }
                searchAdapterHelper.removeGroupSearchFromGlobal();
                ArrayList arrayList3 = searchAdapterHelper.localSearchResults;
                if (arrayList3 != null) {
                    searchAdapterHelper.mergeResults(arrayList3, searchAdapterHelper.localRecentResults);
                }
                searchAdapterHelper.mergeExcludeResults();
                searchAdapterHelper.delegate.onDataSetChanged(i2);
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    private void removeGroupSearchFromGlobal() {
        if (this.globalSearchMap.size() == 0) {
            return;
        }
        int size = this.groupSearchMap.size();
        for (int i = 0; i < size; i++) {
            TLRPC.User user = (TLRPC.User) this.globalSearchMap.get(this.groupSearchMap.keyAt(i));
            if (user != null) {
                this.globalSearch.remove(user);
                this.localServerSearch.remove(user);
                this.globalSearchMap.remove(user.id);
            }
        }
    }

    public void clear() {
        this.globalSearch.clear();
        this.globalSearchMap.clear();
        this.localServerSearch.clear();
    }

    public void unloadRecentHashtags() {
        this.hashtagsLoadedFromDb = false;
    }

    public boolean loadRecentHashtags() {
        if (this.hashtagsLoadedFromDb) {
            return true;
        }
        MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                SearchAdapterHelper.$r8$lambda$haNYPVrlkJo4mVsc9IvRACWptRI(this.f$0);
            }
        });
        return false;
    }

    public static void $r8$lambda$haNYPVrlkJo4mVsc9IvRACWptRI(final SearchAdapterHelper searchAdapterHelper) {
        searchAdapterHelper.getClass();
        try {
            SQLiteCursor sQLiteCursorQueryFinalized = MessagesStorage.getInstance(searchAdapterHelper.currentAccount).getDatabase().queryFinalized("SELECT id, date FROM hashtag_recent_v2 WHERE 1", new Object[0]);
            final ArrayList arrayList = new ArrayList();
            final HashMap map = new HashMap();
            while (sQLiteCursorQueryFinalized.next()) {
                HashtagObject hashtagObject = new HashtagObject();
                hashtagObject.hashtag = sQLiteCursorQueryFinalized.stringValue(0);
                hashtagObject.date = sQLiteCursorQueryFinalized.intValue(1);
                arrayList.add(hashtagObject);
                map.put(hashtagObject.hashtag, hashtagObject);
            }
            sQLiteCursorQueryFinalized.dispose();
            Collections.sort(arrayList, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    return SearchAdapterHelper.$r8$lambda$T4q89PGiVpYuJ8ZXW8u0FTBmGek((SearchAdapterHelper.HashtagObject) obj, (SearchAdapterHelper.HashtagObject) obj2);
                }
            });
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.setHashtags(arrayList, map);
                }
            });
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static int $r8$lambda$T4q89PGiVpYuJ8ZXW8u0FTBmGek(HashtagObject hashtagObject, HashtagObject hashtagObject2) {
        int i = hashtagObject.date;
        int i2 = hashtagObject2.date;
        if (i < i2) {
            return 1;
        }
        return i > i2 ? -1 : 0;
    }

    public void addGroupMembers(ArrayList arrayList) {
        this.groupSearch.clear();
        this.groupSearch.addAll(arrayList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            TLObject tLObject = (TLObject) arrayList.get(i);
            if (tLObject instanceof TLRPC.ChatParticipant) {
                this.groupSearchMap.put(((TLRPC.ChatParticipant) tLObject).user_id, tLObject);
            } else if (tLObject instanceof TLRPC.ChannelParticipant) {
                this.groupSearchMap.put(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer), tLObject);
            }
        }
        removeGroupSearchFromGlobal();
    }

    public void mergeResults(ArrayList arrayList) {
        mergeResults(arrayList, null);
    }

    public void mergeResults(ArrayList arrayList, ArrayList arrayList2) {
        TLRPC.Chat chat;
        this.localSearchResults = arrayList;
        this.localRecentResults = arrayList2;
        if (this.globalSearchMap.size() != 0) {
            if (arrayList == null && arrayList2 == null) {
                return;
            }
            int i = 0;
            int size = arrayList == null ? 0 : arrayList.size();
            int size2 = (arrayList2 == null ? 0 : arrayList2.size()) + size;
            while (i < size2) {
                Object obj = i < size ? arrayList.get(i) : arrayList2.get(i - size);
                if (obj instanceof DialogsSearchAdapter.RecentSearchObject) {
                    obj = ((DialogsSearchAdapter.RecentSearchObject) obj).object;
                }
                if (obj instanceof ShareAlert.DialogSearchResult) {
                    obj = ((ShareAlert.DialogSearchResult) obj).object;
                }
                if (obj instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) obj;
                    TLRPC.User user2 = (TLRPC.User) this.globalSearchMap.get(user.id);
                    if (user2 != null) {
                        this.globalSearch.remove(user2);
                        this.localServerSearch.remove(user2);
                        this.globalSearchMap.remove(user2.id);
                    }
                    TLObject tLObject = (TLObject) this.groupSearchMap.get(user.id);
                    if (tLObject != null) {
                        this.groupSearch.remove(tLObject);
                        this.groupSearchMap.remove(user.id);
                    }
                    Object obj2 = this.phoneSearchMap.get(user.id);
                    if (obj2 != null) {
                        this.phonesSearch.remove(obj2);
                        this.phoneSearchMap.remove(user.id);
                    }
                } else if ((obj instanceof TLRPC.Chat) && (chat = (TLRPC.Chat) this.globalSearchMap.get(-((TLRPC.Chat) obj).id)) != null) {
                    this.globalSearch.remove(chat);
                    this.localServerSearch.remove(chat);
                    this.globalSearchMap.remove(-chat.id);
                }
                i++;
            }
        }
    }

    public void mergeExcludeResults() {
        SearchAdapterHelperDelegate searchAdapterHelperDelegate = this.delegate;
        if (searchAdapterHelperDelegate == null) {
            return;
        }
        LongSparseArray excludeUsers = searchAdapterHelperDelegate.getExcludeUsers();
        if (excludeUsers != null) {
            int size = excludeUsers.size();
            for (int i = 0; i < size; i++) {
                TLRPC.User user = (TLRPC.User) this.globalSearchMap.get(excludeUsers.keyAt(i));
                if (user != null) {
                    this.globalSearch.remove(user);
                    this.localServerSearch.remove(user);
                    this.globalSearchMap.remove(user.id);
                }
            }
        }
        LongSparseArray excludeCallParticipants = this.delegate.getExcludeCallParticipants();
        if (excludeCallParticipants != null) {
            int size2 = excludeCallParticipants.size();
            for (int i2 = 0; i2 < size2; i2++) {
                TLRPC.User user2 = (TLRPC.User) this.globalSearchMap.get(excludeCallParticipants.keyAt(i2));
                if (user2 != null) {
                    this.globalSearch.remove(user2);
                    this.localServerSearch.remove(user2);
                    this.globalSearchMap.remove(user2.id);
                }
            }
        }
    }

    public void setDelegate(SearchAdapterHelperDelegate searchAdapterHelperDelegate) {
        this.delegate = searchAdapterHelperDelegate;
    }

    public void addHashtagsFromMessage(CharSequence charSequence) {
        if (charSequence == null) {
            return;
        }
        Matcher matcher = Pattern.compile("(^|\\s)#[^0-9][\\w@.]+").matcher(charSequence);
        boolean z = false;
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            if (charSequence.charAt(iStart) != '@' && charSequence.charAt(iStart) != '#') {
                iStart++;
            }
            String string = charSequence.subSequence(iStart, iEnd).toString();
            if (this.hashtagsByText == null) {
                this.hashtagsByText = new HashMap();
                this.hashtags = new ArrayList();
            }
            HashtagObject hashtagObject = (HashtagObject) this.hashtagsByText.get(string);
            if (hashtagObject == null) {
                hashtagObject = new HashtagObject();
                hashtagObject.hashtag = string;
                this.hashtagsByText.put(string, hashtagObject);
            } else {
                this.hashtags.remove(hashtagObject);
            }
            hashtagObject.date = (int) (System.currentTimeMillis() / 1000);
            this.hashtags.add(0, hashtagObject);
            z = true;
        }
        if (z) {
            putRecentHashtags(this.hashtags);
        }
    }

    private void putRecentHashtags(final ArrayList arrayList) {
        MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                SearchAdapterHelper.$r8$lambda$yYrJXyB58tDVkco8WH5pegNwkNg(this.f$0, arrayList);
            }
        });
    }

    public static void $r8$lambda$yYrJXyB58tDVkco8WH5pegNwkNg(SearchAdapterHelper searchAdapterHelper, ArrayList arrayList) {
        int i;
        searchAdapterHelper.getClass();
        try {
            MessagesStorage.getInstance(searchAdapterHelper.currentAccount).getDatabase().beginTransaction();
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = MessagesStorage.getInstance(searchAdapterHelper.currentAccount).getDatabase().executeFast("REPLACE INTO hashtag_recent_v2 VALUES(?, ?)");
            int i2 = 0;
            while (true) {
                if (i2 >= arrayList.size() || i2 == 100) {
                    break;
                    break;
                }
                HashtagObject hashtagObject = (HashtagObject) arrayList.get(i2);
                sQLitePreparedStatementExecuteFast.requery();
                sQLitePreparedStatementExecuteFast.bindString(1, hashtagObject.hashtag);
                sQLitePreparedStatementExecuteFast.bindInteger(2, hashtagObject.date);
                sQLitePreparedStatementExecuteFast.step();
                i2++;
            }
            sQLitePreparedStatementExecuteFast.dispose();
            if (arrayList.size() > 100) {
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast2 = MessagesStorage.getInstance(searchAdapterHelper.currentAccount).getDatabase().executeFast("DELETE FROM hashtag_recent_v2 WHERE id = ?");
                for (i = 100; i < arrayList.size(); i++) {
                    sQLitePreparedStatementExecuteFast2.requery();
                    sQLitePreparedStatementExecuteFast2.bindString(1, ((HashtagObject) arrayList.get(i)).hashtag);
                    sQLitePreparedStatementExecuteFast2.step();
                }
                sQLitePreparedStatementExecuteFast2.dispose();
            }
            MessagesStorage.getInstance(searchAdapterHelper.currentAccount).getDatabase().commitTransaction();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void removeUserId(long j) {
        Object obj = this.globalSearchMap.get(j);
        if (obj != null) {
            this.globalSearch.remove(obj);
        }
        Object obj2 = this.groupSearchMap.get(j);
        if (obj2 != null) {
            this.groupSearch.remove(obj2);
        }
    }

    public ArrayList getGlobalSearch() {
        return this.globalSearch;
    }

    public ArrayList getPhoneSearch() {
        return this.phonesSearch;
    }

    public ArrayList getLocalServerSearch() {
        return this.localServerSearch;
    }

    public ArrayList getGroupSearch() {
        return this.groupSearch;
    }

    public ArrayList getHashtags() {
        return this.hashtags;
    }

    public String getLastFoundUsername() {
        return this.lastFoundUsername;
    }

    public String getLastFoundChannel() {
        return this.lastFoundChannel;
    }

    public void clearRecentHashtags() {
        this.hashtags = new ArrayList();
        this.hashtagsByText = new HashMap();
        MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                SearchAdapterHelper.$r8$lambda$op9OD6mP0NzCaMyD4RoNNN3tvF8(this.f$0);
            }
        });
    }

    public static void $r8$lambda$op9OD6mP0NzCaMyD4RoNNN3tvF8(SearchAdapterHelper searchAdapterHelper) {
        searchAdapterHelper.getClass();
        try {
            MessagesStorage.getInstance(searchAdapterHelper.currentAccount).getDatabase().executeFast("DELETE FROM hashtag_recent_v2 WHERE 1").stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void setHashtags(ArrayList arrayList, HashMap map) {
        this.hashtags = arrayList;
        this.hashtagsByText = map;
        this.hashtagsLoadedFromDb = true;
        this.delegate.onSetHashtags(arrayList, map);
    }
}
