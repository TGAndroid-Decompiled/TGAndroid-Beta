package org.telegram.ui.Adapters;

import android.util.Pair;
import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda8;
import org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda13;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.DialogsActivity$50$$ExternalSyntheticLambda2;

public class SearchAdapterHelper {
    public final boolean allResultsAreGlobal;
    public SearchAdapterHelperDelegate delegate;
    public ArrayList hashtags;
    public HashMap hashtagsByText;
    public String lastFoundChannel;
    public ArrayList localRecentResults;
    public ArrayList localSearchResults;
    public final ArrayList pendingRequestIds = new ArrayList();
    public String lastFoundUsername = null;
    public final ArrayList localServerSearch = new ArrayList();
    public final ArrayList globalSearch = new ArrayList();
    public final LongSparseArray globalSearchMap = new LongSparseArray();
    public final ArrayList groupSearch = new ArrayList();
    public final LongSparseArray groupSearchMap = new LongSparseArray();
    public final LongSparseArray phoneSearchMap = new LongSparseArray();
    public final ArrayList phonesSearch = new ArrayList();
    public final int currentAccount = UserConfig.selectedAccount;
    public boolean allowGlobalResults = true;
    public boolean hashtagsLoadedFromDb = false;

    public final class HashtagObject {
        public int date;
        public String hashtag;
    }

    public interface SearchAdapterHelperDelegate {
        boolean canApplySearchResults(int i);

        LongSparseArray getExcludeCallParticipants();

        void getExcludeUsers();

        void onDataSetChanged(int i);

        void onSetHashtags(ArrayList arrayList);
    }

    public SearchAdapterHelper(boolean z) {
        this.allResultsAreGlobal = z;
    }

