package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class el0 implements Runnable {
    public final int f33438a;
    public final PasscodeActivity f33439b;
    public final boolean f33440c;

    public el0(PasscodeActivity passcodeActivity, boolean z10, int i10) {
        this.f33438a = i10;
        this.f33439b = passcodeActivity;
        this.f33440c = z10;
    }

    @Override
    public final void run() {
        switch (this.f33438a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f33439b;
                passcodeActivity.getMediaDataController().buildShortcuts();
                if (this.f33440c) {
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
                PasscodeActivity passcodeActivity2 = this.f33439b;
                passcodeActivity2.f31177w.e(true, this.f33440c);
                AndroidUtilities.cancelRunOnUIThread(passcodeActivity2.P);
                return;
        }
    }
}
