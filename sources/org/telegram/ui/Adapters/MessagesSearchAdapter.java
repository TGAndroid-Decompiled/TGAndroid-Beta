package org.telegram.ui.Adapters;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.ActivityCompat$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_language_id_common.zzii;
import com.google.android.gms.internal.mlkit_vision_common.zzkd;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AvatarsDrawable;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesListPlaceProvider;

public final class MessagesSearchAdapter extends RecyclerListView.SelectionAdapter implements NotificationCenter.NotificationCenterDelegate {
    public int flickerCount;
    public final ChatActivity fragment;
    public final boolean isSavedMessages;
    public int loadedCount;
    public final Context mContext;
    public final Theme.ResourcesProvider resourcesProvider;
    public final int searchType;
    public StoriesController.SearchStoriesList storiesList;
    public String storiesListQuery;
    public final HashSet messageIds = new HashSet();
    public final ArrayList searchResultMessages = new ArrayList();
    public final int currentAccount = UserConfig.selectedAccount;
    public final ActivityCompat$$ExternalSyntheticLambda0 loadStories = new ActivityCompat$$ExternalSyntheticLambda0(this, 27);

    public final class StoriesView extends FrameLayout {
        public final AvatarsDrawable avatarsDrawable;
        public final Theme.ResourcesProvider resourcesProvider;
        public final TextView[] subtitleTextView;
        public final TextView[] titleTextView;
        public float transitValue;
        public ValueAnimator transitionAnimator;

        public final class Factory extends UItem.UItemFactory {
            public static final int $r8$clinit = 0;

            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((StoriesView) view).set((StoriesController.SearchStoriesList) uItem.object);
            }

