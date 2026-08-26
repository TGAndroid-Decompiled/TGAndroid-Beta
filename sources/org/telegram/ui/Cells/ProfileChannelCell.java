package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_language_id_common.zziq;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.android.gms.internal.mlkit_vision_common.zzkh;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.MessagesStorage$$ExternalSyntheticLambda19;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.ClickableAnimatedTextView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LoadingDrawable;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesListPlaceProvider;

public abstract class ProfileChannelCell extends FrameLayout implements Theme.Colorable {
    public final DialogCell dialogCell;
    public final TextView headerView;
    public boolean loading;
    public final AnimatedFloat loadingAlpha;
    public final LoadingDrawable loadingDrawable;
    public final Theme.ResourcesProvider resourcesProvider;
    public boolean set;
    public final ClickableAnimatedTextView subscribersView;

    public final class ChannelMessageFetcher {
        public long channel_id;
        public final int currentAccount;
        public boolean loaded;
        public boolean loading;
        public int message_id;
        public int searchId;
        public final ArrayList messageObjects = new ArrayList();
        public final ArrayList callbacks = new ArrayList();

        public ChannelMessageFetcher(int i) {
            this.currentAccount = i;
        }

        public final void done() {
            int i = 0;
            this.loading = false;
            this.loaded = true;
            ArrayList arrayList = this.callbacks;
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((Runnable) obj).run();
            }
            arrayList.clear();
        }