    public final void addHashtagsFromMessage(CharSequence charSequence) {
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
            MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new ArticleViewer$$ExternalSyntheticLambda8(6, this, this.hashtags));
        }
    }

    public final void clear() {
        this.globalSearch.clear();
        this.globalSearchMap.clear();
        this.localServerSearch.clear();
    }

    public final void clearRecentHashtags() {
        this.hashtags = new ArrayList();
        this.hashtagsByText = new HashMap();
        MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new SearchAdapterHelper$$ExternalSyntheticLambda4(this, 0));
    }

    public boolean filter(TLObject tLObject) {
        return true;
    }

    public final boolean isSearchInProgress() {
        return this.pendingRequestIds.size() > 0;
    }

    public final void mergeResults(ArrayList arrayList, ArrayList arrayList2) {
        TLRPC.Chat chat;
        this.localSearchResults = arrayList;
        this.localRecentResults = arrayList2;
        LongSparseArray longSparseArray = this.globalSearchMap;
        if (longSparseArray.size() != 0) {
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
                boolean z = obj instanceof TLRPC.User;
                ArrayList arrayList3 = this.localServerSearch;
                ArrayList arrayList4 = this.globalSearch;
                if (z) {
                    TLRPC.User user = (TLRPC.User) obj;
                    TLRPC.User user2 = (TLRPC.User) longSparseArray.get(user.id);
                    if (user2 != null) {
                        arrayList4.remove(user2);
                        arrayList3.remove(user2);
                        longSparseArray.remove(user2.id);
                    }
                    long j = user.id;
                    LongSparseArray longSparseArray2 = this.groupSearchMap;
                    TLObject tLObject = (TLObject) longSparseArray2.get(j);
                    if (tLObject != null) {
                        this.groupSearch.remove(tLObject);
                        longSparseArray2.remove(user.id);
                    }
                    long j2 = user.id;
                    LongSparseArray longSparseArray3 = this.phoneSearchMap;
                    Object obj2 = longSparseArray3.get(j2);
                    if (obj2 != null) {
                        this.phonesSearch.remove(obj2);
                        longSparseArray3.remove(user.id);
                    }
                } else if ((obj instanceof TLRPC.Chat) && (chat = (TLRPC.Chat) longSparseArray.get(-((TLRPC.Chat) obj).id)) != null) {
                    arrayList4.remove(chat);
                    arrayList3.remove(chat);
                    longSparseArray.remove(-chat.id);
                }
                i++;
            }
        }
    }

    public final void queryServerSearch(final String str, boolean z, final boolean z2, final boolean z3, boolean z4, final boolean z5, long j, boolean z6, int i, final int i2, final long j2, final ChatUsersActivity$$ExternalSyntheticLambda13 chatUsersActivity$$ExternalSyntheticLambda13) {
        int i3;
        boolean z7;
        boolean z8;
        boolean z9;
        String str2;
        ArrayList arrayList = this.pendingRequestIds;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            i3 = this.currentAccount;
            if (i4 >= size) {
                break;
            }
            Object obj = arrayList.get(i4);
            i4++;
            ConnectionsManager.getInstance(i3).cancelRequest(((Integer) obj).intValue(), true);
        }
        arrayList.clear();
        ArrayList arrayList2 = this.localServerSearch;
        ArrayList arrayList3 = this.globalSearch;
        ArrayList arrayList4 = this.groupSearch;
        ArrayList arrayList5 = this.phonesSearch;
        LongSparseArray longSparseArray = this.globalSearchMap;
        LongSparseArray longSparseArray2 = this.groupSearchMap;
        LongSparseArray longSparseArray3 = this.phoneSearchMap;
        if (str == null) {
            arrayList4.clear();
            longSparseArray2.clear();
            arrayList3.clear();
            longSparseArray.clear();
            arrayList2.clear();
            arrayList5.clear();
            longSparseArray3.clear();
            this.delegate.onDataSetChanged(i2);
            return;
        }
        ArrayList arrayList6 = new ArrayList();
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
                tL_channels_getParticipants.channel = MessagesController.getInstance(i3).getInputChannel(j);
                z7 = z4;
                arrayList6.add(new Pair(tL_channels_getParticipants, new DialogsActivity$50$$ExternalSyntheticLambda2(this, str, z7, 1)));
            } else {
                z7 = z4;
                this.lastFoundChannel = str.toLowerCase();
            }
            z8 = false;
        } else {
            z7 = z4;
            arrayList4.clear();
            longSparseArray2.clear();
            z8 = true;
        }
        if (!z) {
            z9 = z8;
        } else if (str.length() > 0) {
            TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
            tL_contacts_search.q = str;
            tL_contacts_search.limit = 20;
            final boolean z10 = z7;
            arrayList6.add(new Pair(tL_contacts_search, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    boolean z11;
                    boolean z12;
                    boolean z13;
                    boolean z14;
                    boolean z15;
                    TLRPC.Chat chat;
                    TLRPC.User user;
                    LongSparseArray longSparseArray4;
                    LongSparseArray longSparseArray5;
                    ArrayList<TLRPC.Peer> arrayList7;
                    TLRPC.Chat chat2;
                    TLRPC.User user2;
                    SearchAdapterHelper searchAdapterHelper = this.f$0;
                    if (searchAdapterHelper.delegate.canApplySearchResults(i2) && tL_error == null) {
                        TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                        ArrayList arrayList8 = searchAdapterHelper.globalSearch;
                        arrayList8.clear();
                        LongSparseArray longSparseArray6 = searchAdapterHelper.globalSearchMap;
                        longSparseArray6.clear();
                        ArrayList arrayList9 = searchAdapterHelper.localServerSearch;
                        arrayList9.clear();
                        int i5 = searchAdapterHelper.currentAccount;
                        MessagesController.getInstance(i5).putChats(tL_contacts_found.chats, false);
                        MessagesController.getInstance(i5).putUsers(tL_contacts_found.users, false);
                        MessagesStorage.getInstance(i5).putUsersAndChats(tL_contacts_found.users, tL_contacts_found.chats, true, true);
                        LongSparseArray longSparseArray7 = new LongSparseArray();
                        LongSparseArray longSparseArray8 = new LongSparseArray();
                        for (int i6 = 0; i6 < tL_contacts_found.chats.size(); i6++) {
                            TLRPC.Chat chat3 = tL_contacts_found.chats.get(i6);
                            longSparseArray7.put(chat3, chat3.id);
                        }
                        for (int i7 = 0; i7 < tL_contacts_found.users.size(); i7++) {
                            TLRPC.User user3 = tL_contacts_found.users.get(i7);
                            longSparseArray8.put(user3, user3.id);
                        }
                        int i8 = 0;
                        while (true) {
                            z11 = z2;
                            z12 = z5;
                            z13 = z3;
                            z14 = z10;
                            z15 = searchAdapterHelper.allResultsAreGlobal;
                            if (i8 >= 2) {
                                break;
                            }
                            if (i8 == 0) {
                                if (z15) {
                                    arrayList7 = tL_contacts_found.my_results;
                                }
                                i8++;
                            } else {
                                arrayList7 = tL_contacts_found.results;
                            }
                            int i9 = 0;
                            while (i9 < arrayList7.size()) {
                                TLRPC.Peer peer = arrayList7.get(i9);
                                boolean z16 = z11;
                                boolean z17 = z12;
                                long j3 = peer.user_id;
                                if (j3 != 0) {
                                    user2 = (TLRPC.User) longSparseArray8.get(j3);
                                    chat2 = null;
                                } else {
                                    long j4 = peer.chat_id;
                                    if (j4 != 0) {
                                        chat2 = (TLRPC.Chat) longSparseArray7.get(j4);
                                    } else {
                                        long j5 = peer.channel_id;
                                        if (j5 != 0) {
                                            chat2 = (TLRPC.Chat) longSparseArray7.get(j5);
                                        } else {
                                            chat2 = null;
                                            user2 = null;
                                        }
                                    }
                                    user2 = null;
                                }
                                if (chat2 == null) {
                                    if (user2 != null && !z17 && ((z13 || !user2.bot) && (z14 || !user2.self))) {
                                        if (searchAdapterHelper.allowGlobalResults || i8 != 1 || user2.contact) {
                                            if (searchAdapterHelper.filter(user2)) {
                                                arrayList8.add(user2);
                                                longSparseArray6.put(user2, user2.id);
                                            }
                                        }
                                    }
                                    i9++;
                                    arrayList7 = arrayList7;
                                    i8 = i8;
                                    z11 = z16;
                                    z12 = z17;
                                } else if (z16 && ((!z17 || ChatObject.canAddBotsToChat(chat2)) && ((searchAdapterHelper.allowGlobalResults || !ChatObject.isNotInChat(chat2)) && searchAdapterHelper.filter(chat2)))) {
                                    arrayList8.add(chat2);
                                    longSparseArray6.put(chat2, -chat2.id);
                                }
                                i9++;
                                arrayList7 = arrayList7;
                                i8 = i8;
                                z11 = z16;
                                z12 = z17;
                            }
                            i8++;
                        }
                        if (!z15) {
                            int i10 = 0;
                            while (i10 < tL_contacts_found.my_results.size()) {
                                TLRPC.Peer peer2 = tL_contacts_found.my_results.get(i10);
                                long j6 = peer2.user_id;
                                if (j6 != 0) {
                                    user = (TLRPC.User) longSparseArray8.get(j6);
                                    chat = null;
                                } else {
                                    long j7 = peer2.chat_id;
                                    if (j7 != 0) {
                                        chat = (TLRPC.Chat) longSparseArray7.get(j7);
                                    } else {
                                        long j8 = peer2.channel_id;
                                        if (j8 != 0) {
                                            chat = (TLRPC.Chat) longSparseArray7.get(j8);
                                        } else {
                                            chat = null;
                                            user = null;
                                        }
                                    }
                                    user = null;
                                }
                                long j9 = j2;
                                if (chat == null) {
                                    longSparseArray4 = longSparseArray7;
                                    longSparseArray5 = longSparseArray8;
                                    if (user != null && !z12 && ((z13 || !user.bot) && ((z14 || !user.self) && user.id != j9 && searchAdapterHelper.filter(user)))) {
                                        arrayList9.add(user);
                                        longSparseArray6.put(user, user.id);
                                    }
                                } else if (!z11 || (z12 && !ChatObject.canAddBotsToChat(chat))) {
                                    longSparseArray4 = longSparseArray7;
                                    longSparseArray5 = longSparseArray8;
                                } else {
                                    longSparseArray4 = longSparseArray7;
                                    longSparseArray5 = longSparseArray8;
                                    if ((-chat.id) != j9 && searchAdapterHelper.filter(chat)) {
                                        arrayList9.add(chat);
                                        longSparseArray6.put(chat, -chat.id);
                                    }
                                }
                                i10++;
                                longSparseArray7 = longSparseArray4;
                                longSparseArray8 = longSparseArray5;
                            }
                        }
                        searchAdapterHelper.lastFoundUsername = str.toLowerCase();
                    }
                }
            }));
            z9 = z8;
        } else {
            arrayList3.clear();
            longSparseArray.clear();
            arrayList2.clear();
            z9 = false;
        }
        if (!z5 && z6 && str.startsWith("+") && str.length() > 3) {
            arrayList5.clear();
            longSparseArray3.clear();
            String strStripExceptNumbers = PhoneFormat.stripExceptNumbers(str, false);
            ArrayList<TLRPC.TL_contact> arrayList7 = ContactsController.getInstance(i3).contacts;
            int size2 = arrayList7.size();
            boolean z11 = false;
            for (int i5 = 0; i5 < size2; i5++) {
                TLRPC.User user = MessagesController.getInstance(i3).getUser(Long.valueOf(arrayList7.get(i5).user_id));
                if (user != null && (str2 = user.phone) != null && str2.startsWith(strStripExceptNumbers)) {
                    if (!z11) {
                        z11 = user.phone.length() == strStripExceptNumbers.length();
                    }
                    arrayList5.add(user);
                    longSparseArray3.put(user, user.id);
                }
            }
            if (!z11) {
                arrayList5.add("section");
                arrayList5.add(strStripExceptNumbers);
            }
            z9 = false;
        }
        AtomicInteger atomicInteger = new AtomicInteger(0);
        ArrayList arrayList8 = new ArrayList();
        int i6 = 0;
        while (i6 < arrayList6.size()) {
            TLObject tLObject = (TLObject) ((Pair) arrayList6.get(i6)).first;
            arrayList8.add(null);
            final AtomicInteger atomicInteger2 = new AtomicInteger();
            final AtomicInteger atomicInteger3 = atomicInteger;
            final ArrayList arrayList9 = arrayList8;
            final int i7 = i6;
            final ArrayList arrayList10 = arrayList6;
            atomicInteger2.set(ConnectionsManager.getInstance(i3).sendRequest(tLObject, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                    final SearchAdapterHelper searchAdapterHelper = this.f$0;
                    searchAdapterHelper.getClass();
                    final ArrayList arrayList11 = arrayList9;
                    final AtomicInteger atomicInteger4 = atomicInteger2;
                    final AtomicInteger atomicInteger5 = atomicInteger3;
                    final ArrayList arrayList12 = arrayList10;
                    final int i8 = i2;
                    final ChatUsersActivity$$ExternalSyntheticLambda13 chatUsersActivity$$ExternalSyntheticLambda14 = chatUsersActivity$$ExternalSyntheticLambda13;
                    final int i9 = i7;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            SearchAdapterHelper searchAdapterHelper2 = searchAdapterHelper;
                            searchAdapterHelper2.getClass();
                            Pair pair = new Pair(tLObject2, tL_error);
                            ArrayList arrayList13 = arrayList11;
                            arrayList13.set(i9, pair);
                            Integer numValueOf = Integer.valueOf(atomicInteger4.get());
                            ArrayList arrayList14 = searchAdapterHelper2.pendingRequestIds;
                            if (arrayList14.contains(numValueOf)) {
                                arrayList14.remove(numValueOf);
                                int iIncrementAndGet = atomicInteger5.incrementAndGet();
                                ArrayList arrayList15 = arrayList12;
                                if (iIncrementAndGet == arrayList15.size()) {
                                    for (int i10 = 0; i10 < arrayList15.size(); i10++) {
                                        RequestDelegate requestDelegate = (RequestDelegate) ((Pair) arrayList15.get(i10)).second;
                                        Pair pair2 = (Pair) arrayList13.get(i10);
                                        if (pair2 != null) {
                                            requestDelegate.run((TLObject) pair2.first, (TLRPC.TL_error) pair2.second);
                                        }
                                    }
                                    searchAdapterHelper2.removeGroupSearchFromGlobal();
                                    ArrayList arrayList16 = searchAdapterHelper2.localSearchResults;
                                    if (arrayList16 != null) {
                                        searchAdapterHelper2.mergeResults(arrayList16, searchAdapterHelper2.localRecentResults);
                                    }
                                    SearchAdapterHelper.SearchAdapterHelperDelegate searchAdapterHelperDelegate = searchAdapterHelper2.delegate;
                                    if (searchAdapterHelperDelegate != null) {
                                        searchAdapterHelperDelegate.getExcludeUsers();
                                        ArrayList arrayList17 = searchAdapterHelper2.localServerSearch;
                                        ArrayList arrayList18 = searchAdapterHelper2.globalSearch;
                                        LongSparseArray excludeCallParticipants = searchAdapterHelper2.delegate.getExcludeCallParticipants();
                                        if (excludeCallParticipants != null) {
                                            int size3 = excludeCallParticipants.size();
                                            for (int i11 = 0; i11 < size3; i11++) {
                                                long jKeyAt = excludeCallParticipants.keyAt(i11);
                                                LongSparseArray longSparseArray4 = searchAdapterHelper2.globalSearchMap;
                                                TLRPC.User user2 = (TLRPC.User) longSparseArray4.get(jKeyAt);
                                                if (user2 != null) {
                                                    arrayList18.remove(user2);
                                                    arrayList17.remove(user2);
                                                    longSparseArray4.remove(user2.id);
                                                }
                                            }
                                        }
                                    }
                                    searchAdapterHelper2.delegate.onDataSetChanged(i8);
                                    ChatUsersActivity$$ExternalSyntheticLambda13 chatUsersActivity$$ExternalSyntheticLambda15 = chatUsersActivity$$ExternalSyntheticLambda14;
                                    if (chatUsersActivity$$ExternalSyntheticLambda15 != null) {
                                        chatUsersActivity$$ExternalSyntheticLambda15.run();
                                    }
                                }
                            }
                        }
                    });
                }
            }));
            arrayList.add(Integer.valueOf(atomicInteger2.get()));
            i6 = i7 + 1;
            arrayList6 = arrayList10;
            atomicInteger = atomicInteger3;
            arrayList8 = arrayList9;
        }
        if (z9) {
            this.delegate.onDataSetChanged(i2);
        }
    }

    public final void removeGroupSearchFromGlobal() {
        LongSparseArray longSparseArray = this.globalSearchMap;
        if (longSparseArray.size() == 0) {
            return;
        }
        LongSparseArray longSparseArray2 = this.groupSearchMap;
        int size = longSparseArray2.size();
        for (int i = 0; i < size; i++) {
            TLRPC.User user = (TLRPC.User) longSparseArray.get(longSparseArray2.keyAt(i));
            if (user != null) {
                this.globalSearch.remove(user);
                this.localServerSearch.remove(user);
                longSparseArray.remove(user.id);
            }
        }
    }
}
