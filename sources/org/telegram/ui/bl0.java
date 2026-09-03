package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class bl0 implements Runnable {
    public final int f32908a;
    public final PasscodeActivity f32909b;
    public final boolean f32910c;

    public bl0(PasscodeActivity passcodeActivity, boolean z4, int i10) {
        this.f32908a = i10;
        this.f32909b = passcodeActivity;
        this.f32910c = z4;
    }

    @Override
    public final void run() {
        switch (this.f32908a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f32909b;
                passcodeActivity.getMediaDataController().buildShortcuts();
                if (this.f32910c) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    sb0 sb0Var = passcodeActivity.N;
                    if (sb0Var != null) {
                        AndroidUtilities.runOnUIThread(sb0Var);
                        passcodeActivity.N = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f32909b;
                passcodeActivity2.f31663w.e(true, this.f32910c);
                AndroidUtilities.cancelRunOnUIThread(passcodeActivity2.M);
                return;
        }
    }
}
