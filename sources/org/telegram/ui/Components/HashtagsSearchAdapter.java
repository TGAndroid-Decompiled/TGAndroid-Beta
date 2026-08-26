package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.mlkit_language_id_common.zzin;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.MessagesSearchAdapter;
import org.telegram.ui.Stories.StoriesController;

public class HashtagsSearchAdapter extends UniversalAdapter {
    private final boolean[] cashtag;
    private final int currentAccount;
    private boolean endReached;
    private boolean hadStories;
    public boolean hasList;
    private String hashtagQuery;
    private String lastQuery;
    private int lastRate;
    public StoriesController.SearchStoriesList list;
    protected boolean loading;
    private final ArrayList<MessageObject> messages;
    private int reqId;
    private int searchId;
    private Runnable searchRunnable;
    private int totalCount;

    public HashtagsSearchAdapter(RecyclerListView recyclerListView, Context context, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
        super(recyclerListView, context, i, 0, null, resourcesProvider);
        this.messages = new ArrayList<>();
        this.searchId = 0;
        this.reqId = -1;
        this.cashtag = new boolean[1];
        this.fillItems = new EmojiView$$ExternalSyntheticLambda18(this, 16);
        this.currentAccount = i;
    }

    public void lambda$fillItems$0() {
        scrollToTop(true);
    }

