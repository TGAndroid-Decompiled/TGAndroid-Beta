package org.telegram.ui.Adapters;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageFwdHeader;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Components.AvatarsDrawable;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Stories.StoriesController;

public class MessagesSearchAdapter extends RecyclerListView.SelectionAdapter implements NotificationCenter.NotificationCenterDelegate {
    public boolean containsStories;
    public int flickerCount;
    private boolean isSavedMessages;
    public int loadedCount;
    private Context mContext;
    private final Theme.ResourcesProvider resourcesProvider;
    private int searchType;
    public StoriesController.SearchStoriesList storiesList;
    private HashSet<Integer> messageIds = new HashSet<>();
    private ArrayList<MessageObject> searchResultMessages = new ArrayList<>();
    private int currentAccount = UserConfig.selectedAccount;
    private Runnable loadStories = new Runnable() {
        @Override
        public final void run() {
            MessagesSearchAdapter.this.lambda$new$0();
        }
    };

    public MessagesSearchAdapter(Context context, Theme.ResourcesProvider resourcesProvider, int i, boolean z) {
        this.resourcesProvider = resourcesProvider;
        this.mContext = context;
        this.searchType = i;
        this.isSavedMessages = z;
    }

    public void lambda$new$0() {
        StoriesController.SearchStoriesList searchStoriesList = this.storiesList;
        if (searchStoriesList != null) {
            searchStoriesList.load(true, 3);
        }
    }

    public void searchStories(String str, boolean z) {
        StoriesController.SearchStoriesList searchStoriesList = this.storiesList;
        if (TextUtils.equals(searchStoriesList == null ? "" : searchStoriesList.query, str)) {
            return;
        }
        boolean z2 = this.containsStories;
        AndroidUtilities.cancelRunOnUIThread(this.loadStories);
        StoriesController.SearchStoriesList searchStoriesList2 = this.storiesList;
        if (searchStoriesList2 != null) {
            searchStoriesList2.cancel();
        }
        if (!TextUtils.isEmpty(str)) {
            this.storiesList = new StoriesController.SearchStoriesList(this.currentAccount, str);
            if (z) {
                this.loadStories.run();
            } else {
                AndroidUtilities.runOnUIThread(this.loadStories, 1000L);
            }
        }
        StoriesController.SearchStoriesList searchStoriesList3 = this.storiesList;
        if ((searchStoriesList3 != null && searchStoriesList3.getCount() > 0) != z2) {
            notifyDataSetChanged();
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.storiesListUpdated && objArr[0] == this.storiesList) {
            notifyDataSetChanged();
        }
    }

    @Override
    public void notifyDataSetChanged() {
        int itemCount = getItemCount();
        StoriesController.SearchStoriesList searchStoriesList = this.storiesList;
        int i = 0;
        this.containsStories = searchStoriesList != null && searchStoriesList.getCount() > 0;
        this.searchResultMessages.clear();
        this.messageIds.clear();
        ArrayList<MessageObject> foundMessageObjects = this.searchType == 0 ? MediaDataController.getInstance(this.currentAccount).getFoundMessageObjects() : HashtagSearchController.getInstance(this.currentAccount).getMessages(this.searchType);
        for (int i2 = 0; i2 < foundMessageObjects.size(); i2++) {
            MessageObject messageObject = foundMessageObjects.get(i2);
            if ((!messageObject.hasValidGroupId() || messageObject.isPrimaryGroupMessage) && !this.messageIds.contains(Integer.valueOf(messageObject.getId()))) {
                this.searchResultMessages.add(messageObject);
                this.messageIds.add(Integer.valueOf(messageObject.getId()));
            }
        }
        int i3 = this.flickerCount;
        this.loadedCount = this.searchResultMessages.size();
        if (this.searchType != 0) {
            if ((true ^ HashtagSearchController.getInstance(this.currentAccount).isEndReached(this.searchType)) && this.loadedCount != 0) {
                i = Utilities.clamp(HashtagSearchController.getInstance(this.currentAccount).getCount(this.searchType) - this.loadedCount, 3, 0);
            }
            this.flickerCount = i;
        } else {
            if ((true ^ MediaDataController.getInstance(this.currentAccount).searchEndReached()) && this.loadedCount != 0) {
                i = Utilities.clamp(MediaDataController.getInstance(this.currentAccount).getSearchCount() - this.loadedCount, 3, 0);
            }
            this.flickerCount = i;
        }
        int itemCount2 = getItemCount();
        if (itemCount < itemCount2) {
            notifyItemRangeChanged(itemCount - i3, i3);
            notifyItemRangeInserted(itemCount, itemCount2 - itemCount);
        } else {
            super.notifyDataSetChanged();
        }
    }

    @Override
    public int getItemCount() {
        boolean z = this.containsStories;
        return (z ? 1 : 0) + this.searchResultMessages.size() + this.flickerCount;
    }

    public Object getItem(int i) {
        if (this.containsStories) {
            i--;
        }
        if (i < 0 || i >= this.searchResultMessages.size()) {
            return null;
        }
        return this.searchResultMessages.get(i);
    }

