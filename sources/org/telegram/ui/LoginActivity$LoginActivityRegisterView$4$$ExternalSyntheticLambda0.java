package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RLottieDrawable;

public final class LoginActivity$LoginActivityRegisterView$4$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final LoginActivity.LoginActivityRegisterView.AnonymousClass4 f$0;

    public LoginActivity$LoginActivityRegisterView$4$$ExternalSyntheticLambda0(LoginActivity.LoginActivityRegisterView.AnonymousClass4 anonymousClass4, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass4;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                LoginActivity.LoginActivityRegisterView.AnonymousClass4 anonymousClass4 = this.f$0;
                if (anonymousClass4.isAttached) {
                    LoginActivity.LoginActivityRegisterView loginActivityRegisterView = LoginActivity.LoginActivityRegisterView.this;
                    boolean z = loginActivityRegisterView.isCameraWaitAnimationAllowed;
                    ChannelCreateActivity.AnonymousClass5 anonymousClass5 = loginActivityRegisterView.avatarEditor;
                    if (z && System.currentTimeMillis() - anonymousClass4.lastRun >= 10000) {
                        RLottieDrawable rLottieDrawable = loginActivityRegisterView.cameraWaitDrawable;
                        anonymousClass5.setAnimation(rLottieDrawable);
                        rLottieDrawable.setCurrentFrame(0, false, false);
                        rLottieDrawable.onAnimationEndListener = new LoginActivity$LoginActivityRegisterView$4$$ExternalSyntheticLambda0(anonymousClass4, 1);
                        anonymousClass5.playAnimation();
                        anonymousClass4.lastRun = System.currentTimeMillis();
                    }
                    anonymousClass5.postDelayed(anonymousClass4.cameraWaitCallback, 1000L);
                }
                break;
            case 1:
                LoginActivity.LoginActivityRegisterView.AnonymousClass4 anonymousClass6 = this.f$0;
                anonymousClass6.getClass();
                AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivityRegisterView$4$$ExternalSyntheticLambda0(anonymousClass6, 2));
                break;
            default:
                LoginActivity.LoginActivityRegisterView loginActivityRegisterView2 = LoginActivity.LoginActivityRegisterView.this;
                loginActivityRegisterView2.cameraDrawable.setCurrentFrame(0, false, false);
                loginActivityRegisterView2.avatarEditor.setAnimation(loginActivityRegisterView2.cameraDrawable);
                break;
        }
    }
}
