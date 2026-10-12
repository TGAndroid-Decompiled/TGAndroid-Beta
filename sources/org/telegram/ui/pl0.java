package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class pl0 implements Runnable {
    public final int f40992a;
    public final PasscodeActivity f40993b;
    public final boolean f40994c;

    public pl0(PasscodeActivity passcodeActivity, boolean z10, int i10) {
        this.f40992a = i10;
        this.f40993b = passcodeActivity;
        this.f40994c = z10;
    }

    @Override
    public final void run() {
        switch (this.f40992a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f40993b;
                passcodeActivity.getMediaDataController().buildShortcuts();
                if (this.f40994c) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    ac0 ac0Var = passcodeActivity.U;
                    if (ac0Var != null) {
                        AndroidUtilities.runOnUIThread(ac0Var);
                        passcodeActivity.U = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f40993b;
                passcodeActivity2.f33696w.e(true, this.f40994c);
                AndroidUtilities.cancelRunOnUIThread(passcodeActivity2.T);
                return;
        }
    }
}
