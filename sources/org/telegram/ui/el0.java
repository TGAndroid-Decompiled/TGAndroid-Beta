package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class el0 implements Runnable {
    public final int f32968a;
    public final PasscodeActivity f32969b;
    public final boolean f32970c;

    public el0(PasscodeActivity passcodeActivity, boolean z10, int i10) {
        this.f32968a = i10;
        this.f32969b = passcodeActivity;
        this.f32970c = z10;
    }

    @Override
    public final void run() {
        switch (this.f32968a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f32969b;
                passcodeActivity.getMediaDataController().buildShortcuts();
                if (this.f32970c) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    vb0 vb0Var = passcodeActivity.Q;
                    if (vb0Var != null) {
                        AndroidUtilities.runOnUIThread(vb0Var);
                        passcodeActivity.Q = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f32969b;
                passcodeActivity2.f30862w.e(true, this.f32970c);
                AndroidUtilities.cancelRunOnUIThread(passcodeActivity2.P);
                return;
        }
    }
}
