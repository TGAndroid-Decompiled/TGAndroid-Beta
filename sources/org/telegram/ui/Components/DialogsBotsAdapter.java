package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$Peer;
import org.telegram.tgnet.TLRPC$TL_contacts_found;
import org.telegram.tgnet.TLRPC$TL_contacts_search;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputMessagesFilterEmpty;
import org.telegram.tgnet.TLRPC$TL_inputPeerEmpty;
import org.telegram.tgnet.TLRPC$TL_messages_messagesSlice;
import org.telegram.tgnet.TLRPC$TL_messages_searchGlobal;
import org.telegram.tgnet.TLRPC$TL_peerUser;
import org.telegram.tgnet.TLRPC$TL_topPeer;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$messages_Messages;
import org.telegram.tgnet.tl.TL_bots$getPopularAppBots;
import org.telegram.tgnet.tl.TL_bots$popularAppBots;
import org.telegram.ui.ActionBar.Theme;

public class DialogsBotsAdapter extends UniversalAdapter {
    private int allCount;
    private final Context context;
    private final int currentAccount;
    public boolean expandedMyBots;
    public boolean expandedSearchBots;
    private final int folderId;
    private boolean hasMore;
    public boolean loadingBots;
    public boolean loadingMessages;
    private int nextRate;
    public final ArrayList<TLRPC$User> popularBots;
    private boolean popularBotsLoaded;
    private boolean popularBotsLoading;
    private String popularBotsNextOffset;
    public String query;
    private final Theme.ResourcesProvider resourcesProvider;
    private int searchBotsId;
    public final ArrayList<TLRPC$User> searchGlobal;
    public final ArrayList<MessageObject> searchMessages;
    private Runnable searchMessagesRunnable;
    public final ArrayList<TLRPC$User> searchMine;
    private final boolean showOnlyPopular;
    private int topPeersEnd;
    private int topPeersStart;

