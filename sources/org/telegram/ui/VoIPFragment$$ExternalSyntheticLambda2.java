package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.voip.VoIPFloatingLayout;
import org.telegram.ui.Components.voip.VoIpGradientLayout;
import org.telegram.ui.Components.voip.VoIpHintView;

public final class VoIPFragment$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final VoIPFragment f$0;

    public VoIPFragment$$ExternalSyntheticLambda2(VoIPFragment voIPFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = voIPFragment;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                VoIPFragment voIPFragment = this.f$0;
                voIPFragment.getClass();
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(1);
                    voIPFragment.encryptionTooltip.setTranslationY(voIPFragment.emojiLayout.getY() + AndroidUtilities.dp(36.0f));
                    voIPFragment.encryptionTooltip.show();
                }
                break;
            case 1:
                finish(330L);
                break;
            case 2:
                finish(330L);
                break;
            case 3:
                finish(330L);
                break;
            case 4:
                VoIPFloatingLayout voIPFloatingLayout = this.f$0.callingUserMiniFloatingLayout;
                voIPFloatingLayout.isAppearing = false;
                voIPFloatingLayout.invalidate();
                break;
            case 5:
                VoIPFragment voIPFragment2 = this.f$0;
                voIPFragment2.previousState = voIPFragment2.currentState;
                voIPFragment2.updateViewState$1();
                break;
            case 6:
                this.f$0.startWaitingFoHideUi();
                break;
            case 7:
                finish(330L);
                break;
            case 8:
                finish(330L);
                break;
            case 9:
                VoIPFragment voIPFragment3 = this.f$0;
                voIPFragment3.windowView.setAlpha(1.0f);
                voIPFragment3.windowView.invalidate();
                ValueAnimator valueAnimatorCreatePiPTransition = voIPFragment3.createPiPTransition(true);
                voIPFragment3.backIcon.setAlpha(0.0f);
                voIPFragment3.addIcon.setAlpha(0.0f);
                voIPFragment3.emojiLayout.setAlpha(0.0f);
                voIPFragment3.statusLayout.setAlpha(0.0f);
                voIPFragment3.buttonsLayout.setAlpha(0.0f);
                voIPFragment3.bottomShadow.setAlpha(0.0f);
                voIPFragment3.topShadow.setAlpha(0.0f);
                voIPFragment3.speakerPhoneIcon.setAlpha(0.0f);
                voIPFragment3.notificationsLayout.setAlpha(0.0f);
                voIPFragment3.currentUserCameraFloatingLayout.switchingToPip = true;
                AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda9(24, voIPFragment3, valueAnimatorCreatePiPTransition), 32L);
                break;
            case 10:
                int[] iArr = new int[2];
                VoIPFragment voIPFragment4 = this.f$0;
                voIPFragment4.acceptDeclineView.getLocationOnScreen(iArr);
                int i = iArr[0];
                int i2 = iArr[1];
                voIPFragment4.bottomSpeakerBtn.getLocationOnScreen(iArr);
                voIPFragment4.bottomSpeakerBtn.setTranslationX(AndroidUtilities.dp(42.0f) + (i - iArr[0]));
                voIPFragment4.bottomSpeakerBtn.setTranslationY(AndroidUtilities.dp(44.0f) + (i2 - iArr[1]));
                voIPFragment4.bottomMuteBtn.getLocationOnScreen(iArr);
                voIPFragment4.bottomMuteBtn.setTranslationX(AndroidUtilities.dp(42.0f) + (i - iArr[0]));
                voIPFragment4.bottomMuteBtn.setTranslationY(AndroidUtilities.dp(44.0f) + (i2 - iArr[1]));
                voIPFragment4.bottomVideoBtn.getLocationOnScreen(iArr);
                voIPFragment4.bottomVideoBtn.setTranslationX(AndroidUtilities.dp(42.0f) + (i - iArr[0]));
                voIPFragment4.bottomVideoBtn.setTranslationY(AndroidUtilities.dp(44.0f) + (i2 - iArr[1]));
                voIPFragment4.bottomEndCallBtn.getLocationOnScreen(iArr);
                voIPFragment4.bottomEndCallBtn.setTranslationX((((voIPFragment4.acceptDeclineView.getWidth() + i) - iArr[0]) - AndroidUtilities.dp(49.0f)) - AndroidUtilities.dp(60.0f));
                voIPFragment4.bottomEndCallBtn.setTranslationY(AndroidUtilities.dp(44.0f) + (i2 - iArr[1]));
                voIPFragment4.bottomEndCallBtn.setAlpha(1.0f);
                voIPFragment4.bottomSpeakerBtn.setAlpha(1.0f);
                voIPFragment4.bottomMuteBtn.setAlpha(1.0f);
                voIPFragment4.bottomVideoBtn.setAlpha(1.0f);
                long j = 200;
                voIPFragment4.bottomEndCallBtn.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j).start();
                voIPFragment4.bottomSpeakerBtn.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j).start();
                voIPFragment4.bottomMuteBtn.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j).start();
                voIPFragment4.bottomVideoBtn.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j).start();
                break;
            case 11:
                finish(330L);
                break;
            case 12:
                VoIPFragment voIPFragment5 = this.f$0;
                voIPFragment5.hideUiRunnableWaiting = false;
                VoIpHintView voIpHintView = voIPFragment5.tapToVideoTooltip;
                boolean z = voIpHintView != null && voIpHintView.shown;
                if (voIPFragment5.canHideUI && voIPFragment5.uiVisible && !voIPFragment5.emojiExpanded && !z) {
                    voIPFragment5.lastContentTapTime = System.currentTimeMillis();
                    voIPFragment5.showUi(false);
                    voIPFragment5.previousState = voIPFragment5.currentState;
                    voIPFragment5.updateViewState$1();
                    break;
                }
                break;
            default:
                VoIPFragment voIPFragment6 = this.f$0;
                if (voIPFragment6.currentState == 3) {
                    voIPFragment6.callingUserPhotoViewMini.setMute(true, false);
                    VoIpGradientLayout voIpGradientLayout = voIPFragment6.gradientLayout;
                    if (!voIpGradientLayout.isPaused) {
                        voIpGradientLayout.isPaused = true;
                        break;
                    }
                }
                break;
        }
    }
}
