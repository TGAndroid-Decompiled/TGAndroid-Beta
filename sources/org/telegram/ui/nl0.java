package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class nl0 implements Runnable {
    public final int f39008a;
    public final PasscodeActivity f39009b;
    public final boolean f39010c;

    public nl0(PasscodeActivity passcodeActivity, boolean z10, int i10) {
        this.f39008a = i10;
        this.f39009b = passcodeActivity;
        this.f39010c = z10;
    }

    @Override
    public final void run() {
        switch (this.f39008a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f39009b;
                passcodeActivity.getMediaDataController().buildShortcuts();
                if (this.f39010c) {
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
                PasscodeActivity passcodeActivity2 = this.f39009b;
                passcodeActivity2.f33531w.e(true, this.f39010c);
                AndroidUtilities.cancelRunOnUIThread(passcodeActivity2.P);
                return;
        }
    }
}
