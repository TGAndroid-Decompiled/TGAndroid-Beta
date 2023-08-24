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
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$ChannelParticipant;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatParticipant;
import org.telegram.tgnet.TLRPC$Peer;
import org.telegram.tgnet.TLRPC$TL_channels_channelParticipants;
import org.telegram.tgnet.TLRPC$TL_contacts_found;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_groupCallParticipant;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.Adapters.DialogsSearchAdapter;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Components.ShareAlert;
public class SearchAdapterHelper {
    private boolean allResultsAreGlobal;
    private SearchAdapterHelperDelegate delegate;
    private ArrayList<HashtagObject> hashtags;
    private HashMap<String, HashtagObject> hashtagsByText;
    private String lastFoundChannel;
    private ArrayList<DialogsSearchAdapter.RecentSearchObject> localRecentResults;
    private ArrayList<Object> localSearchResults;
    private final ArrayList<Integer> pendingRequestIds = new ArrayList<>();
    private String lastFoundUsername = null;
    private final ArrayList<TLObject> localServerSearch = new ArrayList<>();
    private final ArrayList<TLObject> globalSearch = new ArrayList<>();
    private final LongSparseArray<TLObject> globalSearchMap = new LongSparseArray<>();
    private final ArrayList<TLObject> groupSearch = new ArrayList<>();
    private final LongSparseArray<TLObject> groupSearchMap = new LongSparseArray<>();
    private final LongSparseArray<TLObject> phoneSearchMap = new LongSparseArray<>();
    private final ArrayList<Object> phonesSearch = new ArrayList<>();
    private int currentAccount = UserConfig.selectedAccount;
    private boolean allowGlobalResults = true;
    private boolean hashtagsLoadedFromDb = false;

    public static class HashtagObject {
        int date;
        String hashtag;
    }

    public interface SearchAdapterHelperDelegate {

        public final class CC {
            public static boolean $default$canApplySearchResults(SearchAdapterHelperDelegate searchAdapterHelperDelegate, int i) {
                return true;
            }

            public static LongSparseArray $default$getExcludeCallParticipants(SearchAdapterHelperDelegate searchAdapterHelperDelegate) {
                return null;
            }

            public static LongSparseArray $default$getExcludeUsers(SearchAdapterHelperDelegate searchAdapterHelperDelegate) {
                return null;
            }

            public static void $default$onSetHashtags(SearchAdapterHelperDelegate searchAdapterHelperDelegate, ArrayList arrayList, HashMap hashMap) {
            }
        }

        boolean canApplySearchResults(int i);

        LongSparseArray<TLRPC$TL_groupCallParticipant> getExcludeCallParticipants();

        LongSparseArray<TLRPC$User> getExcludeUsers();

        void onDataSetChanged(int i);

        void onSetHashtags(ArrayList<HashtagObject> arrayList, HashMap<String, HashtagObject> hashMap);
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

    public void queryServerSearch(final java.lang.String r18, boolean r19, final boolean r20, final boolean r21, final boolean r22, final boolean r23, long r24, boolean r26, int r27, final int r28, final long r29, final java.lang.Runnable r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Adapters.SearchAdapterHelper.queryServerSearch(java.lang.String, boolean, boolean, boolean, boolean, boolean, long, boolean, int, int, long, java.lang.Runnable):void");
    }

    public void lambda$queryServerSearch$0(String str, boolean z, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            TLRPC$TL_channels_channelParticipants tLRPC$TL_channels_channelParticipants = (TLRPC$TL_channels_channelParticipants) tLObject;
            this.lastFoundChannel = str.toLowerCase();
            MessagesController.getInstance(this.currentAccount).putUsers(tLRPC$TL_channels_channelParticipants.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tLRPC$TL_channels_channelParticipants.chats, false);
            this.groupSearch.clear();
            this.groupSearchMap.clear();
            this.groupSearch.addAll(tLRPC$TL_channels_channelParticipants.participants);
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            int size = tLRPC$TL_channels_channelParticipants.participants.size();
            for (int i = 0; i < size; i++) {
                TLRPC$ChannelParticipant tLRPC$ChannelParticipant = tLRPC$TL_channels_channelParticipants.participants.get(i);
                long peerId = MessageObject.getPeerId(tLRPC$ChannelParticipant.peer);
                if (!z && peerId == clientUserId) {
                    this.groupSearch.remove(tLRPC$ChannelParticipant);
                } else {
                    this.groupSearchMap.put(peerId, tLRPC$ChannelParticipant);
                }
            }
        }
    }

