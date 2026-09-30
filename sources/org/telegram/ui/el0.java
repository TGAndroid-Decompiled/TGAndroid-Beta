package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class el0 implements Runnable {
    public final int f33521a;
    public final PasscodeActivity f33522b;
    public final boolean f33523c;

    public el0(PasscodeActivity passcodeActivity, boolean z10, int i10) {
        this.f33521a = i10;
        this.f33522b = passcodeActivity;
        this.f33523c = z10;
    }

    @Override
    public final void run() {
        switch (this.f33521a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f33522b;
                passcodeActivity.getMediaDataController().buildShortcuts();
                if (this.f33523c) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    ub0 ub0Var = passcodeActivity.Q;
                    if (ub0Var != null) {
                        AndroidUtilities.runOnUIThread(ub0Var);
                        passcodeActivity.Q = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f33522b;
                passcodeActivity2.f31251w.e(true, this.f33523c);
                AndroidUtilities.cancelRunOnUIThread(passcodeActivity2.P);
                return;
        }
    }
}