    @Override
    public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        return viewHolder.getItemViewType() == 0 || viewHolder.getItemViewType() == 2;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View dialogCell;
        if (i == 0) {
            dialogCell = new DialogCell(null, this.mContext, false, true, this.currentAccount, this.resourcesProvider);
        } else if (i == 1) {
            FlickerLoadingView flickerLoadingView = new FlickerLoadingView(this.mContext, this.resourcesProvider);
            flickerLoadingView.setIsSingleCell(true);
            flickerLoadingView.setViewType(7);
            dialogCell = flickerLoadingView;
        } else {
            dialogCell = i != 2 ? null : new StoriesView(this.mContext, this.resourcesProvider);
        }
        dialogCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        return new RecyclerListView.Holder(dialogCell);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        if (viewHolder.getItemViewType() == 0) {
            DialogCell dialogCell = (DialogCell) viewHolder.itemView;
            dialogCell.useSeparator = true;
            MessageObject messageObject = (MessageObject) getItem(i);
            long dialogId = messageObject.getDialogId();
            int i5 = messageObject.messageOwner.date;
            if (this.isSavedMessages) {
                dialogCell.isSavedDialog = true;
                long savedDialogId = messageObject.getSavedDialogId();
                TLRPC$Message tLRPC$Message = messageObject.messageOwner;
                TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader = tLRPC$Message.fwd_from;
                if (tLRPC$MessageFwdHeader == null || ((i4 = tLRPC$MessageFwdHeader.date) == 0 && tLRPC$MessageFwdHeader.saved_date == 0)) {
                    i3 = tLRPC$Message.date;
                } else if (i4 == 0) {
                    i3 = tLRPC$MessageFwdHeader.saved_date;
                } else {
                    dialogId = savedDialogId;
                    i2 = i4;
                    z = false;
                }
                i2 = i3;
                z = false;
                dialogId = savedDialogId;
            } else {
                if (messageObject.isOutOwner()) {
                    dialogId = messageObject.getFromChatId();
                }
                i2 = i5;
                z = true;
            }
            dialogCell.setDialog(dialogId, messageObject, i2, z, false);
            return;
        }
        if (viewHolder.getItemViewType() == 2) {
            ((StoriesView) viewHolder.itemView).set(this.storiesList);
        }
    }

    @Override
    public int getItemViewType(int i) {
        if (this.containsStories && i - 1 == -1) {
            return 2;
        }
        return i < this.searchResultMessages.size() ? 0 : 1;
    }

    public void attach() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
    }

    public void detach() {
        AndroidUtilities.cancelRunOnUIThread(this.loadStories);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
    }

    public static class StoriesView extends FrameLayout {
        private final AvatarsDrawable avatarsDrawable;
        private final Theme.ResourcesProvider resourcesProvider;
        private final TextView subtitleTextView;
        private final TextView titleTextView;

        public StoriesView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            setWillNotDraw(false);
            AvatarsDrawable avatarsDrawable = new AvatarsDrawable(this, false);
            this.avatarsDrawable = avatarsDrawable;
            avatarsDrawable.setCentered(true);
            avatarsDrawable.width = AndroidUtilities.dp(75.0f);
            avatarsDrawable.height = AndroidUtilities.dp(48.0f);
            avatarsDrawable.drawStoriesCircle = true;
            avatarsDrawable.setSize(AndroidUtilities.dp(22.0f));
            TextView textView = new TextView(context);
            this.titleTextView = textView;
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 14.0f);
            addView(textView, LayoutHelper.createFrame(-1, -2.0f, 48, 76.0f, 7.0f, 12.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.subtitleTextView = textView2;
            textView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
            textView2.setTextSize(1, 12.0f);
            addView(textView2, LayoutHelper.createFrame(-1, -2.0f, 48, 76.0f, 26.33f, 12.0f, 0.0f));
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
        }

        public void set(StoriesController.SearchStoriesList searchStoriesList) {
            int i = 0;
            for (int i2 = 0; i2 < searchStoriesList.messageObjects.size() && i < 3; i2++) {
                long j = searchStoriesList.messageObjects.get(i2).storyItem.dialogId;
                if (j >= 0) {
                    TLRPC$User user = MessagesController.getInstance(searchStoriesList.currentAccount).getUser(Long.valueOf(j));
                    if (user != null) {
                        this.avatarsDrawable.setObject(i, searchStoriesList.currentAccount, user);
                        i++;
                    }
                } else {
                    TLRPC$Chat chat = MessagesController.getInstance(searchStoriesList.currentAccount).getChat(Long.valueOf(-j));
                    if (chat != null) {
                        this.avatarsDrawable.setObject(i, searchStoriesList.currentAccount, chat);
                        i++;
                    }
                }
            }
            this.avatarsDrawable.setCount(i);
            this.avatarsDrawable.commitTransition(false);
            this.titleTextView.setText(LocaleController.formatPluralString("HashtagStoriesFound", searchStoriesList.getCount(), new Object[0]));
            this.subtitleTextView.setText(LocaleController.formatString(R.string.HashtagStoriesFoundSubtitle, searchStoriesList.query));
        }

        @Override
        protected void onDraw(Canvas canvas) {
            canvas.save();
            canvas.translate(0.0f, 0.0f);
            this.avatarsDrawable.onDraw(canvas);
            canvas.restore();
            super.onDraw(canvas);
            Paint themePaint = Theme.getThemePaint("paintDivider", this.resourcesProvider);
            if (themePaint == null) {
                themePaint = Theme.dividerPaint;
            }
            canvas.drawRect(0.0f, getHeight() - 1, getWidth(), getHeight(), themePaint);
        }
    }
}
