package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.internal.mlkit_language_id_common.zzin;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SavedMessagesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.voip.VoIPService$$ExternalSyntheticLambda89;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ConnectionsManager$$ExternalSyntheticLambda12;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.Paint.Painting$$ExternalSyntheticLambda7;

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
    public final ArrayList<TLRPC.Chat> myChannels;
    private int nextRate;
    public String query;
    private final Theme.ResourcesProvider resourcesProvider;
    public final ArrayList<TLRPC.Chat> searchChannels;
    private int searchChannelsId;
    private final Runnable searchMessagesRunnable;
    public final ArrayList<TLRPC.Chat> searchMyChannels;
    public final ArrayList<TLRPC.Chat> searchRecommendedChannels;

    public DialogsChannelsAdapter(RecyclerListView recyclerListView, Context context, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
        super(recyclerListView, context, i, 0, null, resourcesProvider);
        this.messages = new ArrayList<>();
        this.searchMyChannels = new ArrayList<>();
        this.searchRecommendedChannels = new ArrayList<>();
        this.searchChannels = new ArrayList<>();
        this.myChannels = new ArrayList<>();
        this.searchMessagesRunnable = new GroupCallPip$$ExternalSyntheticLambda2(this, 11);
        this.fillItems = new EmojiView$$ExternalSyntheticLambda18(this, 12);
        this.context = context;
        this.currentAccount = i;
        this.folderId = i2;
        this.resourcesProvider = resourcesProvider;
        update(false);
    }

    public void lambda$new$4() {
        searchMessages(false);
    }

    public void lambda$searchMessages$0(int i, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z, TLObject tLObject) {
        if (i == this.searchChannelsId && TextUtils.equals(tL_messages_searchGlobal.q, this.query)) {
            this.loadingMessages = false;
            if (!z) {
                this.messages.clear();
            }
            if (tLObject instanceof TLRPC.messages_Messages) {
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                MessagesController.getInstance(this.currentAccount).putUsers(messages_messages.users, false);
                MessagesController.getInstance(this.currentAccount).putChats(messages_messages.chats, false);
                ArrayList<TLRPC.Message> arrayList = messages_messages.messages;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    TLRPC.Message message = arrayList.get(i2);
                    i2++;
                    MessageObject messageObject = new MessageObject(this.currentAccount, message, false, true);
                    messageObject.setQuery(this.query);
                    this.messages.add(messageObject);
                }
                this.hasMore = messages_messages instanceof TLRPC.TL_messages_messagesSlice;
                this.allCount = Math.max(this.messages.size(), messages_messages.count);
                this.nextRate = messages_messages.next_rate;
            }
            update(true);
        }
    }

    public void lambda$searchMessages$1(int i, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Painting$$ExternalSyntheticLambda7(this, i, tL_messages_searchGlobal, z, tLObject, 3));
    }

    public void lambda$searchMessages$2(int i, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z) {
        if (i == this.searchChannelsId && TextUtils.equals(tL_messages_searchGlobal.q, this.query)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_searchGlobal, new VoIPService$$ExternalSyntheticLambda89(this, i, tL_messages_searchGlobal, z, 2));
        }
    }

    public void lambda$searchMessages$3(TLRPC.TL_contacts_search tL_contacts_search, TLRPC.TL_contacts_found tL_contacts_found, TLRPC.TL_error tL_error) {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        if (!TextUtils.equals(tL_contacts_search.q, this.query) || TextUtils.isEmpty(this.query)) {
            return;
        }
        int i = 0;
        this.loadingChannels = false;
        if (tL_contacts_found != null) {
            MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(tL_contacts_found.users, tL_contacts_found.chats, true, true);
            MessagesController.getInstance(this.currentAccount).putUsers(tL_contacts_found.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tL_contacts_found.chats, false);
        } else {
            tL_contacts_found = null;
        }
        HashSet hashSet = new HashSet();
        this.searchMyChannels.clear();
        if (tL_contacts_found != null) {
            ArrayList<TLRPC.Peer> arrayList = tL_contacts_found.my_results;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                TLRPC.Peer peer = arrayList.get(i2);
                i2++;
                TLRPC.Peer peer2 = peer;
                if ((peer2 instanceof TLRPC.TL_peerChannel) && (chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(peer2.channel_id))) != null && ChatObject.isChannelAndNotMegaGroup(chat2) && !hashSet.contains(Long.valueOf(chat2.id))) {
                    hashSet.add(Long.valueOf(chat2.id));
                    this.searchMyChannels.add(chat2);
                }
            }
        }
        this.searchRecommendedChannels.clear();
        String lowerCase = this.query.toLowerCase();
        String strTranslitSafe = AndroidUtilities.translitSafe(lowerCase);
        MessagesController.ChannelRecommendations cachedChannelRecommendations = MessagesController.getInstance(this.currentAccount).getCachedChannelRecommendations(0L);
        if (cachedChannelRecommendations != null && !cachedChannelRecommendations.chats.isEmpty()) {
            ArrayList<TLObject> arrayList2 = cachedChannelRecommendations.chats;
            int size2 = arrayList2.size();
            int i3 = 0;
            while (i3 < size2) {
                TLObject tLObject = arrayList2.get(i3);
                i3++;
                TLObject tLObject2 = tLObject;
                if (tLObject2 instanceof TLRPC.Chat) {
                    TLRPC.Chat chat3 = (TLRPC.Chat) tLObject2;
                    if (ChatObject.isChannelAndNotMegaGroup(chat3)) {
                        TLRPC.Chat chat4 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(chat3.id));
                        if (ChatObject.isNotInChat(chat3) && (chat4 == null || ChatObject.isNotInChat(chat4))) {
                            String lowerCase2 = chat3.title.toLowerCase();
                            String strTranslitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                            if (lowerCase2.startsWith(lowerCase) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", lowerCase, lowerCase2) || strTranslitSafe2.startsWith(strTranslitSafe) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", strTranslitSafe, strTranslitSafe2)) {
                                if (!hashSet.contains(Long.valueOf(chat3.id))) {
                                    hashSet.add(Long.valueOf(chat3.id));
                                    this.searchRecommendedChannels.add(chat3);
                                }
                            }
                        }
                    }
                }
            }
        }
        this.searchChannels.clear();
        if (tL_contacts_found != null) {
            ArrayList<TLRPC.Peer> arrayList3 = tL_contacts_found.results;
            int size3 = arrayList3.size();
            while (i < size3) {
                TLRPC.Peer peer3 = arrayList3.get(i);
                i++;
                TLRPC.Peer peer4 = peer3;
                if ((peer4 instanceof TLRPC.TL_peerChannel) && (chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(peer4.channel_id))) != null && ChatObject.isChannelAndNotMegaGroup(chat) && !hashSet.contains(Long.valueOf(chat.id))) {
                    hashSet.add(Long.valueOf(chat.id));
                    this.searchChannels.add(chat);
                }
            }
        }
        update(true);
    }

    private void searchMessages(boolean z) {
        this.loadingMessages = true;
        int i = this.searchChannelsId + 1;
        this.searchChannelsId = i;
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
        tL_messages_searchGlobal.broadcasts_only = true;
        int i2 = this.folderId;
        if (i2 != 0) {
            tL_messages_searchGlobal.flags |= 1;
            tL_messages_searchGlobal.folder_id = i2;
        }
        tL_messages_searchGlobal.q = this.query;
        tL_messages_searchGlobal.limit = 25;
        tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        if (!z || this.messages.isEmpty()) {
            tL_messages_searchGlobal.offset_rate = 0;
            tL_messages_searchGlobal.offset_id = 0;
            tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        } else {
            MessageObject messageObject = (MessageObject) zzin.m(1, this.messages);
            tL_messages_searchGlobal.offset_rate = this.nextRate;
            tL_messages_searchGlobal.offset_id = messageObject.getId();
            if (messageObject.messageOwner.peer_id == null) {
                tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
            } else {
                tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(this.currentAccount).getInputPeer(messageObject.messageOwner.peer_id);
            }
        }
        AndroidUtilities.runOnUIThread(new ConnectionsManager$$ExternalSyntheticLambda12(this, i, tL_messages_searchGlobal, z, 3), z ? 800L : 0L);
        if (z) {
            return;
        }
        this.loadingChannels = true;
        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.limit = 20;
        tL_contacts_search.broadcasts = true;
        tL_contacts_search.q = this.query;
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_contacts_search, new AiTonesController$$ExternalSyntheticLambda0(), new ScrimOptions$$ExternalSyntheticLambda2(4, this, tL_contacts_search));
    }

    public boolean atTop() {
        if (this.listView == null) {
            return false;
        }
        for (int i = 0; i < this.listView.getChildCount(); i++) {
            if (this.listView.getChildAdapterPosition(this.listView.getChildAt(i)) == 0) {
                return true;
            }
        }
        return false;
    }

    public void checkBottom() {
        if (!this.hasMore || this.loadingMessages || TextUtils.isEmpty(this.query) || this.listView == null || !seesLoading()) {
            return;
        }
        searchMore();
    }

    public void fillItems(ArrayList<UItem> arrayList, UniversalAdapter universalAdapter) {
        int i = 0;
        if (TextUtils.isEmpty(this.query)) {
            ArrayList<TLRPC.Chat> arrayList2 = this.myChannels;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                if (this.myChannels.size() > 5) {
                    final int i2 = 0;
                    arrayList.add(UItem.asGraySection(LocaleController.getString(R.string.SearchMyChannels), LocaleController.getString(this.expandedMyChannels ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener(this) {
                        public final DialogsChannelsAdapter f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (i2) {
                                case 0:
                                    this.f$0.toggleExpandedMyChannels(view);
                                    break;
                                default:
                                    this.f$0.toggleExpandedSearchChannels(view);
                                    break;
                            }
                        }
                    }));
                } else {
                    arrayList.add(UItem.asGraySection(LocaleController.getString(R.string.SearchMyChannels)));
                }
                int size = this.myChannels.size();
                if (!this.expandedMyChannels) {
                    size = Math.min(5, size);
                }
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList.add(UItem.asProfileCell(this.myChannels.get(i3)).withUsername(true));
                }
            }
            MessagesController.ChannelRecommendations cachedChannelRecommendations = MessagesController.getInstance(this.currentAccount).getCachedChannelRecommendations(0L);
            if (cachedChannelRecommendations == null) {
                arrayList.add(UItem.asFlicker(30));
                arrayList.add(UItem.asFlicker(29));
                arrayList.add(UItem.asFlicker(29));
                arrayList.add(UItem.asFlicker(29));
                arrayList.add(UItem.asFlicker(29));
                return;
            }
            ArrayList arrayList3 = new ArrayList();
            ArrayList<TLObject> arrayList4 = cachedChannelRecommendations.chats;
            int size2 = arrayList4.size();
            int i4 = 0;
            while (i4 < size2) {
                TLObject tLObject = arrayList4.get(i4);
                i4++;
                TLObject tLObject2 = tLObject;
                if (tLObject2 instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                    TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(chat.id));
                    if (ChatObject.isNotInChat(chat) && (chat2 == null || ChatObject.isNotInChat(chat2))) {
                        arrayList3.add(chat);
                    }
                }
            }
            if (!arrayList3.isEmpty()) {
                arrayList.add(UItem.asGraySection(LocaleController.getString(R.string.SearchRecommendedChannels)));
            }
            int size3 = arrayList3.size();
            while (i < size3) {
                Object obj = arrayList3.get(i);
                i++;
                arrayList.add(UItem.asProfileCell((TLRPC.Chat) obj));
            }
            return;
        }
        ArrayList arrayList5 = new ArrayList();
        ArrayList<TLRPC.Chat> arrayList6 = this.searchMyChannels;
        int size4 = arrayList6.size();
        int i5 = 0;
        while (i5 < size4) {
            TLRPC.Chat chat3 = arrayList6.get(i5);
            i5++;
            TLRPC.Chat chat4 = chat3;
            TLRPC.Chat chat5 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(chat4.id));
            if (ChatObject.isNotInChat(chat4) && (chat5 == null || ChatObject.isNotInChat(chat5))) {
                arrayList5.add(chat4);
            }
        }
        ArrayList<TLRPC.Chat> arrayList7 = this.searchRecommendedChannels;
        int size5 = arrayList7.size();
        int i6 = 0;
        while (i6 < size5) {
            TLRPC.Chat chat6 = arrayList7.get(i6);
            i6++;
            TLRPC.Chat chat7 = chat6;
            TLRPC.Chat chat8 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(chat7.id));
            if (ChatObject.isNotInChat(chat7) && (chat8 == null || ChatObject.isNotInChat(chat8))) {
                arrayList5.add(chat7);
            }
        }
        ArrayList<TLRPC.Chat> arrayList8 = this.searchChannels;
        int size6 = arrayList8.size();
        int i7 = 0;
        while (i7 < size6) {
            TLRPC.Chat chat9 = arrayList8.get(i7);
            i7++;
            TLRPC.Chat chat10 = chat9;
            TLRPC.Chat chat11 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(chat10.id));
            if (ChatObject.isNotInChat(chat10) && (chat11 == null || ChatObject.isNotInChat(chat11))) {
                arrayList5.add(chat10);
            }
        }
        if (!arrayList5.isEmpty()) {
            if (arrayList5.size() <= 5 || this.messages.isEmpty()) {
                arrayList.add(UItem.asGraySection(LocaleController.getString(R.string.SearchChannels)));
            } else {
                final int i8 = 1;
                arrayList.add(UItem.asGraySection(LocaleController.getString(R.string.SearchChannels), LocaleController.getString(this.expandedSearchChannels ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener(this) {
                    public final DialogsChannelsAdapter f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i8) {
                            case 0:
                                this.f$0.toggleExpandedMyChannels(view);
                                break;
                            default:
                                this.f$0.toggleExpandedSearchChannels(view);
                                break;
                        }
                    }
                }));
            }
            int size7 = arrayList5.size();
            if (!this.expandedSearchChannels && !this.messages.isEmpty()) {
                size7 = Math.min(5, size7);
            }
            for (int i9 = 0; i9 < size7; i9++) {
                arrayList.add(UItem.asProfileCell((TLObject) arrayList5.get(i9)));
            }
        }
        if (this.messages.isEmpty()) {
            return;
        }
        arrayList.add(UItem.asGraySection(LocaleController.getString(R.string.SearchMessages)));
        ArrayList<MessageObject> arrayList9 = this.messages;
        int size8 = arrayList9.size();
        while (i < size8) {
            MessageObject messageObject = arrayList9.get(i);
            i++;
            arrayList.add(UItem.asSearchMessage(messageObject));
        }
        if (this.hasMore) {
            arrayList.add(UItem.asFlicker(1));
        }
    }

    public TLRPC.Chat getChat(int i) {
        UItem item = getItem(i);
        if (item == null) {
            return null;
        }
        Object obj = item.object;
        if (obj instanceof TLRPC.Chat) {
            return (TLRPC.Chat) obj;
        }
        return null;
    }

    public ArrayList<TLRPC.Chat> getNextChannels(int i) {
        ArrayList<TLRPC.Chat> arrayList = new ArrayList<>();
        while (true) {
            i++;
            if (i >= getItemCount()) {
                return arrayList;
            }
            TLRPC.Chat chat = getChat(i);
            if (chat != null) {
                arrayList.add(chat);
            }
        }
    }

    public Object getObject(int i) {
        UItem item = getItem(i);
        if (item != null) {
            return item.object;
        }
        return null;
    }

    public void hideKeyboard() {
    }

    public void search(String str) {
        updateMyChannels();
        if (TextUtils.equals(str, this.query)) {
            return;
        }
        this.query = str;
        AndroidUtilities.cancelRunOnUIThread(this.searchMessagesRunnable);
        if (!TextUtils.isEmpty(this.query)) {
            this.messages.clear();
            this.searchChannels.clear();
            this.searchRecommendedChannels.clear();
            this.searchMyChannels.clear();
            AndroidUtilities.runOnUIThread(this.searchMessagesRunnable, 1000L);
            this.loadingMessages = true;
            this.loadingChannels = true;
            update(true);
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
        update(true);
        this.searchChannelsId++;
        this.loadingMessages = false;
        this.loadingChannels = false;
        this.hasMore = false;
        this.nextRate = 0;
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

    public void toggleExpandedMyChannels(View view) {
        this.expandedMyChannels = !this.expandedMyChannels;
        update(true);
        if (this.expandedMyChannels) {
            hideKeyboard();
        }
    }

    public void toggleExpandedSearchChannels(View view) {
        this.expandedSearchChannels = !this.expandedSearchChannels;
        update(true);
        if (this.expandedSearchChannels) {
            hideKeyboard();
        }
    }

    public void updateMyChannels() {
        ArrayList arrayList = new ArrayList();
        ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(this.currentAccount).getAllDialogs();
        int size = allDialogs.size();
        int i = 0;
        while (i < size) {
            TLRPC.Dialog dialog = allDialogs.get(i);
            i++;
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.id));
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
}
