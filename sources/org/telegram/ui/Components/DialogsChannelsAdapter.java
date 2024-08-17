package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$Dialog;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$Peer;
import org.telegram.tgnet.TLRPC$TL_contacts_found;
import org.telegram.tgnet.TLRPC$TL_contacts_search;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputMessagesFilterEmpty;
import org.telegram.tgnet.TLRPC$TL_inputPeerEmpty;
import org.telegram.tgnet.TLRPC$TL_messages_messagesSlice;
import org.telegram.tgnet.TLRPC$TL_messages_searchGlobal;
import org.telegram.tgnet.TLRPC$TL_peerChannel;
import org.telegram.tgnet.TLRPC$messages_Messages;
import org.telegram.ui.ActionBar.Theme;

public class DialogsChannelsAdapter extends UniversalAdapter {
    private int allCount;
    private final Context context;
    private final int currentAccount;
    public boolean expandedMyChannels;
    public boolean expandedSearchChannels;
    private final int folderId;
    private boolean hasMore;
    public boolean loadingChannels;
    public boolean loadingMessages;
    public final ArrayList<MessageObject> messages;
    public final ArrayList<TLRPC$Chat> myChannels;
    private int nextRate;
    public String query;
    private final Theme.ResourcesProvider resourcesProvider;
    public final ArrayList<TLRPC$Chat> searchChannels;
    private int searchChannelsId;
    private Runnable searchMessagesRunnable;
    public final ArrayList<TLRPC$Chat> searchMyChannels;
    public final ArrayList<TLRPC$Chat> searchRecommendedChannels;

    protected void hideKeyboard() {
        throw null;
    }

