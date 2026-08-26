package org.telegram.ui.Components;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class GroupCallPip$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;

    public GroupCallPip$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((GroupCallPip) this.f$0).lambda$new$0();
                break;
            case 1:
                ((ChatActivityEnterViewAnimatedIconView) this.f$0).lambda$setState$0();
                break;
            case 2:
                ((ChatAttachAlertPhotoLayoutPreview) this.f$0).lambda$onShow$1();
                break;
            case 3:
                ((ChatAttachAlertPollLayout) this.f$0).lambda$openAttachMenuForOptions$24();
                break;
            case 4:
                ((ChatNotificationsPopupWrapper.Callback) this.f$0).toggleMute();
                break;
            case 5:
                ((ChatReplyContainer.Layout) this.f$0).setVisibility(8);
                break;
            case 6:
                ((ClearHistoryAlert) this.f$0).lambda$showGiftOfferSheet$15();
                break;
            case 7:
                ((CompatDrawable) this.f$0).onAttachedToWindow();
                break;
            case 8:
                CreateBotAlert.lambda$show$3((BottomSheet) this.f$0);
                break;
            case 9:
                ((ButtonWithCounterView) this.f$0).setLoading(true);
                break;
            case 10:
                ((DialogsActivityStatusLayout) this.f$0).justForTest();
                break;
            case 11:
                ((DialogsChannelsAdapter) this.f$0).lambda$new$4();
                break;
            case 12:
                ((ViewTreeObserver.OnPreDrawListener) this.f$0).onPreDraw();
                break;
            case 13:
                ((FilterTabsView.TouchHelperCallback) this.f$0).lambda$new$0();
                break;
            case 14:
                ((FireworksOverlay) this.f$0).lambda$onDraw$0();
                break;
            case 15:
                ((HashtagsSearchAdapter) this.f$0).lambda$fillItems$0();
                break;
            case 16:
                ((ImportingAlert) this.f$0).lambda$new$0();
                break;
            case 17:
                ((MarqueeTextView) this.f$0).startMarqueeInternal();
                break;
            case 18:
                ((MediaActivity) this.f$0).lambda$onGetDebugItems$13();
                break;
            case 19:
                ((MentionsContainerView) this.f$0).lambda$new$0();
                break;
            case 20:
                ((MessagePrivateSeenView) this.f$0).request();
                break;
            case 21:
                ((MotionBackgroundDrawable) this.f$0).updateAnimation();
                break;
            case 22:
                ((MotionPhotoDrawable) this.f$0).invalidateSelf();
                break;
            case 23:
                ((MuteDrawable) this.f$0).invalidateSelf();
                break;
            case 24:
                ((OptionsSpeedIconDrawable) this.f$0).invalidateSelf();
                break;
            case 25:
                ((PagerSlidingTabStrip) this.f$0).notifyDataSetChanged();
                break;
            case 26:
                ((PermanentLinkBottomSheet) this.f$0).lambda$show$5();
                break;
            case 27:
                ((PhotoFilterView.EnhanceView) this.f$0).lambda$new$0();
                break;
            case 28:
                ((PhotoViewerCaptionEnterView) this.f$0).lambda$setFieldFocused$8();
                break;
            default:
                ((PhotoViewerCoverEditor) this.f$0).lambda$new$0();
                break;
        }
    }
}