            @Override
            public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new StoriesView(context, resourcesProvider);
            }
        }

        public StoriesView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.titleTextView = new TextView[2];
            this.subtitleTextView = new TextView[2];
            this.resourcesProvider = resourcesProvider;
            setWillNotDraw(false);
            AvatarsDrawable avatarsDrawable = new AvatarsDrawable(this, false);
            this.avatarsDrawable = avatarsDrawable;
            avatarsDrawable.setCentered(true);
            avatarsDrawable.width = AndroidUtilities.dp(75.0f);
            avatarsDrawable.height = AndroidUtilities.dp(48.0f);
            avatarsDrawable.drawStoriesCircle = true;
            avatarsDrawable.setSize(AndroidUtilities.dp(22.0f));
            int i = 0;
            while (i < 2) {
                this.titleTextView[i] = new TextView(context);
                this.titleTextView[i].setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
                this.titleTextView[i].setTypeface(AndroidUtilities.bold());
                this.titleTextView[i].setTextSize(1, 14.0f);
                int i2 = 8;
                this.titleTextView[i].setVisibility(i == 0 ? 0 : 8);
                addView(this.titleTextView[i], LayoutHelper.createFrame(-1, -2.0f, 48, 76.0f, 7.0f, 40.0f, 0.0f));
                this.subtitleTextView[i] = new TextView(context);
                this.subtitleTextView[i].setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
                this.subtitleTextView[i].setTextSize(1, 12.0f);
                TextView textView = this.subtitleTextView[i];
                if (i == 0) {
                    i2 = 0;
                }
                textView.setVisibility(i2);
                addView(this.subtitleTextView[i], LayoutHelper.createFrame(-1, -2.0f, 48, 76.0f, 26.33f, 40.0f, 0.0f));
                i++;
            }
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.msg_arrowright);
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_dialogSearchHint, resourcesProvider), PorterDuff.Mode.SRC_IN));
            addView(imageView, LayoutHelper.createFrame(24, 24.0f, 21, 0.0f, 0.0f, 8.66f, 0.0f));
        }

        @Override
        public final void onDraw(Canvas canvas) {
            if (this.transitValue > 0.0f) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.transitValue) * 255.0f), 31);
            } else {
                canvas.save();
            }
            canvas.translate(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), this.transitValue), 0.0f);
            this.avatarsDrawable.onDraw(canvas);
            canvas.restore();
            super.onDraw(canvas);
            Paint themePaint = Theme.getThemePaint("paintDivider", this.resourcesProvider);
            if (themePaint == null) {
                themePaint = Theme.dividerPaint;
            }
            canvas.drawRect(0.0f, getHeight() - 1, getWidth(), getHeight(), themePaint);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
        }

        public final boolean set(StoriesController.SearchStoriesList searchStoriesList) {
            AvatarsDrawable avatarsDrawable;
            String str;
            int i = 0;
            int i2 = 0;
            while (true) {
                int size = searchStoriesList.messageObjects.size();
                avatarsDrawable = this.avatarsDrawable;
                str = searchStoriesList.username;
                if (i >= size || i2 >= 3) {
                    break;
                }
                MessageObject messageObject = (MessageObject) searchStoriesList.messageObjects.get(i);
                long j = messageObject.storyItem.dialogId;
                TextUtils.isEmpty(str);
                avatarsDrawable.setObject(i2, searchStoriesList.currentAccount, messageObject.storyItem);
                i2++;
                i++;
            }
            avatarsDrawable.setCount(i2);
            avatarsDrawable.commitTransition(false);
            boolean zIsEmpty = TextUtils.isEmpty(str);
            TextView[] textViewArr = this.titleTextView;
            if (zIsEmpty) {
                textViewArr[0].setText(LocaleController.formatPluralStringSpaced("HashtagStoriesFound", searchStoriesList.count));
            } else {
                textViewArr[0].setText(AndroidUtilities.replaceSingleLink(LocaleController.formatPluralStringSpaced("HashtagStoriesFoundChannel", searchStoriesList.count, "@" + str), Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider), null));
            }
            this.subtitleTextView[0].setText(LocaleController.formatString(R.string.HashtagStoriesFoundSubtitle, searchStoriesList.query));
            return i2 > 0;
        }

        public final void setMessages(int i, String str, String str2) {
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            TextView[] textViewArr = this.titleTextView;
            if (zIsEmpty) {
                textViewArr[1].setText(LocaleController.formatPluralStringSpaced("HashtagMessagesFound", i));
            } else {
                textViewArr[1].setText(AndroidUtilities.replaceSingleLink(LocaleController.formatPluralStringSpaced("HashtagMessagesFoundChannel", i, zzii.m("@", str2)), Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider), null));
            }
            this.subtitleTextView[1].setText(LocaleController.formatString(R.string.HashtagMessagesFoundSubtitle, str));
        }
    }

    public MessagesSearchAdapter(Context context, ChatActivity chatActivity, Theme.ResourcesProvider resourcesProvider, int i, boolean z) {
        this.resourcesProvider = resourcesProvider;
        this.mContext = context;
        this.fragment = chatActivity;
        this.searchType = i;
        this.isSavedMessages = z;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.storiesListUpdated && objArr[0] == this.storiesList) {
            notifyDataSetChanged();
        }
    }

    public final Object getItem(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.searchResultMessages;
        if (i >= arrayList.size()) {
            return null;
        }
        return arrayList.get(i);
    }

    @Override
    public final int getItemCount() {
        return this.searchResultMessages.size() + this.flickerCount;
    }

    @Override
    public final int getItemViewType(int i) {
        return i < this.searchResultMessages.size() ? 0 : 1;
    }

    @Override
    public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        return viewHolder.getItemViewType() == 0 || viewHolder.getItemViewType() == 2;
    }

    @Override
    public final void notifyDataSetChanged() {
        int itemCount = getItemCount();
        ArrayList arrayList = this.searchResultMessages;
        arrayList.clear();
        HashSet hashSet = this.messageIds;
        hashSet.clear();
        int i = this.currentAccount;
        int i2 = this.searchType;
        ArrayList<MessageObject> foundMessageObjects = i2 == 0 ? MediaDataController.getInstance(i).getFoundMessageObjects() : HashtagSearchController.getInstance(i).getMessages(i2);
        int iClamp = 0;
        for (int i3 = 0; i3 < foundMessageObjects.size(); i3++) {
            MessageObject messageObject = foundMessageObjects.get(i3);
            if ((!messageObject.hasValidGroupId() || messageObject.isPrimaryGroupMessage) && !hashSet.contains(Integer.valueOf(messageObject.getId()))) {
                arrayList.add(messageObject);
                hashSet.add(Integer.valueOf(messageObject.getId()));
            }
        }
        int i4 = this.flickerCount;
        this.loadedCount = arrayList.size();
        if (i2 != 0) {
            if (!HashtagSearchController.getInstance(i).isEndReached(i2) && this.loadedCount != 0) {
                iClamp = Utilities.clamp(HashtagSearchController.getInstance(i).getCount(i2) - this.loadedCount, 3, 0);
            }
            this.flickerCount = iClamp;
        } else {
            if (!MediaDataController.getInstance(i).searchEndReached() && this.loadedCount != 0) {
                iClamp = Utilities.clamp(MediaDataController.getInstance(i).getSearchCount() - this.loadedCount, 3, 0);
            }
            this.flickerCount = iClamp;
        }
        int itemCount2 = getItemCount();
        if (itemCount >= itemCount2) {
            super.notifyDataSetChanged();
            return;
        }
        if (i4 > 0) {
            notifyItemRangeChanged(itemCount - i4, i4);
        }
        notifyItemRangeInserted(itemCount, itemCount2 - itemCount);
    }

    @Override
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        if (viewHolder.getItemViewType() != 0) {
            if (viewHolder.getItemViewType() == 2) {
                ((StoriesView) viewHolder.itemView).set(this.storiesList);
                return;
            }
            return;
        }
        DialogCell dialogCell = (DialogCell) viewHolder.itemView;
        dialogCell.useSeparator = true;
        MessageObject messageObject = (MessageObject) getItem(i);
        long dialogId = messageObject.getDialogId();
        int i5 = messageObject.messageOwner.date;
        if (this.isSavedMessages) {
            dialogCell.isSavedDialog = true;
            long savedDialogId = messageObject.getSavedDialogId();
            TLRPC.Message message = messageObject.messageOwner;
            TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
            if (messageFwdHeader == null || ((i4 = messageFwdHeader.date) == 0 && messageFwdHeader.saved_date == 0)) {
                i3 = message.date;
            } else if (i4 == 0) {
                i3 = messageFwdHeader.saved_date;
            } else {
                dialogId = savedDialogId;
                i2 = i4;
                z = false;
            }
            i2 = i3;
            z = false;
            dialogId = savedDialogId;
        } else {
            if (messageObject.isOutOwner() || ChatObject.isMonoForum(this.currentAccount, dialogId)) {
                dialogId = messageObject.getFromChatId();
            }
            i2 = i5;
            z = true;
        }
        dialogCell.setDialog(dialogId, messageObject, i2, z, false);
        dialogCell.setDialogCellDelegate(new DialogCell.DialogCellDelegate() {
            @Override
            public final boolean canClickButtonInside() {
                return false;
            }

            @Override
            public final void onButtonClicked(DialogCell dialogCell2) {
            }

            @Override
            public final void onButtonLongPress(DialogCell dialogCell2) {
            }

            @Override
            public final void openHiddenStories() {
            }

            @Override
            public final void openStory(DialogCell dialogCell2, Runnable runnable) {
                MessagesSearchAdapter messagesSearchAdapter = MessagesSearchAdapter.this;
                if (MessagesController.getInstance(messagesSearchAdapter.currentAccount).getStoriesController().hasStories(dialogCell2.getDialogId())) {
                    ChatActivity chatActivity = messagesSearchAdapter.fragment;
                    chatActivity.getOrCreateStoryViewer().getClass();
                    chatActivity.getOrCreateStoryViewer().open(messagesSearchAdapter.mContext, dialogCell2.getDialogId(), new StoriesListPlaceProvider((RecyclerListView) dialogCell2.getParent(), false));
                }
            }

            @Override
            public final void showChatPreview(DialogCell dialogCell2) {
            }
        });
    }

    @Override
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View dialogCell;
        View storiesView;
        if (i != 0) {
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            Context context = this.mContext;
            if (i == 1) {
                FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, resourcesProvider);
                flickerLoadingView.setIsSingleCell(true);
                flickerLoadingView.setViewType(7);
                storiesView = flickerLoadingView;
            } else if (i != 2) {
                dialogCell = null;
            } else {
                storiesView = new StoriesView(context, resourcesProvider);
            }
            dialogCell = storiesView;
        } else {
            dialogCell = new DialogCell(null, this.mContext, true, this.currentAccount, this.resourcesProvider);
        }
        return zzkd.m(dialogCell, dialogCell, -2);
    }
}
