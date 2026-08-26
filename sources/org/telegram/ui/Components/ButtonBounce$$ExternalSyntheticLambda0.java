package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import androidx.core.util.Consumer;

public final class ButtonBounce$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final Object f$0;

    public ButtonBounce$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                ((ButtonBounce) this.f$0).lambda$setPressed$0(valueAnimator);
                break;
            case 1:
                ((ChatAttachAlert.AnonymousClass1) this.f$0).lambda$onSetupMainButton$6(valueAnimator);
                break;
            case 2:
                ((ChatAttachAlert.AnonymousClass17) this.f$0).lambda$onDraw$0(valueAnimator);
                break;
            case 3:
                ((ChatAttachAlertPhotoLayoutPreview.PreviewGroupsView.PreviewGroupCell.MediaCell) this.f$0).lambda$startRevealMedia$1(valueAnimator);
                break;
            case 4:
                ((EmojiPacksAlert.EmojiPackHeader) this.f$0).lambda$toggle$6(valueAnimator);
                break;
            case 5:
                ((EmojiTabsStrip.EmojiTabsView) this.f$0).lambda$show$0(valueAnimator);
                break;
            case 6:
                ((EmojiView.SearchField) this.f$0).lambda$showInputBoxGradient$4(valueAnimator);
                break;
            case 7:
                ((FilterTabsView.AnonymousClass4) this.f$0).lambda$runPendingAnimations$0(valueAnimator);
                break;
            case 8:
                ((InviteMembersBottomSheet.SpansContainer) this.f$0).lambda$onMeasure$0(valueAnimator);
                break;
            case 9:
                ((PasscodeView.AnonymousClass9) this.f$0).lambda$onGlobalLayout$2(valueAnimator);
                break;
            case 10:
                ((PhotoViewerCaptionEnterView.AnonymousClass2) this.f$0).lambda$afterTextChanged$0(valueAnimator);
                break;
            case 11:
                ((ProfileGalleryView.AvatarImageView) this.f$0).lambda$onDraw$0(valueAnimator);
                break;
            case 12:
                ((ReactionsContainerLayout.InternalImageView) this.f$0).lambda$play$0(valueAnimator);
                break;
            case 13:
                ReactionsContainerLayout.LeftRightShadowsListener.lambda$startAnimator$4((Consumer) this.f$0, valueAnimator);
                break;
            case 14:
                ((ScrollSlidingTabStrip.AnonymousClass3) this.f$0).lambda$createAnimator$0(valueAnimator);
                break;
            case 15:
                ((ScrollableHorizontalScrollView) this.f$0).lambda$scrollTo$0(valueAnimator);
                break;
            case 16:
                ((ShareAlert.AnonymousClass21) this.f$0).lambda$onDraw$0(valueAnimator);
                break;
            case 17:
                ShareAlert.AnonymousClass22.lambda$dispatchDraw$0((EditTextCaption) this.f$0, valueAnimator);
                break;
            case 18:
                ((SizeNotifierFrameLayout.BlurBackgroundTask) this.f$0).lambda$run$0(valueAnimator);
                break;
            case 19:
                ((StickerMasksAlert.ImageViewEmoji) this.f$0).lambda$setPressed$0(valueAnimator);
                break;
            case 20:
                ((TrendingStickersAlert.AlertContainerView) this.f$0).lambda$setStatusBarVisible$0(valueAnimator);
                break;
            case 21:
                ((AnimatedTextView.AnimatedTextDrawable) this.f$0).lambda$setText$3(valueAnimator);
                break;
            case 22:
                ((AttachBotIntroTopView) this.f$0).lambda$new$0(valueAnimator);
                break;
            case 23:
                ((AudioPlayerAlert) this.f$0).lambda$setCustomPaddingRight$54(valueAnimator);
                break;
            case 24:
                ((AvatarConstructorFragment) this.f$0).lambda$isLightStatusBar$7(valueAnimator);
                break;
            case 25:
                ((AvatarsDrawable) this.f$0).lambda$commitTransition$0(valueAnimator);
                break;
            case 26:
                ((BatteryDrawable) this.f$0).lambda$setFillValue$0(valueAnimator);
                break;
            case 27:
                ((BlurringShader.StoryBlurDrawer) this.f$0).lambda$animateOldPaint$0(valueAnimator);
                break;
            case 28:
                ((ChatActivityEnterView.SendButton) this.f$0).lambda$bounceCount$0(valueAnimator);
                break;
            default:
                ((ChatSearchTabs) this.f$0).lambda$show$0(valueAnimator);
                break;
        }
    }
}
