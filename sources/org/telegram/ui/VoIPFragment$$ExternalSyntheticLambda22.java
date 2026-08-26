package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

public final class VoIPFragment$$ExternalSyntheticLambda22 implements View.OnClickListener {
    public final int $r8$classId;
    public final VoIPFragment f$0;

    public VoIPFragment$$ExternalSyntheticLambda22(VoIPFragment voIPFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = voIPFragment;
    }

    @Override
    public final void onClick(View view) {
        VoIPService sharedInstance;
        switch (this.$r8$classId) {
            case 0:
                VoIPFragment voIPFragment = this.f$0;
                if (voIPFragment.currentUserIsVideo && voIPFragment.callingUserIsVideo && System.currentTimeMillis() - voIPFragment.lastContentTapTime > 500) {
                    AndroidUtilities.cancelRunOnUIThread(voIPFragment.hideUIRunnable);
                    voIPFragment.hideUiRunnableWaiting = false;
                    voIPFragment.lastContentTapTime = System.currentTimeMillis();
                    voIPFragment.callingUserMiniFloatingLayout.setRelativePosition(voIPFragment.currentUserCameraFloatingLayout);
                    voIPFragment.currentUserCameraIsFullscreen = true;
                    voIPFragment.cameraForceExpanded = true;
                    voIPFragment.previousState = voIPFragment.currentState;
                    voIPFragment.updateViewState$1();
                    break;
                }
                break;
            case 1:
                VoIPFragment voIPFragment2 = this.f$0;
                if (voIPFragment2.cameraForceExpanded && System.currentTimeMillis() - voIPFragment2.lastContentTapTime > 500) {
                    AndroidUtilities.cancelRunOnUIThread(voIPFragment2.hideUIRunnable);
                    voIPFragment2.hideUiRunnableWaiting = false;
                    voIPFragment2.lastContentTapTime = System.currentTimeMillis();
                    voIPFragment2.currentUserCameraFloatingLayout.setRelativePosition(voIPFragment2.callingUserMiniFloatingLayout);
                    voIPFragment2.currentUserCameraIsFullscreen = false;
                    voIPFragment2.cameraForceExpanded = false;
                    voIPFragment2.previousState = voIPFragment2.currentState;
                    voIPFragment2.updateViewState$1();
                    break;
                }
                break;
            case 2:
                VoIPFragment voIPFragment3 = this.f$0;
                if (System.currentTimeMillis() - voIPFragment3.lastContentTapTime >= 500) {
                    voIPFragment3.lastContentTapTime = System.currentTimeMillis();
                    boolean z = voIPFragment3.emojiExpanded;
                    if (!z && voIPFragment3.emojiLoaded) {
                        voIPFragment3.expandEmoji(!z);
                    }
                    break;
                }
                break;
            case 3:
                VoIPFragment voIPFragment4 = this.f$0;
                if (System.currentTimeMillis() - voIPFragment4.lastContentTapTime >= 500) {
                    voIPFragment4.lastContentTapTime = System.currentTimeMillis();
                    if (voIPFragment4.emojiLoaded) {
                        voIPFragment4.expandEmoji(!voIPFragment4.emojiExpanded);
                    }
                    break;
                }
                break;
            case 4:
                VoIPFragment voIPFragment5 = this.f$0;
                if (voIPFragment5.speakerPhoneIcon.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    voIPFragment5.startWaitingFoHideUi();
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(voIPFragment5.activity, false, Integer.valueOf(sharedInstance.isBluetoothOn() ? 2 : sharedInstance.isSpeakerphoneOn() ? 0 : 1));
                }
                break;
            case 5:
                this.f$0.onBackPressed$1();
                break;
            default:
                VoIPFragment voIPFragment6 = this.f$0;
                voIPFragment6.getClass();
                if (VoIPService.getSharedInstance() != null) {
                    AndroidUtilities.cancelRunOnUIThread(voIPFragment6.hideUIRunnable);
                    voIPFragment6.hideUiRunnableWaiting = false;
                    VoIPService.getSharedInstance().hangUp();
                }
                break;
        }
    }
}