    public void lambda$search$1(int i, TLObject tLObject, String str) {
        if (i != this.searchId) {
            return;
        }
        boolean zIsEmpty = this.messages.isEmpty();
        this.loading = false;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            if (messages_messages instanceof TLRPC.TL_messages_messages) {
                this.totalCount = ((TLRPC.TL_messages_messages) messages_messages).messages.size();
            } else if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                this.totalCount = ((TLRPC.TL_messages_messagesSlice) messages_messages).count;
            }
            this.lastRate = messages_messages.next_rate;
            MessagesController.getInstance(this.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(messages_messages.chats, false);
            for (int i2 = 0; i2 < messages_messages.messages.size(); i2++) {
                MessageObject messageObject = new MessageObject(this.currentAccount, messages_messages.messages.get(i2), false, true);
                messageObject.setQuery(str);
                this.messages.add(messageObject);
            }
            this.endReached = this.messages.size() >= this.totalCount;
            checkBottom();
        } else {
            this.endReached = true;
            this.totalCount = this.messages.size();
        }
        update(true);
        if (zIsEmpty) {
            scrollToTop(false);
        }
    }

    public void lambda$search$2(int i, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ShareTopView$$ExternalSyntheticLambda3(this, i, tLObject, str, 8));
    }

    public void lambda$search$3(int i, String str) {
        if (i != this.searchId) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.cashtag[0] ? "$" : "#");
        sb.append(this.hashtagQuery);
        String string = sb.toString();
        StoriesController.SearchStoriesList searchStoriesList = this.list;
        if (searchStoriesList == null || !TextUtils.equals(searchStoriesList.query, string)) {
            this.list = new StoriesController.SearchStoriesList(this.currentAccount, null, string);
        }
        if (this.list.messageObjects.size() <= 0) {
            StoriesController.SearchStoriesList searchStoriesList2 = this.list;
            searchStoriesList2.getClass();
            searchStoriesList2.load(4, Collections.EMPTY_LIST, true);
        }
        this.hasList = true;
        TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
        tL_channels_searchPosts.flags |= 1;
        this.hashtagQuery = str;
        tL_channels_searchPosts.hashtag = str;
        tL_channels_searchPosts.limit = 10;
        if (this.messages.isEmpty()) {
            tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
        } else {
            MessageObject messageObject = (MessageObject) zzin.m(1, this.messages);
            tL_channels_searchPosts.offset_rate = this.lastRate;
            tL_channels_searchPosts.offset_peer = MessagesController.getInstance(this.currentAccount).getInputPeer(messageObject.messageOwner.peer_id);
        }
        this.reqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_searchPosts, new ShareTopView$$ExternalSyntheticLambda0(this, i, string, 2));
    }

    public void cancel() {
        StoriesController.SearchStoriesList searchStoriesList = this.list;
        if (searchStoriesList != null && searchStoriesList.reqId != 0) {
            ConnectionsManager.getInstance(searchStoriesList.currentAccount).cancelRequest(searchStoriesList.reqId, true);
            searchStoriesList.reqId = 0;
        }
        this.hasList = false;
        if (this.reqId >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.reqId, true);
            this.reqId = -1;
        }
        AndroidUtilities.cancelRunOnUIThread(this.searchRunnable);
        this.searchId++;
        this.loading = false;
    }

    public void checkBottom() {
        if (TextUtils.isEmpty(this.lastQuery) || this.endReached || this.loading || !seesLoading()) {
            return;
        }
        search(this.lastQuery);
    }

    public void fillItems(ArrayList<UItem> arrayList, UniversalAdapter universalAdapter) {
        StoriesController.SearchStoriesList searchStoriesList;
        int i = 0;
        boolean z = this.hasList && (searchStoriesList = this.list) != null && searchStoriesList.messageObjects.size() > 0;
        if (z) {
            StoriesController.SearchStoriesList searchStoriesList2 = this.list;
            int i2 = MessagesSearchAdapter.StoriesView.Factory.$r8$clinit;
            UItem uItemOfFactory = UItem.ofFactory(MessagesSearchAdapter.StoriesView.Factory.class);
            uItemOfFactory.object = searchStoriesList2;
            arrayList.add(uItemOfFactory);
        }
        this.hadStories = z;
        while (i < this.messages.size()) {
            int i3 = i + 1;
            arrayList.add(UItem.asSearchMessage(i3, this.messages.get(i)));
            i = i3;
        }
        if (this.loading || !this.endReached) {
            arrayList.add(UItem.asFlicker(-2, 1));
            arrayList.add(UItem.asFlicker(-3, 1));
            arrayList.add(UItem.asFlicker(-4, 1));
        }
        if (this.hadStories || !z) {
            return;
        }
        AndroidUtilities.runOnUIThread(new GroupCallPip$$ExternalSyntheticLambda2(this, 15));
    }

    public String getHashtag(String str) {
        return getHashtag(str, null);
    }

    public void scrollToTop(boolean z) {
    }

    public void search(String str) {
        this.lastQuery = str;
        String hashtag = getHashtag(str, this.cashtag);
        if (!TextUtils.equals(this.hashtagQuery, hashtag)) {
            this.messages.clear();
            this.endReached = false;
            this.totalCount = 0;
            cancel();
        } else if (this.loading) {
            return;
        }
        int i = this.searchId + 1;
        this.searchId = i;
        if (hashtag == null) {
            return;
        }
        this.loading = true;
        update(true);
        SlotsDrawable$$ExternalSyntheticLambda9 slotsDrawable$$ExternalSyntheticLambda9 = new SlotsDrawable$$ExternalSyntheticLambda9(this, i, hashtag, 15);
        this.searchRunnable = slotsDrawable$$ExternalSyntheticLambda9;
        AndroidUtilities.runOnUIThread(slotsDrawable$$ExternalSyntheticLambda9, 300L);
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

    public void setInitialData(String str, ArrayList<MessageObject> arrayList, int i, int i2) {
        if (TextUtils.equals(str, this.hashtagQuery)) {
            return;
        }
        cancel();
        this.messages.clear();
        this.messages.addAll(arrayList);
        this.totalCount = i2;
        this.endReached = i2 > arrayList.size();
        this.lastRate = i;
        this.hashtagQuery = str;
        update(true);
    }

    public String getHashtag(String str, boolean[] zArr) {
        if (zArr != null) {
            zArr[0] = false;
        }
        if (str == null || str.isEmpty()) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.length() <= 1) {
            return null;
        }
        if ((strTrim.charAt(0) != '#' && strTrim.charAt(0) != '$') || strTrim.indexOf(64) >= 0) {
            return null;
        }
        if (zArr != null) {
            zArr[0] = strTrim.charAt(0) == '$';
        }
        return strTrim.substring(1);
    }
}
