package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class kl0 implements Runnable {
    public final int f35182a;
    public final PasscodeActivity f35183b;
    public final boolean f35184c;

    public kl0(PasscodeActivity passcodeActivity, boolean z10, int i10) {
        this.f35182a = i10;
        this.f35183b = passcodeActivity;
        this.f35184c = z10;
    }

    @Override
    public final void run() {
        switch (this.f35182a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f35183b;
                passcodeActivity.getMediaDataController().buildShortcuts();
                if (this.f35184c) {
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
                PasscodeActivity passcodeActivity2 = this.f35183b;
                passcodeActivity2.f30888w.e(true, this.f35184c);
                AndroidUtilities.cancelRunOnUIThread(passcodeActivity2.P);
                return;
        }
    }
}