    public void lambda$queryServerSearch$1(int i, boolean z, boolean z2, boolean z3, boolean z4, long j, String str, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        TLRPC$Chat tLRPC$Chat;
        TLRPC$User tLRPC$User;
        ArrayList<TLRPC$Peer> arrayList;
        TLRPC$Chat tLRPC$Chat2;
        TLRPC$User tLRPC$User2;
        if (this.delegate.canApplySearchResults(i) && tLRPC$TL_error == null) {
            TLRPC$TL_contacts_found tLRPC$TL_contacts_found = (TLRPC$TL_contacts_found) tLObject;
            this.globalSearch.clear();
            this.globalSearchMap.clear();
            this.localServerSearch.clear();
            MessagesController.getInstance(this.currentAccount).putChats(tLRPC$TL_contacts_found.chats, false);
            MessagesController.getInstance(this.currentAccount).putUsers(tLRPC$TL_contacts_found.users, false);
            MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(tLRPC$TL_contacts_found.users, tLRPC$TL_contacts_found.chats, true, true);
            LongSparseArray longSparseArray = new LongSparseArray();
            LongSparseArray longSparseArray2 = new LongSparseArray();
            for (int i2 = 0; i2 < tLRPC$TL_contacts_found.chats.size(); i2++) {
                TLRPC$Chat tLRPC$Chat3 = tLRPC$TL_contacts_found.chats.get(i2);
                longSparseArray.put(tLRPC$Chat3.id, tLRPC$Chat3);
            }
            for (int i3 = 0; i3 < tLRPC$TL_contacts_found.users.size(); i3++) {
                TLRPC$User tLRPC$User3 = tLRPC$TL_contacts_found.users.get(i3);
                longSparseArray2.put(tLRPC$User3.id, tLRPC$User3);
            }
            for (int i4 = 0; i4 < 2; i4++) {
                if (i4 == 0) {
                    if (this.allResultsAreGlobal) {
                        arrayList = tLRPC$TL_contacts_found.my_results;
                    }
                } else {
                    arrayList = tLRPC$TL_contacts_found.results;
                }
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    TLRPC$Peer tLRPC$Peer = arrayList.get(i5);
                    long j2 = tLRPC$Peer.user_id;
                    if (j2 != 0) {
                        tLRPC$User2 = (TLRPC$User) longSparseArray2.get(j2);
                        tLRPC$Chat2 = null;
                    } else {
                        long j3 = tLRPC$Peer.chat_id;
                        if (j3 != 0) {
                            tLRPC$Chat2 = (TLRPC$Chat) longSparseArray.get(j3);
                        } else {
                            long j4 = tLRPC$Peer.channel_id;
                            if (j4 != 0) {
                                tLRPC$Chat2 = (TLRPC$Chat) longSparseArray.get(j4);
                            } else {
                                tLRPC$Chat2 = null;
                                tLRPC$User2 = null;
                            }
                        }
                        tLRPC$User2 = null;
                    }
                    if (tLRPC$Chat2 != null) {
                        if (z && ((!z2 || ChatObject.canAddBotsToChat(tLRPC$Chat2)) && ((this.allowGlobalResults || !ChatObject.isNotInChat(tLRPC$Chat2)) && filter(tLRPC$Chat2)))) {
                            this.globalSearch.add(tLRPC$Chat2);
                            this.globalSearchMap.put(-tLRPC$Chat2.id, tLRPC$Chat2);
                        }
                    } else if (tLRPC$User2 != null && !z2 && ((z3 || !tLRPC$User2.bot) && ((z4 || !tLRPC$User2.self) && ((this.allowGlobalResults || i4 != 1 || tLRPC$User2.contact) && filter(tLRPC$User2))))) {
                        this.globalSearch.add(tLRPC$User2);
                        this.globalSearchMap.put(tLRPC$User2.id, tLRPC$User2);
                    }
                }
            }
            if (!this.allResultsAreGlobal) {
                for (int i6 = 0; i6 < tLRPC$TL_contacts_found.my_results.size(); i6++) {
                    TLRPC$Peer tLRPC$Peer2 = tLRPC$TL_contacts_found.my_results.get(i6);
                    long j5 = tLRPC$Peer2.user_id;
                    if (j5 != 0) {
                        tLRPC$User = (TLRPC$User) longSparseArray2.get(j5);
                        tLRPC$Chat = null;
                    } else {
                        long j6 = tLRPC$Peer2.chat_id;
                        if (j6 != 0) {
                            tLRPC$Chat = (TLRPC$Chat) longSparseArray.get(j6);
                        } else {
                            long j7 = tLRPC$Peer2.channel_id;
                            if (j7 != 0) {
                                tLRPC$Chat = (TLRPC$Chat) longSparseArray.get(j7);
                            } else {
                                tLRPC$Chat = null;
                                tLRPC$User = null;
                            }
                        }
                        tLRPC$User = null;
                    }
                    if (tLRPC$Chat != null) {
                        if (z && ((!z2 || ChatObject.canAddBotsToChat(tLRPC$Chat)) && (-tLRPC$Chat.id) != j && filter(tLRPC$Chat))) {
                            this.localServerSearch.add(tLRPC$Chat);
                            this.globalSearchMap.put(-tLRPC$Chat.id, tLRPC$Chat);
                        }
                    } else if (tLRPC$User != null && !z2 && ((z3 || !tLRPC$User.bot) && ((z4 || !tLRPC$User.self) && tLRPC$User.id != j && filter(tLRPC$User)))) {
                        this.localServerSearch.add(tLRPC$User);
                        this.globalSearchMap.put(tLRPC$User.id, tLRPC$User);
                    }
                }
            }
            this.lastFoundUsername = str.toLowerCase();
        }
    }

    public void lambda$queryServerSearch$3(final ArrayList arrayList, final int i, final AtomicInteger atomicInteger, final AtomicInteger atomicInteger2, final ArrayList arrayList2, final int i2, final Runnable runnable, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SearchAdapterHelper.this.lambda$queryServerSearch$2(arrayList, i, tLObject, tLRPC$TL_error, atomicInteger, atomicInteger2, arrayList2, i2, runnable);
            }
        });
    }

    public void lambda$queryServerSearch$2(ArrayList arrayList, int i, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, ArrayList arrayList2, int i2, Runnable runnable) {
        arrayList.set(i, new Pair(tLObject, tLRPC$TL_error));
        Integer valueOf = Integer.valueOf(atomicInteger.get());
        if (this.pendingRequestIds.contains(valueOf)) {
            this.pendingRequestIds.remove(valueOf);
            if (atomicInteger2.incrementAndGet() == arrayList2.size()) {
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    RequestDelegate requestDelegate = (RequestDelegate) ((Pair) arrayList2.get(i3)).second;
                    Pair pair = (Pair) arrayList.get(i3);
                    if (pair != null) {
                        requestDelegate.run((TLObject) pair.first, (TLRPC$TL_error) pair.second);
                    }
                }
                removeGroupSearchFromGlobal();
                ArrayList<Object> arrayList3 = this.localSearchResults;
                if (arrayList3 != null) {
                    mergeResults(arrayList3, this.localRecentResults);
                }
                mergeExcludeResults();
                this.delegate.onDataSetChanged(i2);
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
            TLRPC$User tLRPC$User = (TLRPC$User) this.globalSearchMap.get(this.groupSearchMap.keyAt(i));
            if (tLRPC$User != null) {
                this.globalSearch.remove(tLRPC$User);
                this.localServerSearch.remove(tLRPC$User);
                this.globalSearchMap.remove(tLRPC$User.id);
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
                SearchAdapterHelper.this.lambda$loadRecentHashtags$6();
            }
        });
        return false;
    }

    public void lambda$loadRecentHashtags$6() {
        try {
            SQLiteCursor queryFinalized = MessagesStorage.getInstance(this.currentAccount).getDatabase().queryFinalized("SELECT id, date FROM hashtag_recent_v2 WHERE 1", new Object[0]);
            final ArrayList arrayList = new ArrayList();
            final HashMap hashMap = new HashMap();
            while (queryFinalized.next()) {
                HashtagObject hashtagObject = new HashtagObject();
                hashtagObject.hashtag = queryFinalized.stringValue(0);
                hashtagObject.date = queryFinalized.intValue(1);
                arrayList.add(hashtagObject);
                hashMap.put(hashtagObject.hashtag, hashtagObject);
            }
            queryFinalized.dispose();
            Collections.sort(arrayList, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    int lambda$loadRecentHashtags$4;
                    lambda$loadRecentHashtags$4 = SearchAdapterHelper.lambda$loadRecentHashtags$4((SearchAdapterHelper.HashtagObject) obj, (SearchAdapterHelper.HashtagObject) obj2);
                    return lambda$loadRecentHashtags$4;
                }
            });
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    SearchAdapterHelper.this.lambda$loadRecentHashtags$5(arrayList, hashMap);
                }
            });
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static int lambda$loadRecentHashtags$4(HashtagObject hashtagObject, HashtagObject hashtagObject2) {
        int i = hashtagObject.date;
        int i2 = hashtagObject2.date;
        if (i < i2) {
            return 1;
        }
        return i > i2 ? -1 : 0;
    }

    public void addGroupMembers(ArrayList<TLObject> arrayList) {
        this.groupSearch.clear();
        this.groupSearch.addAll(arrayList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            TLObject tLObject = arrayList.get(i);
            if (tLObject instanceof TLRPC$ChatParticipant) {
                this.groupSearchMap.put(((TLRPC$ChatParticipant) tLObject).user_id, tLObject);
            } else if (tLObject instanceof TLRPC$ChannelParticipant) {
                this.groupSearchMap.put(MessageObject.getPeerId(((TLRPC$ChannelParticipant) tLObject).peer), tLObject);
            }
        }
        removeGroupSearchFromGlobal();
    }

    public void mergeResults(ArrayList<Object> arrayList) {
        mergeResults(arrayList, null);
    }

    public void mergeResults(ArrayList<Object> arrayList, ArrayList<DialogsSearchAdapter.RecentSearchObject> arrayList2) {
        TLRPC$Chat tLRPC$Chat;
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
                if (obj instanceof TLRPC$User) {
                    TLRPC$User tLRPC$User = (TLRPC$User) obj;
                    TLRPC$User tLRPC$User2 = (TLRPC$User) this.globalSearchMap.get(tLRPC$User.id);
                    if (tLRPC$User2 != null) {
                        this.globalSearch.remove(tLRPC$User2);
                        this.localServerSearch.remove(tLRPC$User2);
                        this.globalSearchMap.remove(tLRPC$User2.id);
                    }
                    TLObject tLObject = this.groupSearchMap.get(tLRPC$User.id);
                    if (tLObject != null) {
                        this.groupSearch.remove(tLObject);
                        this.groupSearchMap.remove(tLRPC$User.id);
                    }
                    TLObject tLObject2 = this.phoneSearchMap.get(tLRPC$User.id);
                    if (tLObject2 != null) {
                        this.phonesSearch.remove(tLObject2);
                        this.phoneSearchMap.remove(tLRPC$User.id);
                    }
                } else if ((obj instanceof TLRPC$Chat) && (tLRPC$Chat = (TLRPC$Chat) this.globalSearchMap.get(-((TLRPC$Chat) obj).id)) != null) {
                    this.globalSearch.remove(tLRPC$Chat);
                    this.localServerSearch.remove(tLRPC$Chat);
                    this.globalSearchMap.remove(-tLRPC$Chat.id);
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
        LongSparseArray<TLRPC$User> excludeUsers = searchAdapterHelperDelegate.getExcludeUsers();
        if (excludeUsers != null) {
            int size = excludeUsers.size();
            for (int i = 0; i < size; i++) {
                TLRPC$User tLRPC$User = (TLRPC$User) this.globalSearchMap.get(excludeUsers.keyAt(i));
                if (tLRPC$User != null) {
                    this.globalSearch.remove(tLRPC$User);
                    this.localServerSearch.remove(tLRPC$User);
                    this.globalSearchMap.remove(tLRPC$User.id);
                }
            }
        }
        LongSparseArray<TLRPC$TL_groupCallParticipant> excludeCallParticipants = this.delegate.getExcludeCallParticipants();
        if (excludeCallParticipants != null) {
            int size2 = excludeCallParticipants.size();
            for (int i2 = 0; i2 < size2; i2++) {
                TLRPC$User tLRPC$User2 = (TLRPC$User) this.globalSearchMap.get(excludeCallParticipants.keyAt(i2));
                if (tLRPC$User2 != null) {
                    this.globalSearch.remove(tLRPC$User2);
                    this.localServerSearch.remove(tLRPC$User2);
                    this.globalSearchMap.remove(tLRPC$User2.id);
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
            int start = matcher.start();
            int end = matcher.end();
            if (charSequence.charAt(start) != '@' && charSequence.charAt(start) != '#') {
                start++;
            }
            String charSequence2 = charSequence.subSequence(start, end).toString();
            if (this.hashtagsByText == null) {
                this.hashtagsByText = new HashMap<>();
                this.hashtags = new ArrayList<>();
            }
            HashtagObject hashtagObject = this.hashtagsByText.get(charSequence2);
            if (hashtagObject == null) {
                hashtagObject = new HashtagObject();
                hashtagObject.hashtag = charSequence2;
                this.hashtagsByText.put(charSequence2, hashtagObject);
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

    private void putRecentHashtags(final ArrayList<HashtagObject> arrayList) {
        MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                SearchAdapterHelper.this.lambda$putRecentHashtags$7(arrayList);
            }
        });
    }

    public void lambda$putRecentHashtags$7(ArrayList arrayList) {
        int i;
        try {
            MessagesStorage.getInstance(this.currentAccount).getDatabase().beginTransaction();
            SQLitePreparedStatement executeFast = MessagesStorage.getInstance(this.currentAccount).getDatabase().executeFast("REPLACE INTO hashtag_recent_v2 VALUES(?, ?)");
            int i2 = 0;
            while (true) {
                if (i2 >= arrayList.size() || i2 == 100) {
                    break;
                }
                HashtagObject hashtagObject = (HashtagObject) arrayList.get(i2);
                executeFast.requery();
                executeFast.bindString(1, hashtagObject.hashtag);
                executeFast.bindInteger(2, hashtagObject.date);
                executeFast.step();
                i2++;
            }
            executeFast.dispose();
            if (arrayList.size() > 100) {
                SQLitePreparedStatement executeFast2 = MessagesStorage.getInstance(this.currentAccount).getDatabase().executeFast("DELETE FROM hashtag_recent_v2 WHERE id = ?");
                for (i = 100; i < arrayList.size(); i++) {
                    executeFast2.requery();
                    executeFast2.bindString(1, ((HashtagObject) arrayList.get(i)).hashtag);
                    executeFast2.step();
                }
                executeFast2.dispose();
            }
            MessagesStorage.getInstance(this.currentAccount).getDatabase().commitTransaction();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void removeUserId(long j) {
        TLObject tLObject = this.globalSearchMap.get(j);
        if (tLObject != null) {
            this.globalSearch.remove(tLObject);
        }
        TLObject tLObject2 = this.groupSearchMap.get(j);
        if (tLObject2 != null) {
            this.groupSearch.remove(tLObject2);
        }
    }

    public ArrayList<TLObject> getGlobalSearch() {
        return this.globalSearch;
    }

    public ArrayList<Object> getPhoneSearch() {
        return this.phonesSearch;
    }

    public ArrayList<TLObject> getLocalServerSearch() {
        return this.localServerSearch;
    }

    public ArrayList<TLObject> getGroupSearch() {
        return this.groupSearch;
    }

    public ArrayList<HashtagObject> getHashtags() {
        return this.hashtags;
    }

    public String getLastFoundUsername() {
        return this.lastFoundUsername;
    }

    public String getLastFoundChannel() {
        return this.lastFoundChannel;
    }

    public void clearRecentHashtags() {
        this.hashtags = new ArrayList<>();
        this.hashtagsByText = new HashMap<>();
        MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                SearchAdapterHelper.this.lambda$clearRecentHashtags$8();
            }
        });
    }

    public void lambda$clearRecentHashtags$8() {
        try {
            MessagesStorage.getInstance(this.currentAccount).getDatabase().executeFast("DELETE FROM hashtag_recent_v2 WHERE 1").stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$loadRecentHashtags$5(ArrayList<HashtagObject> arrayList, HashMap<String, HashtagObject> hashMap) {
        this.hashtags = arrayList;
        this.hashtagsByText = hashMap;
        this.hashtagsLoadedFromDb = true;
        this.delegate.onSetHashtags(arrayList, hashMap);
    }
}
