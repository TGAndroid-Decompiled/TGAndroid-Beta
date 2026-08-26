package org.telegram.ui.Components;

import android.app.Activity;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda17;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda8;
import org.telegram.ui.Stories.StoriesController;

public abstract class HashtagsSearchAdapter extends UniversalAdapter {
    public final boolean[] cashtag;
    public final int currentAccount;
    public boolean endReached;
    public boolean hadStories;
    public boolean hasList;
    public String hashtagQuery;
    public String lastQuery;
    public int lastRate;
    public StoriesController.SearchStoriesList list;
    public boolean loading;
    public final ArrayList messages;
    public int reqId;
    public int searchId;
    public ChatActivity$$ExternalSyntheticLambda17 searchRunnable;
    public int totalCount;

    public HashtagsSearchAdapter(RecyclerListView recyclerListView, Activity activity, int i) {
        super(recyclerListView, activity, i, 0, false, null, null);
        this.messages = new ArrayList();
        this.searchId = 0;
        this.reqId = -1;
        this.cashtag = new boolean[1];
        this.fillItems = new GiftSheet$$ExternalSyntheticLambda8(this, 4);
        this.currentAccount = i;
    }

    public static String getHashtag(String str, boolean[] zArr) {
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

    public final void checkBottom() {
        RecyclerListView recyclerListView;
        if (TextUtils.isEmpty(this.lastQuery) || this.endReached || this.loading || (recyclerListView = this.listView) == null) {
            return;
        }
        for (int i = 0; i < recyclerListView.getChildCount(); i++) {
            if (recyclerListView.getChildAt(i) instanceof FlickerLoadingView) {
                search(this.lastQuery);
                return;
            }
        }
    }

    public final void search(String str) {
        this.lastQuery = str;
        String hashtag = getHashtag(str, this.cashtag);
        if (!TextUtils.equals(this.hashtagQuery, hashtag)) {
            this.messages.clear();
            this.endReached = false;
            this.totalCount = 0;
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
        ChatActivity$$ExternalSyntheticLambda17 chatActivity$$ExternalSyntheticLambda17 = new ChatActivity$$ExternalSyntheticLambda17(this, i, hashtag, 22);
        this.searchRunnable = chatActivity$$ExternalSyntheticLambda17;
        AndroidUtilities.runOnUIThread(chatActivity$$ExternalSyntheticLambda17, 300L);
    }
}