    public DialogsChannelsAdapter(RecyclerListView recyclerListView, Context context, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
        super(recyclerListView, context, i, 0, null, resourcesProvider);
        this.messages = new ArrayList<>();
        this.searchMyChannels = new ArrayList<>();
        this.searchRecommendedChannels = new ArrayList<>();
        this.searchChannels = new ArrayList<>();
        this.myChannels = new ArrayList<>();
        this.searchMessagesRunnable = new Runnable() {
            @Override
            public final void run() {
                DialogsChannelsAdapter.this.lambda$new$5();
            }
        };
        this.fillItems = new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                DialogsChannelsAdapter.this.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        };
        this.context = context;
        this.currentAccount = i;
        this.folderId = i2;
        this.resourcesProvider = resourcesProvider;
        update(false);
    }

    public void updateMyChannels() {
        ArrayList arrayList = new ArrayList();
        Iterator<TLRPC$Dialog> it = MessagesController.getInstance(this.currentAccount).getAllDialogs().iterator();
        while (it.hasNext()) {
            TLRPC$Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-it.next().id));
            if (chat != null && ChatObject.isChannelAndNotMegaGroup(chat) && ChatObject.isPublic(chat) && !ChatObject.isNotInChat(chat)) {
                arrayList.add(chat);
                if (arrayList.size() >= 100) {
                    break;
                }
            }
        }
        this.myChannels.clear();
        this.myChannels.addAll(arrayList);
    }

    public void fillItems(ArrayList<UItem> arrayList, UniversalAdapter universalAdapter) {
        int i = 0;
        if (TextUtils.isEmpty(this.query)) {
            ArrayList<TLRPC$Chat> arrayList2 = this.myChannels;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                if (this.myChannels.size() > 5) {
                    arrayList.add(UItem.asGraySection(LocaleController.getString(R.string.SearchMyChannels), LocaleController.getString(this.expandedMyChannels ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            DialogsChannelsAdapter.this.toggleExpandedMyChannels(view);
                        }
                    }));
                } else {
                    arrayList.add(UItem.asGraySection(LocaleController.getString(R.string.SearchMyChannels)));
                }
                int size = this.myChannels.size();
                if (!this.expandedMyChannels) {
                    size = Math.min(5, size);
                }
                while (i < size) {
                    arrayList.add(UItem.asProfileCell(this.myChannels.get(i)).withUsername(true));
                    i++;
                }
            }
            MessagesController.ChannelRecommendations cachedChannelRecommendations = MessagesController.getInstance(this.currentAccount).getCachedChannelRecommendations(0L);
            if (cachedChannelRecommendations != null) {
                ArrayList arrayList3 = new ArrayList();
                Iterator<TLRPC$Chat> it = cachedChannelRecommendations.chats.iterator();
                while (it.hasNext()) {
                    TLRPC$Chat next = it.next();
                    TLRPC$Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(next.id));
                    if (ChatObject.isNotInChat(next) && (chat == null || ChatObject.isNotInChat(chat))) {
                        arrayList3.add(next);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    arrayList.add(UItem.asGraySection(LocaleController.getString(R.string.SearchRecommendedChannels)));
                }
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList.add(UItem.asProfileCell((TLRPC$Chat) it2.next()));
                }
                return;
            }
            arrayList.add(UItem.asFlicker(30));
            arrayList.add(UItem.asFlicker(29));
            arrayList.add(UItem.asFlicker(29));
            arrayList.add(UItem.asFlicker(29));
            arrayList.add(UItem.asFlicker(29));
            return;
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator<TLRPC$Chat> it3 = this.searchMyChannels.iterator();
        while (it3.hasNext()) {
            TLRPC$Chat next2 = it3.next();
            TLRPC$Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(next2.id));
            if (ChatObject.isNotInChat(next2) && (chat2 == null || ChatObject.isNotInChat(chat2))) {
                arrayList4.add(next2);
            }
        }
        Iterator<TLRPC$Chat> it4 = this.searchRecommendedChannels.iterator();
        while (it4.hasNext()) {
            TLRPC$Chat next3 = it4.next();
            TLRPC$Chat chat3 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(next3.id));
            if (ChatObject.isNotInChat(next3) && (chat3 == null || ChatObject.isNotInChat(chat3))) {
                arrayList4.add(next3);
            }
        }
        Iterator<TLRPC$Chat> it5 = this.searchChannels.iterator();
        while (it5.hasNext()) {
            TLRPC$Chat next4 = it5.next();
            TLRPC$Chat chat4 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(next4.id));
            if (ChatObject.isNotInChat(next4) && (chat4 == null || ChatObject.isNotInChat(chat4))) {
                arrayList4.add(next4);
            }
        }
        if (!arrayList4.isEmpty()) {
            if (arrayList4.size() <= 5 || this.messages.isEmpty()) {
                arrayList.add(UItem.asGraySection(LocaleController.getString(R.string.SearchChannels)));
            } else {
                arrayList.add(UItem.asGraySection(LocaleController.getString(R.string.SearchChannels), LocaleController.getString(this.expandedSearchChannels ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        DialogsChannelsAdapter.this.toggleExpandedSearchChannels(view);
                    }
                }));
            }
            int size2 = arrayList4.size();
            if (!this.expandedSearchChannels && !this.messages.isEmpty()) {
                size2 = Math.min(5, size2);
            }
            while (i < size2) {
                arrayList.add(UItem.asProfileCell((TLObject) arrayList4.get(i)));
                i++;
            }
        }
        if (this.messages.isEmpty()) {
            return;
        }
        arrayList.add(UItem.asGraySection(LocaleController.getString(R.string.SearchMessages)));
        Iterator<MessageObject> it6 = this.messages.iterator();
        while (it6.hasNext()) {
            arrayList.add(UItem.asSearchMessage(it6.next()));
        }
        if (this.hasMore) {
            arrayList.add(UItem.asFlicker(1));
        }
    }

    public void toggleExpandedSearchChannels(View view) {
        this.expandedSearchChannels = !this.expandedSearchChannels;
        update(true);
        if (this.expandedSearchChannels) {
            hideKeyboard();
        }
    }

    public void toggleExpandedMyChannels(View view) {
        this.expandedMyChannels = !this.expandedMyChannels;
        update(true);
        if (this.expandedMyChannels) {
            hideKeyboard();
        }
    }

    public TLRPC$Chat getChat(int i) {
        UItem item = getItem(i);
        if (item != null) {
            Object obj = item.object;
            if (obj instanceof TLRPC$Chat) {
                return (TLRPC$Chat) obj;
            }
        }
        return null;
    }

    public Object getObject(int i) {
        UItem item = getItem(i);
        if (item != null) {
            return item.object;
        }
        return null;
    }

    private void searchMessages(final boolean z) {
        this.loadingMessages = true;
        final int i = this.searchChannelsId + 1;
        this.searchChannelsId = i;
        final TLRPC$TL_messages_searchGlobal tLRPC$TL_messages_searchGlobal = new TLRPC$TL_messages_searchGlobal();
        tLRPC$TL_messages_searchGlobal.broadcasts_only = true;
        int i2 = this.folderId;
        if (i2 != 0) {
            tLRPC$TL_messages_searchGlobal.flags |= 1;
            tLRPC$TL_messages_searchGlobal.folder_id = i2;
        }
        tLRPC$TL_messages_searchGlobal.q = this.query;
        tLRPC$TL_messages_searchGlobal.limit = 25;
        tLRPC$TL_messages_searchGlobal.filter = new TLRPC$TL_inputMessagesFilterEmpty();
        if (z && !this.messages.isEmpty()) {
            ArrayList<MessageObject> arrayList = this.messages;
            MessageObject messageObject = arrayList.get(arrayList.size() - 1);
            tLRPC$TL_messages_searchGlobal.offset_rate = this.nextRate;
            tLRPC$TL_messages_searchGlobal.offset_id = messageObject.getId();
            if (messageObject.messageOwner.peer_id == null) {
                tLRPC$TL_messages_searchGlobal.offset_peer = new TLRPC$TL_inputPeerEmpty();
            } else {
                tLRPC$TL_messages_searchGlobal.offset_peer = MessagesController.getInstance(this.currentAccount).getInputPeer(messageObject.messageOwner.peer_id);
            }
        } else {
            tLRPC$TL_messages_searchGlobal.offset_rate = 0;
            tLRPC$TL_messages_searchGlobal.offset_id = 0;
            tLRPC$TL_messages_searchGlobal.offset_peer = new TLRPC$TL_inputPeerEmpty();
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                DialogsChannelsAdapter.this.lambda$searchMessages$2(i, tLRPC$TL_messages_searchGlobal, z);
            }
        }, z ? 800L : 0L);
        if (z) {
            return;
        }
        this.loadingChannels = true;
        final TLRPC$TL_contacts_search tLRPC$TL_contacts_search = new TLRPC$TL_contacts_search();
        tLRPC$TL_contacts_search.limit = 20;
        tLRPC$TL_contacts_search.q = this.query;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_contacts_search, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                DialogsChannelsAdapter.this.lambda$searchMessages$4(tLRPC$TL_contacts_search, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$searchMessages$2(final int i, final TLRPC$TL_messages_searchGlobal tLRPC$TL_messages_searchGlobal, final boolean z) {
        if (i == this.searchChannelsId && TextUtils.equals(tLRPC$TL_messages_searchGlobal.q, this.query)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_searchGlobal, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    DialogsChannelsAdapter.this.lambda$searchMessages$1(i, tLRPC$TL_messages_searchGlobal, z, tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$searchMessages$1(final int i, final TLRPC$TL_messages_searchGlobal tLRPC$TL_messages_searchGlobal, final boolean z, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                DialogsChannelsAdapter.this.lambda$searchMessages$0(i, tLRPC$TL_messages_searchGlobal, z, tLObject);
            }
        });
    }

    public void lambda$searchMessages$0(int i, TLRPC$TL_messages_searchGlobal tLRPC$TL_messages_searchGlobal, boolean z, TLObject tLObject) {
        if (i == this.searchChannelsId && TextUtils.equals(tLRPC$TL_messages_searchGlobal.q, this.query)) {
            this.loadingMessages = false;
            if (!z) {
                this.messages.clear();
            }
            if (tLObject instanceof TLRPC$messages_Messages) {
                TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
                MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(tLRPC$messages_Messages.users, tLRPC$messages_Messages.chats, true, true);
                MessagesController.getInstance(this.currentAccount).putUsers(tLRPC$messages_Messages.users, false);
                MessagesController.getInstance(this.currentAccount).putChats(tLRPC$messages_Messages.chats, false);
                Iterator<TLRPC$Message> it = tLRPC$messages_Messages.messages.iterator();
                while (it.hasNext()) {
                    MessageObject messageObject = new MessageObject(this.currentAccount, it.next(), false, true);
                    messageObject.setQuery(this.query);
                    this.messages.add(messageObject);
                }
                this.hasMore = tLRPC$messages_Messages instanceof TLRPC$TL_messages_messagesSlice;
                this.allCount = Math.max(this.messages.size(), tLRPC$messages_Messages.count);
                this.nextRate = tLRPC$messages_Messages.next_rate;
            }
            update(true);
        }
    }

    public void lambda$searchMessages$4(final TLRPC$TL_contacts_search tLRPC$TL_contacts_search, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                DialogsChannelsAdapter.this.lambda$searchMessages$3(tLRPC$TL_contacts_search, tLObject);
            }
        });
    }

    public void lambda$searchMessages$3(TLRPC$TL_contacts_search tLRPC$TL_contacts_search, TLObject tLObject) {
        TLRPC$TL_contacts_found tLRPC$TL_contacts_found;
        TLRPC$Chat chat;
        TLRPC$Chat chat2;
        if (!TextUtils.equals(tLRPC$TL_contacts_search.q, this.query) || TextUtils.isEmpty(this.query)) {
            return;
        }
        this.loadingChannels = false;
        if (tLObject instanceof TLRPC$TL_contacts_found) {
            tLRPC$TL_contacts_found = (TLRPC$TL_contacts_found) tLObject;
            MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(tLRPC$TL_contacts_found.users, tLRPC$TL_contacts_found.chats, true, true);
            MessagesController.getInstance(this.currentAccount).putUsers(tLRPC$TL_contacts_found.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tLRPC$TL_contacts_found.chats, false);
        } else {
            tLRPC$TL_contacts_found = null;
        }
        HashSet hashSet = new HashSet();
        this.searchMyChannels.clear();
        if (tLRPC$TL_contacts_found != null) {
            Iterator<TLRPC$Peer> it = tLRPC$TL_contacts_found.my_results.iterator();
            while (it.hasNext()) {
                TLRPC$Peer next = it.next();
                if ((next instanceof TLRPC$TL_peerChannel) && (chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(next.channel_id))) != null && ChatObject.isChannelAndNotMegaGroup(chat2) && !hashSet.contains(Long.valueOf(chat2.id))) {
                    hashSet.add(Long.valueOf(chat2.id));
                    this.searchMyChannels.add(chat2);
                }
            }
        }
        this.searchRecommendedChannels.clear();
        String lowerCase = this.query.toLowerCase();
        String translitSafe = AndroidUtilities.translitSafe(lowerCase);
        MessagesController.ChannelRecommendations cachedChannelRecommendations = MessagesController.getInstance(this.currentAccount).getCachedChannelRecommendations(0L);
        if (cachedChannelRecommendations != null && !cachedChannelRecommendations.chats.isEmpty()) {
            Iterator<TLRPC$Chat> it2 = cachedChannelRecommendations.chats.iterator();
            while (it2.hasNext()) {
                TLRPC$Chat next2 = it2.next();
                if (next2 != null && ChatObject.isChannelAndNotMegaGroup(next2)) {
                    TLRPC$Chat chat3 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(next2.id));
                    if (ChatObject.isNotInChat(next2) && (chat3 == null || ChatObject.isNotInChat(chat3))) {
                        String lowerCase2 = next2.title.toLowerCase();
                        String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                        if (!lowerCase2.startsWith(lowerCase)) {
                            if (!lowerCase2.contains(" " + lowerCase) && !translitSafe2.startsWith(translitSafe)) {
                                if (translitSafe2.contains(" " + translitSafe)) {
                                }
                            }
                        }
                        if (!hashSet.contains(Long.valueOf(next2.id))) {
                            hashSet.add(Long.valueOf(next2.id));
                            this.searchRecommendedChannels.add(next2);
                        }
                    }
                }
            }
        }
        this.searchChannels.clear();
        if (tLRPC$TL_contacts_found != null) {
            Iterator<TLRPC$Peer> it3 = tLRPC$TL_contacts_found.results.iterator();
            while (it3.hasNext()) {
                TLRPC$Peer next3 = it3.next();
                if ((next3 instanceof TLRPC$TL_peerChannel) && (chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(next3.channel_id))) != null && ChatObject.isChannelAndNotMegaGroup(chat) && !hashSet.contains(Long.valueOf(chat.id))) {
                    hashSet.add(Long.valueOf(chat.id));
                    this.searchChannels.add(chat);
                }
            }
        }
        update(true);
    }

    public void lambda$new$5() {
        searchMessages(false);
    }

    public void search(String str) {
        updateMyChannels();
        if (TextUtils.equals(str, this.query)) {
            return;
        }
        this.query = str;
        AndroidUtilities.cancelRunOnUIThread(this.searchMessagesRunnable);
        if (TextUtils.isEmpty(this.query)) {
            this.messages.clear();
            this.searchChannels.clear();
            this.searchRecommendedChannels.clear();
            this.searchMyChannels.clear();
            update(true);
            this.searchChannelsId++;
            this.loadingMessages = false;
            this.loadingChannels = false;
            this.hasMore = false;
            this.nextRate = 0;
            RecyclerListView recyclerListView = this.listView;
            if (recyclerListView != null) {
                recyclerListView.scrollToPosition(0);
                return;
            }
            return;
        }
        this.messages.clear();
        this.searchChannels.clear();
        this.searchRecommendedChannels.clear();
        this.searchMyChannels.clear();
        AndroidUtilities.runOnUIThread(this.searchMessagesRunnable, 1000L);
        this.loadingMessages = true;
        this.loadingChannels = true;
        update(true);
        RecyclerListView recyclerListView2 = this.listView;
        if (recyclerListView2 != null) {
            recyclerListView2.scrollToPosition(0);
        }
    }

    public void searchMore() {
        if (!this.hasMore || this.loadingMessages || TextUtils.isEmpty(this.query)) {
            return;
        }
        searchMessages(true);
    }

    public ArrayList<TLRPC$Chat> getNextChannels(int i) {
        ArrayList<TLRPC$Chat> arrayList = new ArrayList<>();
        while (true) {
            i++;
            if (i >= getItemCount()) {
                return arrayList;
            }
            TLRPC$Chat chat = getChat(i);
            if (chat != null) {
                arrayList.add(chat);
            }
        }
    }

    public void checkBottom() {
        if (!this.hasMore || this.loadingMessages || TextUtils.isEmpty(this.query) || this.listView == null || !seesLoading()) {
            return;
        }
        searchMore();
    }

    public boolean seesLoading() {
        if (this.listView == null) {
            return false;
        }
        for (int i = 0; i < this.listView.getChildCount(); i++) {
            if (this.listView.getChildAt(i) instanceof FlickerLoadingView) {
                return true;
            }
        }
        return false;
    }
}