        public final void fetch(TLRPC.UserFull userFull) {
            ArrayList arrayList = this.messageObjects;
            if (userFull == null || (userFull.flags2 & 64) == 0) {
                this.searchId++;
                this.loaded = true;
                arrayList.clear();
                done();
                return;
            }
            long j = userFull.personal_channel_id;
            int i = userFull.personal_channel_message;
            if (this.loaded || this.loading) {
                if (this.channel_id == j && this.message_id == i) {
                    return;
                }
                this.loaded = false;
                arrayList.clear();
            }
            int i2 = this.searchId + 1;
            this.searchId = i2;
            this.loading = true;
            this.channel_id = j;
            this.message_id = i;
            int i3 = this.currentAccount;
            long clientUserId = UserConfig.getInstance(i3).getClientUserId();
            MessagesStorage messagesStorage = MessagesStorage.getInstance(i3);
            messagesStorage.getStorageQueue().postRunnable(new MessagesStorage$$ExternalSyntheticLambda19(this, i, messagesStorage, j, clientUserId, i2));
        }
    }

    public ProfileChannelCell(final BaseFragment baseFragment) {
        super(baseFragment.getContext());
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.loadingAlpha = new AnimatedFloat(320L, cubicBezierInterpolator);
        this.set = false;
        final Context context = baseFragment.getContext();
        Theme.ResourcesProvider resourceProvider = baseFragment.getResourceProvider();
        this.resourcesProvider = resourceProvider;
        LinearLayout linearLayoutM = zzkf.m(context, 0);
        addView(linearLayoutM, LayoutHelper.createFrame(-1, -2.0f, 55, 16.66f, 11.6f, 16.66f, 0.0f));
        TextView textView = new TextView(context);
        this.headerView = textView;
        zzkh.m(14.0f, textView);
        textView.setText(LocaleController.getString(R.string.ProfileChannel));
        linearLayoutM.addView(textView, LayoutHelper.createLinear(-2, -2, 51));
        ClickableAnimatedTextView clickableAnimatedTextView = new ClickableAnimatedTextView(context);
        this.subscribersView = clickableAnimatedTextView;
        clickableAnimatedTextView.getDrawable().setHacks(true, true);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = clickableAnimatedTextView.drawable;
        animatedTextDrawable.moveAmplitude = 0.3f;
        animatedTextDrawable.animateDuration = 165L;
        animatedTextDrawable.animateWave = 1.0f;
        animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
        clickableAnimatedTextView.setTypeface(AndroidUtilities.bold());
        clickableAnimatedTextView.setTextSize(AndroidUtilities.dp(11.0f));
        clickableAnimatedTextView.setPadding(AndroidUtilities.dp(4.33f), 0, AndroidUtilities.dp(4.33f), 0);
        clickableAnimatedTextView.setGravity(3);
        linearLayoutM.addView(clickableAnimatedTextView, LayoutHelper.createLinear(-1, 17, 51, 4, 1, 4, 0));
        DialogCell dialogCell = new DialogCell(null, context, true, UserConfig.selectedAccount, resourceProvider);
        this.dialogCell = dialogCell;
        dialogCell.setBackgroundColor(0);
        final ProfileActivity.ListAdapter.AnonymousClass10 anonymousClass10 = (ProfileActivity.ListAdapter.AnonymousClass10) this;
        dialogCell.setDialogCellDelegate(new DialogCell.DialogCellDelegate() {
            @Override
            public final boolean canClickButtonInside() {
                return true;
            }

            @Override
            public final void onButtonClicked(DialogCell dialogCell2) {
            }

            @Override
            public final void onButtonLongPress(DialogCell dialogCell2) {
            }

            @Override
            public final void openHiddenStories() {
                BaseFragment baseFragment2 = baseFragment;
                StoriesController storiesController = baseFragment2.getMessagesController().getStoriesController();
                if (storiesController.hiddenListStories.isEmpty()) {
                    return;
                }
                ArrayList arrayList = storiesController.hiddenListStories;
                boolean z = storiesController.getUnreadState(0, DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0;
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i)).peer);
                    if (!z || storiesController.getUnreadState(0, peerDialogId) != 0) {
                        arrayList2.add(Long.valueOf(peerDialogId));
                    }
                }
                baseFragment2.getOrCreateStoryViewer().open(UserConfig.selectedAccount, context, null, arrayList2, 0, null, null, new StoriesListPlaceProvider(anonymousClass10), false);
            }

            @Override
            public final void openStory(DialogCell dialogCell2) {
                BaseFragment baseFragment2 = baseFragment;
                if (baseFragment2.getMessagesController().getStoriesController().hasStories(dialogCell2.getDialogId())) {
                    baseFragment2.getOrCreateStoryViewer().getClass();
                    baseFragment2.getOrCreateStoryViewer().open(baseFragment2.getContext(), dialogCell2.getDialogId(), new StoriesListPlaceProvider(anonymousClass10));
                }
            }

            @Override
            public final void showChatPreview(DialogCell dialogCell2) {
            }
        });
        dialogCell.avatarStart = 15;
        dialogCell.messagePaddingStart = 83;
        addView(dialogCell, LayoutHelper.createFrame(-1, -2, 87));
        updateColors$1();
        setWillNotDraw(false);
        LoadingDrawable loadingDrawable = new LoadingDrawable();
        this.loadingDrawable = loadingDrawable;
        int i = Theme.key_listSelector;
        loadingDrawable.setColors(Theme.multAlpha(1.25f, Theme.getColor(i, resourceProvider)), Theme.multAlpha(0.8f, Theme.getColor(i, resourceProvider)));
        loadingDrawable.setRadii(AndroidUtilities.dp(8.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f = this.loadingAlpha.set(this.loading);
        if (f > 0.0f) {
            LoadingDrawable loadingDrawable = this.loadingDrawable;
            loadingDrawable.setAlpha((int) (f * 255.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            DialogCell dialogCell = this.dialogCell;
            rectF.set(dialogCell.getX() + AndroidUtilities.dp(dialogCell.messagePaddingStart + 6), dialogCell.getY() + AndroidUtilities.dp(38.0f), (getWidth() * 0.5f) + dialogCell.getX() + AndroidUtilities.dp(dialogCell.messagePaddingStart + 6), dialogCell.getY() + AndroidUtilities.dp(46.33f));
            loadingDrawable.setBounds(rectF);
            loadingDrawable.draw(canvas);
            rectF.set(dialogCell.getX() + AndroidUtilities.dp(dialogCell.messagePaddingStart + 6), dialogCell.getY() + AndroidUtilities.dp(56.0f), (getWidth() * 0.36f) + dialogCell.getX() + AndroidUtilities.dp(dialogCell.messagePaddingStart + 6), dialogCell.getY() + AndroidUtilities.dp(64.33f));
            loadingDrawable.setBounds(rectF);
            loadingDrawable.draw(canvas);
            rectF.set(((dialogCell.getX() + dialogCell.getWidth()) - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(43.0f), dialogCell.getY() + AndroidUtilities.dp(12.0f), (dialogCell.getX() + dialogCell.getWidth()) - AndroidUtilities.dp(16.0f), dialogCell.getY() + AndroidUtilities.dp(20.33f));
            loadingDrawable.setBounds(rectF);
            loadingDrawable.draw(canvas);
            invalidate();
        }
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(102.0f), 1073741824));
    }

    public final void set(ArrayList arrayList, TLRPC.Chat chat) {
        String shortNumber;
        boolean z = this.set;
        boolean z2 = chat == null || chat.participants_count > 0;
        ClickableAnimatedTextView clickableAnimatedTextView = this.subscribersView;
        ValueAnimator valueAnimator = clickableAnimatedTextView.drawable.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        clickableAnimatedTextView.setPivotX(0.0f);
        if (z) {
            clickableAnimatedTextView.animate().alpha(z2 ? 1.0f : 0.0f).scaleX(z2 ? 1.0f : 0.8f).scaleY(z2 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
        } else {
            clickableAnimatedTextView.setAlpha(z2 ? 1.0f : 0.0f);
            clickableAnimatedTextView.setScaleX(z2 ? 1.0f : 0.0f);
            clickableAnimatedTextView.setScaleY(z2 ? 1.0f : 0.0f);
        }
        if (chat != null) {
            int[] iArr = new int[1];
            if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                int i = chat.participants_count;
                iArr[0] = i;
                shortNumber = String.valueOf(i);
            } else {
                shortNumber = LocaleController.formatShortNumber(chat.participants_count, iArr);
            }
            clickableAnimatedTextView.setText(LocaleController.formatPluralString("Subscribers", iArr[0], new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), shortNumber), true, true);
            boolean z3 = arrayList == null || arrayList.isEmpty();
            this.loading = z3;
            DialogCell dialogCell = this.dialogCell;
            if (z3) {
                dialogCell.setDialog(-chat.id, null, 0, false, z);
            } else {
                MessageObject messageObject = (MessageObject) zziq.m(1, arrayList);
                long j = -chat.id;
                int i2 = messageObject.messageOwner.date;
                if (dialogCell.currentDialogId != j) {
                    dialogCell.lastStatusDrawableParams = -1;
                }
                dialogCell.currentDialogId = j;
                dialogCell.lastDialogChangedTime = System.currentTimeMillis();
                dialogCell.message = messageObject;
                dialogCell.useMeForMyMessages = false;
                dialogCell.isDialogCell = false;
                dialogCell.lastMessageDate = i2;
                int i3 = messageObject.messageOwner.edit_date;
                dialogCell.unreadCount = 0;
                dialogCell.markUnread = false;
                dialogCell.messageId = messageObject.getId();
                dialogCell.mentionCount = 0;
                dialogCell.reactionMentionCount = 0;
                dialogCell.pollVotesMentionCount = 0;
                dialogCell.lastUnreadState = messageObject.isUnread();
                dialogCell.groupMessages = arrayList;
                MessageObject messageObject2 = dialogCell.message;
                if (messageObject2 != null) {
                    dialogCell.lastSendState = messageObject2.messageOwner.send_state;
                }
                dialogCell.update(0, z);
            }
        }
        if (!z) {
            this.loadingAlpha.set(this.loading, true);
        }
        invalidate();
        this.set = true;
    }

    @Override
    public final void updateColors$1() {
        int color = Theme.getColor(Theme.key_windowBackgroundWhiteBlueHeader, this.resourcesProvider);
        ClickableAnimatedTextView clickableAnimatedTextView = this.subscribersView;
        clickableAnimatedTextView.setTextColor(color);
        clickableAnimatedTextView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), Theme.multAlpha(0.1f, color)));
        this.headerView.setTextColor(color);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return this.loadingDrawable == drawable || super.verifyDrawable(drawable);
    }
}
