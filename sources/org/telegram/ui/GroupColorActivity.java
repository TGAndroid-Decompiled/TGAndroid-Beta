package org.telegram.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;

public final class GroupColorActivity extends ChannelColorActivity {
    public boolean isLoading;
    public ChannelColorActivity.ProfilePreview profilePreview;
    public float profilePreviewPercent;

    public final class AnonymousClass1 implements ViewTreeObserver.OnGlobalLayoutListener {
        public final FrameLayout val$view;

        public AnonymousClass1(FrameLayout frameLayout) {
            this.val$view = frameLayout;
        }

        @Override
        public final void onGlobalLayout() {
            this.val$view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            GroupColorActivity groupColorActivity = GroupColorActivity.this;
            if (groupColorActivity.profilePreview == null) {
                groupColorActivity.profilePreview = (ChannelColorActivity.ProfilePreview) groupColorActivity.findChildAt(groupColorActivity.profilePreviewRow);
            }
            groupColorActivity.profilePreview.infoLayout.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda4(this, 1));
        }
    }

    public GroupColorActivity(long j) {
        super(j);
        this.isGroup = true;
    }

    @Override
    public final void createListView() {
        ChatActivity.AnonymousClass34 anonymousClass34 = new ChatActivity.AnonymousClass34(this, getParentActivity(), this.resourceProvider, 25);
        this.listView = anonymousClass34;
        anonymousClass34.setOnScrollListener(new LocationActivity.AnonymousClass10(this, 21));
        this.listView.setSections(true);
    }

    @Override
    public final View createView(Context context) {
        View viewCreateView = super.createView(context);
        updateColors(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setTitle("");
        ((ViewGroup) viewCreateView).addView(this.actionBar);
        viewCreateView.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass1((FrameLayout) viewCreateView));
        return viewCreateView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        super.didReceivedNotification(i, i2, objArr);
        if (i == NotificationCenter.chatInfoDidLoad && ((TLRPC.ChatFull) objArr[0]).id == (-this.dialogId)) {
            updateProfilePreview();
        }
    }

    @Override
    public final int getCustomWallpaperLevelMin() {
        return getMessagesController().groupCustomWallpaperLevelMin;
    }

    @Override
    public final int getEmojiPackInfoStrRes() {
        return R.string.GroupEmojiPackInfo;
    }

    @Override
    public final int getEmojiPackStrRes() {
        return R.string.GroupEmojiPack;
    }

    @Override
    public final int getEmojiStatusInfoStrRes() {
        return R.string.GroupEmojiStatusInfo;
    }

    @Override
    public final int getEmojiStatusLevelMin() {
        return getMessagesController().groupEmojiStatusLevelMin;
    }

    @Override
    public final int getEmojiStatusStrRes() {
        return R.string.GroupEmojiStatus;
    }

    @Override
    public final int getEmojiStickersLevelMin() {
        return getMessagesController().groupEmojiStickersLevelMin;
    }

    @Override
    public final int getMessagePreviewType() {
        return 4;
    }

    @Override
    public final int getProfileIconLevelMin() {
        return getMessagesController().groupProfileBgIconLevelMin;
    }

    @Override
    public final int getProfileInfoStrRes() {
        return R.string.GroupProfileInfo;
    }

    @Override
    public final int getStickerPackInfoStrRes() {
        return R.string.GroupStickerPackInfo;
    }

    @Override
    public final int getStickerPackStrRes() {
        return R.string.GroupStickerPack;
    }

    @Override
    public final int getWallpaper2InfoStrRes() {
        return R.string.GroupWallpaper2Info;
    }

    @Override
    public final int getWallpaperLevelMin() {
        return getMessagesController().groupWallpaperLevelMin;
    }

    @Override
    public final int getWallpaperStrRes() {
        return R.string.GroupWallpaper;
    }

    @Override
    public final boolean isForum() {
        return ChatObject.isForum(getMessagesController().getChat(Long.valueOf(-this.dialogId)));
    }

    public final void lambda$openBoostDialog$0(int i, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (canApplyBoost == null || getParentActivity() == null) {
            this.isLoading = false;
            return;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(this, getParentActivity(), i, this.currentAccount, this.resourceProvider) {
            @Override
            public final void lambda$showGiftOfferSheet$15() {
                super.lambda$showGiftOfferSheet$15();
                GroupColorActivity.this.isLoading = false;
            }

            @Override
            public final void onOpenAnimationEnd() {
                GroupColorActivity.this.isLoading = false;
            }
        };
        limitReachedBottomSheet.canApplyBoost = canApplyBoost;
        limitReachedBottomSheet.updateButton$2();
        limitReachedBottomSheet.updatePremiumButtonText();
        limitReachedBottomSheet.boostsStatus = this.boostsStatus;
        limitReachedBottomSheet.isCurrentChat = true;
        limitReachedBottomSheet.updateRows$7();
        limitReachedBottomSheet.dialogId = this.dialogId;
        limitReachedBottomSheet.updateRows$7();
        limitReachedBottomSheet.show();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ChannelColorActivity.ProfilePreview profilePreview = this.profilePreview;
        if (profilePreview != null) {
            profilePreview.setTitleSize();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override
    public final void openBoostDialog(int i) {
        if (this.boostsStatus == null || this.isLoading) {
            return;
        }
        this.isLoading = true;
        MessagesController.getInstance(this.currentAccount).getBoostsController().userCanBoostChannel(this.dialogId, this.boostsStatus, new GroupColorActivity$$ExternalSyntheticLambda0(this, i, 0));
    }

    @Override
    public final void updateButton(boolean z) {
        super.updateButton(z);
        ChannelColorActivity.ProfilePreview profilePreview = this.profilePreview;
        if (profilePreview != null) {
            TextView textView = profilePreview.textInfo1;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.boostsStatus;
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGroupBoostCount", tL_premium_boostsStatus != null ? tL_premium_boostsStatus.boosts : 0, new Object[0])));
        }
    }

    @Override
    public final void updateColors(boolean z) {
        super.updateColors(z);
        this.actionBar.setBackgroundColor(0);
        CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourceProvider)), Theme.getThemedDrawableByKey(getParentActivity(), R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow), 0, 0);
        combinedDrawable.fullSize = true;
        this.buttonContainer.setBackground(combinedDrawable);
        ChannelColorActivity.ProfilePreview profilePreview = this.profilePreview;
        if (profilePreview == null || z) {
            return;
        }
        profilePreview.backgroundView.setColor(this.currentAccount, this.selectedProfileColor, false);
        this.profilePreview.profileView.setColor(this.selectedProfileColor, false);
        this.profilePreview.updateColors$1();
    }

    @Override
    public final void updateRows$2() {
        ChannelColorActivity.Adapter adapter;
        ChannelColorActivity.Adapter adapter2;
        this.profilePreviewRow = 0;
        this.emptyRow = 1;
        this.profileColorGridRow = 2;
        this.rowsCount = 4;
        this.profileEmojiRow = 3;
        if (this.selectedProfileEmoji != 0 || this.selectedProfileColor >= 0) {
            boolean z = this.removeProfileColorRow >= 0;
            this.rowsCount = 5;
            this.removeProfileColorRow = 4;
            if (!z && (adapter = this.adapter) != null) {
                adapter.mObservable.notifyItemRangeInserted(4, 1);
                this.adapter.notifyItemChanged(this.profileEmojiRow);
                this.listView.scrollToPosition(0);
            }
        } else {
            int i = this.removeProfileColorRow;
            this.removeProfileColorRow = -1;
            if (i >= 0 && (adapter2 = this.adapter) != null) {
                adapter2.mObservable.notifyItemRangeRemoved(i, 1);
                this.adapter.notifyItemChanged(this.profileEmojiRow);
            }
        }
        int i2 = this.rowsCount;
        this.profileHintRow = i2;
        this.packEmojiRow = i2 + 1;
        this.packEmojiHintRow = i2 + 2;
        this.statusEmojiRow = i2 + 3;
        this.rowsCount = i2 + 5;
        this.statusHintRow = i2 + 4;
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-this.dialogId);
        if (chatFull == null || !chatFull.can_set_stickers) {
            this.packStickerRow = -1;
            this.packStickerHintRow = -1;
        } else {
            int i3 = this.rowsCount;
            this.packStickerRow = i3;
            this.rowsCount = i3 + 2;
            this.packStickerHintRow = i3 + 1;
        }
        int i4 = this.rowsCount;
        this.messagesPreviewRow = i4;
        this.wallpaperThemesRow = i4 + 1;
        this.wallpaperRow = i4 + 2;
        this.rowsCount = i4 + 4;
        this.wallpaperHintRow = i4 + 3;
    }
}
