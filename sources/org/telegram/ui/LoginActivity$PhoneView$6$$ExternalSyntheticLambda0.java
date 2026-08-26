package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;

public final class LoginActivity$PhoneView$6$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final LoginActivity.PhoneView.AnonymousClass6 f$0;
    public final LoginActivity.PhoneNumberConfirmView f$1;

    public LoginActivity$PhoneView$6$$ExternalSyntheticLambda0(int i, LoginActivity.PhoneNumberConfirmView phoneNumberConfirmView, LoginActivity.PhoneView.AnonymousClass6 anonymousClass6) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass6;
        this.f$1 = phoneNumberConfirmView;
    }

    @Override
    public final void run() {
        LoginActivity.PhoneNumberConfirmView phoneNumberConfirmView = this.f$1;
        LoginActivity.PhoneView.AnonymousClass6 anonymousClass6 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                anonymousClass6.getClass();
                int i = LoginActivity.PhoneNumberConfirmView.$r8$clinit;
                phoneNumberConfirmView.dismiss();
                AndroidUtilities.runOnUIThread(new LoginActivity$PhoneView$6$$ExternalSyntheticLambda0(1, phoneNumberConfirmView, anonymousClass6), 150L);
                break;
            default:
                LoginActivity.PhoneView phoneView = LoginActivity.PhoneView.this;
                phoneView.onNextPressed(null);
                RadialProgressView radialProgressView = LoginActivity.this.floatingButton.progressView;
                RadialProgressView radialProgressView2 = phoneNumberConfirmView.fabButton.progressView;
                radialProgressView.getClass();
                radialProgressView.lastUpdateTime = radialProgressView2.lastUpdateTime;
                radialProgressView.radOffset = radialProgressView2.radOffset;
                radialProgressView.toCircle = radialProgressView2.toCircle;
                radialProgressView.toCircleProgress = radialProgressView2.toCircleProgress;
                radialProgressView.noProgress = radialProgressView2.noProgress;
                radialProgressView.currentCircleLength = radialProgressView2.currentCircleLength;
                radialProgressView.drawingCircleLenght = radialProgressView2.drawingCircleLenght;
                radialProgressView.currentProgressTime = radialProgressView2.currentProgressTime;
                radialProgressView.currentProgress = radialProgressView2.currentProgress;
                radialProgressView.progressTime = radialProgressView2.progressTime;
                radialProgressView.animatedProgress = radialProgressView2.animatedProgress;
                radialProgressView.risingCircleLength = radialProgressView2.risingCircleLength;
                radialProgressView.progressAnimationStart = radialProgressView2.progressAnimationStart;
                radialProgressView.updateAnimation(85L);
                break;
        }
    }
}
