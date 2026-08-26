package org.telegram.ui;

import com.google.android.exoplayer2.util.Consumer;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;

public final class LaunchActivity$$ExternalSyntheticLambda67 implements Consumer {
    public final int $r8$classId = 1;
    public final LaunchActivity f$0;
    public final Browser.Progress f$1;
    public final LaunchActivity$$ExternalSyntheticLambda13 f$2;
    public final Object f$3;
    public final Long f$4;
    public final ChatMessageCell f$5;

    public LaunchActivity$$ExternalSyntheticLambda67(LaunchActivity launchActivity, Browser.Progress progress, Long l, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, ChatMessageCell chatMessageCell, LaunchActivity$$ExternalSyntheticLambda13 launchActivity$$ExternalSyntheticLambda13) {
        this.f$0 = launchActivity;
        this.f$1 = progress;
        this.f$4 = l;
        this.f$3 = tL_premium_boostsStatus;
        this.f$5 = chatMessageCell;
        this.f$2 = launchActivity$$ExternalSyntheticLambda13;
    }

    @Override
    public final void accept(Object obj) {
        DialogsActivity.AnonymousClass27 anonymousClass27;
        switch (this.$r8$classId) {
            case 0:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                LaunchActivity launchActivity = this.f$0;
                launchActivity.getClass();
                Browser.Progress progress = this.f$1;
                LaunchActivity$$ExternalSyntheticLambda13 launchActivity$$ExternalSyntheticLambda13 = this.f$2;
                if (tL_premium_boostsStatus != null) {
                    Long l = this.f$4;
                    ((ChannelBoostsController) this.f$3).userCanBoostChannel(l.longValue(), tL_premium_boostsStatus, new LaunchActivity$$ExternalSyntheticLambda67(launchActivity, progress, l, tL_premium_boostsStatus, this.f$5, launchActivity$$ExternalSyntheticLambda13));
                } else {
                    if (progress != null) {
                        progress.end();
                    }
                    if (launchActivity$$ExternalSyntheticLambda13 != null) {
                        launchActivity$$ExternalSyntheticLambda13.run();
                    }
                }
                break;
            default:
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                LaunchActivity launchActivity2 = this.f$0;
                launchActivity2.getClass();
                Browser.Progress progress2 = this.f$1;
                if (progress2 != null) {
                    progress2.end();
                }
                BaseFragment lastFragment = LaunchActivity.getLastFragment();
                if (lastFragment instanceof MainTabsActivity) {
                    lastFragment = ((MainTabsActivity) lastFragment).getCurrentVisibleFragment();
                }
                BaseFragment baseFragment = lastFragment;
                if (baseFragment != null) {
                    Theme.ResourcesProvider resourceProvider = baseFragment.getResourceProvider();
                    if (baseFragment.getLastStoryViewer() != null && baseFragment.getLastStoryViewer().fullyVisible) {
                        resourceProvider = baseFragment.getLastStoryViewer().resourcesProvider;
                    }
                    LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(19, launchActivity2.currentAccount, launchActivity2, baseFragment, resourceProvider);
                    limitReachedBottomSheet.canApplyBoost = canApplyBoost;
                    limitReachedBottomSheet.updateButton$2();
                    limitReachedBottomSheet.updatePremiumButtonText();
                    boolean z = baseFragment instanceof ChatActivity;
                    Long l2 = this.f$4;
                    boolean z2 = false;
                    if (!z ? !(!(baseFragment instanceof DialogsActivity) || (anonymousClass27 = ((DialogsActivity) baseFragment).rightSlidingDialogContainer) == null || anonymousClass27.getCurrentFragmetDialogId() != l2.longValue()) : ((ChatActivity) baseFragment).getDialogId() == l2.longValue()) {
                        z2 = true;
                    }
                    limitReachedBottomSheet.boostsStatus = (TL_stories.TL_premium_boostsStatus) this.f$3;
                    limitReachedBottomSheet.isCurrentChat = z2;
                    limitReachedBottomSheet.updateRows$7();
                    limitReachedBottomSheet.dialogId = l2.longValue();
                    limitReachedBottomSheet.updateRows$7();
                    limitReachedBottomSheet.chatMessageCell = this.f$5;
                    baseFragment.showDialog(limitReachedBottomSheet);
                    LaunchActivity$$ExternalSyntheticLambda13 launchActivity$$ExternalSyntheticLambda14 = this.f$2;
                    if (launchActivity$$ExternalSyntheticLambda14 != null) {
                        try {
                            launchActivity$$ExternalSyntheticLambda14.run();
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    break;
                }
                break;
        }
    }

    public LaunchActivity$$ExternalSyntheticLambda67(LaunchActivity launchActivity, Browser.Progress progress, LaunchActivity$$ExternalSyntheticLambda13 launchActivity$$ExternalSyntheticLambda13, ChannelBoostsController channelBoostsController, Long l, ChatMessageCell chatMessageCell) {
        this.f$0 = launchActivity;
        this.f$1 = progress;
        this.f$2 = launchActivity$$ExternalSyntheticLambda13;
        this.f$3 = channelBoostsController;
        this.f$4 = l;
        this.f$5 = chatMessageCell;
    }
}