    public DialogsBotsAdapter(RecyclerListView recyclerListView, Context context, int i, int i2, boolean z, Theme.ResourcesProvider resourcesProvider) {
        super(recyclerListView, context, i, 0, null, resourcesProvider);
        this.popularBots = new ArrayList<>();
        this.searchMine = new ArrayList<>();
        this.searchGlobal = new ArrayList<>();
        this.searchMessages = new ArrayList<>();
        this.searchMessagesRunnable = new Runnable() {
            @Override
            public final void run() {
                DialogsBotsAdapter.this.lambda$new$5();
            }
        };
        this.fillItems = new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                DialogsBotsAdapter.this.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        };
        this.context = context;
        this.currentAccount = i;
        this.folderId = i2;
        this.resourcesProvider = resourcesProvider;
        this.showOnlyPopular = z;
        update(false);
        MediaDataController.getInstance(i).loadHints(true);
        loadPopularBots();
    }

    public void fillItems(ArrayList<UItem> arrayList, UniversalAdapter universalAdapter) {
        HashSet hashSet = new HashSet();
        int i = 0;
        if (!TextUtils.isEmpty(this.query)) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.searchMine);
            arrayList2.addAll(this.searchGlobal);
            if (!arrayList2.isEmpty()) {
                if (arrayList2.size() <= 5 || this.searchMessages.isEmpty() || this.showOnlyPopular) {
                    arrayList.add(UItem.asGraySection(LocaleController.getString(R.string.SearchApps)));
                } else {
                    arrayList.add(UItem.asGraySection(LocaleController.getString(R.string.SearchApps), LocaleController.getString(this.expandedSearchBots ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            DialogsBotsAdapter.this.toggleExpandedSearchBots(view);
                        }
                    }));
                }
                int size = arrayList2.size();
                if (!this.expandedSearchBots && !this.searchMessages.isEmpty() && !this.showOnlyPopular) {
                    size = Math.min(5, size);
                }
                while (i < size) {
                    arrayList.add(UItem.asProfileCell((TLObject) arrayList2.get(i)));
                    i++;
                }
            }
            if (this.searchMessages.isEmpty() || this.showOnlyPopular) {
                return;
            }
            arrayList.add(UItem.asGraySection(LocaleController.getString(R.string.SearchMessages)));
            Iterator<MessageObject> it = this.searchMessages.iterator();
            while (it.hasNext()) {
                arrayList.add(UItem.asSearchMessage(it.next()));
            }
            if (this.hasMore) {
                arrayList.add(UItem.asFlicker(1));
                return;
            }
            return;
        }
        ArrayList<TLRPC$TL_topPeer> arrayList3 = MediaDataController.getInstance(this.currentAccount).webapps;
        ArrayList arrayList4 = new ArrayList();
        if (arrayList3 != null) {
            for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                TLRPC$User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(DialogObject.getPeerDialogId(arrayList3.get(i2).peer)));
                if (user != null && user.bot) {
                    arrayList4.add(user);
                }
            }
        }
        this.topPeersStart = arrayList.size();
        if (!arrayList4.isEmpty() && !this.showOnlyPopular) {
            if (arrayList4.size() > 5) {
                arrayList.add(UItem.asGraySection(LocaleController.getString(R.string.SearchAppsMine), LocaleController.getString(this.expandedMyBots ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        DialogsBotsAdapter.this.toggleExpandedMyBots(view);
                    }
                }));
            } else {
                arrayList.add(UItem.asGraySection(LocaleController.getString(R.string.SearchAppsMine)));
            }
            for (int i3 = 0; i3 < arrayList4.size() && (i3 < 5 || this.expandedMyBots); i3++) {
                TLRPC$User tLRPC$User = (TLRPC$User) arrayList4.get(i3);
                if (!hashSet.contains(Long.valueOf(tLRPC$User.id))) {
                    hashSet.add(Long.valueOf(tLRPC$User.id));
                    arrayList.add(UItem.asProfileCell(tLRPC$User).accent());
                }
            }
        }
        this.topPeersEnd = arrayList.size();
        if (!this.popularBots.isEmpty()) {
            if (!this.showOnlyPopular) {
                arrayList.add(UItem.asGraySection(LocaleController.getString(R.string.SearchAppsPopular)));
            }
            while (i < this.popularBots.size()) {
                TLRPC$User tLRPC$User2 = this.popularBots.get(i);
                if (!hashSet.contains(Long.valueOf(tLRPC$User2.id))) {
                    hashSet.add(Long.valueOf(tLRPC$User2.id));
                    arrayList.add(UItem.asProfileCell(tLRPC$User2).accent());
                }
                i++;
            }
            if (this.popularBotsNextOffset != null || this.popularBotsLoading) {
                arrayList.add(UItem.asFlicker(29));
                arrayList.add(UItem.asFlicker(29));
                arrayList.add(UItem.asFlicker(29));
                return;
            }
            return;
        }
        if (this.popularBotsNextOffset != null || this.popularBotsLoading) {
            if (!this.showOnlyPopular) {
                arrayList.add(UItem.asFlicker(30));
            }
            arrayList.add(UItem.asFlicker(29));
            arrayList.add(UItem.asFlicker(29));
            arrayList.add(UItem.asFlicker(29));
            arrayList.add(UItem.asFlicker(29));
        }
    }

    public void toggleExpandedMyBots(View view) {
        this.expandedMyBots = !this.expandedMyBots;
        update(true);
    }

    public void toggleExpandedSearchBots(View view) {
        this.expandedSearchBots = !this.expandedSearchBots;
        update(true);
    }

    public Object getTopPeerObject(int i) {
        if (i < this.topPeersStart || i >= this.topPeersEnd) {
            return Boolean.FALSE;
        }
        return getObject(i);
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
        final int i = this.searchBotsId + 1;
        this.searchBotsId = i;
        final TLRPC$TL_messages_searchGlobal tLRPC$TL_messages_searchGlobal = new TLRPC$TL_messages_searchGlobal();
        tLRPC$TL_messages_searchGlobal.broadcasts_only = false;
        int i2 = this.folderId;
        if (i2 != 0) {
            tLRPC$TL_messages_searchGlobal.flags |= 1;
            tLRPC$TL_messages_searchGlobal.folder_id = i2;
        }
        tLRPC$TL_messages_searchGlobal.q = this.query;
        tLRPC$TL_messages_searchGlobal.limit = 25;
        tLRPC$TL_messages_searchGlobal.filter = new TLRPC$TL_inputMessagesFilterEmpty();
        if (z && !this.searchMessages.isEmpty()) {
            ArrayList<MessageObject> arrayList = this.searchMessages;
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
                DialogsBotsAdapter.this.lambda$searchMessages$2(i, tLRPC$TL_messages_searchGlobal, z);
            }
        }, z ? 800L : 0L);
        if (z) {
            return;
        }
        this.loadingBots = true;
        final TLRPC$TL_contacts_search tLRPC$TL_contacts_search = new TLRPC$TL_contacts_search();
        tLRPC$TL_contacts_search.limit = 30;
        tLRPC$TL_contacts_search.q = this.query;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_contacts_search, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                DialogsBotsAdapter.this.lambda$searchMessages$4(tLRPC$TL_contacts_search, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$searchMessages$2(final int i, final TLRPC$TL_messages_searchGlobal tLRPC$TL_messages_searchGlobal, final boolean z) {
        if (i == this.searchBotsId && TextUtils.equals(tLRPC$TL_messages_searchGlobal.q, this.query)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_searchGlobal, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    DialogsBotsAdapter.this.lambda$searchMessages$1(i, tLRPC$TL_messages_searchGlobal, z, tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$searchMessages$1(final int i, final TLRPC$TL_messages_searchGlobal tLRPC$TL_messages_searchGlobal, final boolean z, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                DialogsBotsAdapter.this.lambda$searchMessages$0(i, tLRPC$TL_messages_searchGlobal, z, tLObject);
            }
        });
    }

    public void lambda$searchMessages$0(int i, TLRPC$TL_messages_searchGlobal tLRPC$TL_messages_searchGlobal, boolean z, TLObject tLObject) {
        if (i == this.searchBotsId && TextUtils.equals(tLRPC$TL_messages_searchGlobal.q, this.query)) {
            this.loadingMessages = false;
            if (!z) {
                this.searchMessages.clear();
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
                    this.searchMessages.add(messageObject);
                }
                this.hasMore = tLRPC$messages_Messages instanceof TLRPC$TL_messages_messagesSlice;
                this.allCount = Math.max(this.searchMessages.size(), tLRPC$messages_Messages.count);
                this.nextRate = tLRPC$messages_Messages.next_rate;
            }
            update(true);
        }
    }

    public void lambda$searchMessages$4(final TLRPC$TL_contacts_search tLRPC$TL_contacts_search, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                DialogsBotsAdapter.this.lambda$searchMessages$3(tLRPC$TL_contacts_search, tLObject);
            }
        });
    }

    public void lambda$searchMessages$3(TLRPC$TL_contacts_search tLRPC$TL_contacts_search, TLObject tLObject) {
        TLRPC$TL_contacts_found tLRPC$TL_contacts_found;
        TLRPC$User user;
        TLRPC$User user2;
        if (!TextUtils.equals(tLRPC$TL_contacts_search.q, this.query) || TextUtils.isEmpty(this.query)) {
            return;
        }
        this.loadingBots = false;
        if (tLObject instanceof TLRPC$TL_contacts_found) {
            tLRPC$TL_contacts_found = (TLRPC$TL_contacts_found) tLObject;
            MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(tLRPC$TL_contacts_found.users, tLRPC$TL_contacts_found.chats, true, true);
            MessagesController.getInstance(this.currentAccount).putUsers(tLRPC$TL_contacts_found.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tLRPC$TL_contacts_found.chats, false);
        } else {
            tLRPC$TL_contacts_found = null;
        }
        HashSet hashSet = new HashSet();
        this.searchMine.clear();
        if (tLRPC$TL_contacts_found != null) {
            Iterator<TLRPC$Peer> it = tLRPC$TL_contacts_found.my_results.iterator();
            while (it.hasNext()) {
                TLRPC$Peer next = it.next();
                if ((next instanceof TLRPC$TL_peerUser) && (user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(next.user_id))) != null && user2.bot && !hashSet.contains(Long.valueOf(user2.id))) {
                    hashSet.add(Long.valueOf(user2.id));
                    this.searchMine.add(user2);
                }
            }
        }
        this.searchGlobal.clear();
        if (tLRPC$TL_contacts_found != null) {
            Iterator<TLRPC$Peer> it2 = tLRPC$TL_contacts_found.results.iterator();
            while (it2.hasNext()) {
                TLRPC$Peer next2 = it2.next();
                if ((next2 instanceof TLRPC$TL_peerUser) && (user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(next2.user_id))) != null && user.bot && !hashSet.contains(Long.valueOf(user.id))) {
                    hashSet.add(Long.valueOf(user.id));
                    this.searchGlobal.add(user);
                }
            }
        }
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView != null) {
            recyclerListView.scrollToPosition(0);
        }
        update(true);
    }

    public void lambda$new$5() {
        searchMessages(false);
    }

    public void search(String str) {
        if (TextUtils.equals(str, this.query)) {
            return;
        }
        this.query = str;
        AndroidUtilities.cancelRunOnUIThread(this.searchMessagesRunnable);
        if (TextUtils.isEmpty(this.query)) {
            this.searchMessages.clear();
            update(true);
            this.searchBotsId++;
            this.loadingMessages = false;
            this.loadingBots = false;
            this.hasMore = false;
            this.nextRate = 0;
            RecyclerListView recyclerListView = this.listView;
            if (recyclerListView != null) {
                recyclerListView.scrollToPosition(0);
                return;
            }
            return;
        }
        this.searchMessages.clear();
        AndroidUtilities.runOnUIThread(this.searchMessagesRunnable, 1000L);
        this.loadingMessages = true;
        this.loadingBots = true;
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

    public void checkBottom() {
        if (!TextUtils.isEmpty(this.query)) {
            if (this.hasMore && !this.loadingMessages && seesLoading()) {
                searchMore();
                return;
            }
            return;
        }
        if (this.popularBotsLoading || TextUtils.isEmpty(this.popularBotsNextOffset) || !seesLoading()) {
            return;
        }
        loadPopularBots();
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

    public void loadPopularBots() {
        if (this.popularBotsLoading) {
            return;
        }
        if (this.popularBotsLoaded && this.popularBotsNextOffset == null) {
            return;
        }
        this.popularBotsLoading = true;
        TL_bots$getPopularAppBots tL_bots$getPopularAppBots = new TL_bots$getPopularAppBots();
        String str = this.popularBotsNextOffset;
        if (str == null) {
            str = "";
        }
        tL_bots$getPopularAppBots.offset = str;
        tL_bots$getPopularAppBots.limit = 20;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_bots$getPopularAppBots, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                DialogsBotsAdapter.this.lambda$loadPopularBots$7(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadPopularBots$7(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                DialogsBotsAdapter.this.lambda$loadPopularBots$6(tLObject);
            }
        });
    }

    public void lambda$loadPopularBots$6(TLObject tLObject) {
        this.popularBotsLoading = false;
        this.popularBotsLoaded = true;
        if (tLObject instanceof TL_bots$popularAppBots) {
            TL_bots$popularAppBots tL_bots$popularAppBots = (TL_bots$popularAppBots) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(tL_bots$popularAppBots.users, false);
            this.popularBots.addAll(tL_bots$popularAppBots.users);
            this.popularBotsNextOffset = tL_bots$popularAppBots.next_offset;
        } else {
            this.popularBotsNextOffset = null;
        }
        update(true);
    }
}
