package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class nl0 implements Runnable {
    public final int f40309a;
    public final PasscodeActivity f40310b;
    public final boolean f40311c;

    public nl0(PasscodeActivity passcodeActivity, boolean z10, int i10) {
        this.f40309a = i10;
        this.f40310b = passcodeActivity;
        this.f40311c = z10;
    }

    @Override
    public final void run() {
        switch (this.f40309a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f40310b;
                passcodeActivity.getMediaDataController().buildShortcuts();
                if (this.f40311c) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    yb0 yb0Var = passcodeActivity.U;
                    if (yb0Var != null) {
                        AndroidUtilities.runOnUIThread(yb0Var);
                        passcodeActivity.U = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f40310b;
                passcodeActivity2.f33919w.e(true, this.f40311c);
                AndroidUtilities.cancelRunOnUIThread(passcodeActivity2.T);
                return;
        }
    }
}
