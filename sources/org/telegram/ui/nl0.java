package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class nl0 implements Runnable {
    public final int f38980a;
    public final PasscodeActivity f38981b;
    public final boolean f38982c;

    public nl0(PasscodeActivity passcodeActivity, boolean z10, int i10) {
        this.f38980a = i10;
        this.f38981b = passcodeActivity;
        this.f38982c = z10;
    }

    @Override
    public final void run() {
        switch (this.f38980a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f38981b;
                passcodeActivity.getMediaDataController().buildShortcuts();
                if (this.f38982c) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    ac0 ac0Var = passcodeActivity.Q;
                    if (ac0Var != null) {
                        AndroidUtilities.runOnUIThread(ac0Var);
                        passcodeActivity.Q = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f38981b;
                passcodeActivity2.f33503w.e(true, this.f38982c);
                AndroidUtilities.cancelRunOnUIThread(passcodeActivity2.P);
                return;
        }
    }
}
