package org.telegram.ui;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.voip.VoIPFloatingLayout;
import org.telegram.ui.Components.voip.VoIpSwitchLayout;

public final class VoIPFragment$$ExternalSyntheticLambda12 implements AlertDialog.OnButtonClickListener, OnApplyWindowInsetsListener, VoIPFloatingLayout.VoIPFloatingLayoutDelegate, VoIpSwitchLayout.VoIpButtonView.OnBtnClickedListener {
    public final int $r8$classId;
    public final VoIPFragment f$0;

    public VoIPFragment$$ExternalSyntheticLambda12(VoIPFragment voIPFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = voIPFragment;
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
        VoIPFragment voIPFragment = this.f$0;
        voIPFragment.lastInsets = windowInsets;
        ((FrameLayout.LayoutParams) voIPFragment.buttonsLayout.getLayoutParams()).bottomMargin = voIPFragment.lastInsets.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) voIPFragment.acceptDeclineView.getLayoutParams()).bottomMargin = voIPFragment.lastInsets.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) voIPFragment.backIcon.getLayoutParams()).topMargin = voIPFragment.lastInsets.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) voIPFragment.addIcon.getLayoutParams()).topMargin = voIPFragment.lastInsets.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) voIPFragment.speakerPhoneIcon.getLayoutParams()).topMargin = voIPFragment.lastInsets.getSystemWindowInsetTop() + AndroidUtilities.dp(56.0f);
        ((FrameLayout.LayoutParams) voIPFragment.statusLayout.getLayoutParams()).topMargin = voIPFragment.lastInsets.getSystemWindowInsetTop() + AndroidUtilities.dp(135.0f);
        ((FrameLayout.LayoutParams) voIPFragment.emojiLayout.getLayoutParams()).topMargin = voIPFragment.lastInsets.getSystemWindowInsetTop() + AndroidUtilities.dp(17.0f);
        ((FrameLayout.LayoutParams) voIPFragment.callingUserPhotoViewMini.getLayoutParams()).topMargin = voIPFragment.lastInsets.getSystemWindowInsetTop() + AndroidUtilities.dp(93.0f);
        ((FrameLayout.LayoutParams) voIPFragment.hideEmojiLayout.getLayoutParams()).topMargin = voIPFragment.lastInsets.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) voIPFragment.emojiRationalLayout.getLayoutParams()).topMargin = voIPFragment.lastInsets.getSystemWindowInsetTop() + AndroidUtilities.dp(118.0f);
        ((FrameLayout.LayoutParams) voIPFragment.rateCallLayout.getLayoutParams()).topMargin = voIPFragment.lastInsets.getSystemWindowInsetTop() + AndroidUtilities.dp(380.0f);
        ((FrameLayout.LayoutParams) voIPFragment.callingUserMiniFloatingLayout.getLayoutParams()).bottomMargin = voIPFragment.lastInsets.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) voIPFragment.notificationsLayout.getLayoutParams()).bottomMargin = voIPFragment.lastInsets.getSystemWindowInsetBottom();
        voIPFragment.currentUserCameraFloatingLayout.setInsets(voIPFragment.lastInsets);
        voIPFragment.callingUserMiniFloatingLayout.setInsets(voIPFragment.lastInsets);
        voIPFragment.fragmentView.requestLayout();
        VoIPFragment.AnonymousClass24 anonymousClass24 = voIPFragment.previewDialog;
        if (anonymousClass24 != null) {
            anonymousClass24.setBottomPadding(voIPFragment.lastInsets.getSystemWindowInsetBottom());
        }
        return WindowInsetsCompat.CONSUMED;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 1:
                this.f$0.windowView.finish(330L);
                break;
            default:
                VoIPFragment.AnonymousClass1 anonymousClass1 = this.f$0.windowView;
                if (anonymousClass1 != null) {
                    anonymousClass1.finish(330L);
                }
                break;
        }
    }

    @Override
    public void onClicked(VoIpSwitchLayout.VoIpButtonView voIpButtonView) {
        switch (this.$r8$classId) {
            case 4:
                VoIPFragment voIPFragment = this.f$0;
                voIPFragment.getClass();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    AndroidUtilities.cancelRunOnUIThread(voIPFragment.hideUIRunnable);
                    voIPFragment.hideUiRunnableWaiting = false;
                    boolean zIsMicMute = sharedInstance.isMicMute();
                    boolean z = !zIsMicMute;
                    if (voIPFragment.accessibilityManager.isTouchExplorationEnabled()) {
                        voIpButtonView.announceForAccessibility(LocaleController.getString(!zIsMicMute ? R.string.AccDescrVoipMicOff : R.string.AccDescrVoipMicOn));
                    }
                    sharedInstance.setMicMute(z, false, true);
                    voIPFragment.previousState = voIPFragment.currentState;
                    voIPFragment.updateViewState$1();
                }
                break;
            default:
                VoIPFragment voIPFragment2 = this.f$0;
                AndroidUtilities.cancelRunOnUIThread(voIPFragment2.hideUIRunnable);
                voIPFragment2.hideUiRunnableWaiting = false;
                if (Build.VERSION.SDK_INT >= 23 && voIPFragment2.activity.checkSelfPermission("android.permission.CAMERA") != 0) {
                    voIPFragment2.activity.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
                } else {
                    voIPFragment2.toggleCameraInput();
                }
                break;
        }
    }
}
