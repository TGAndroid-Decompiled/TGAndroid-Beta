package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class al0 implements Runnable {
    public final int f35694a;
    public final PasscodeActivity f35695b;
    public final boolean f35696c;

    public al0(PasscodeActivity passcodeActivity, boolean z10, int i10) {
        this.f35694a = i10;
        this.f35695b = passcodeActivity;
        this.f35696c = z10;
    }

    @Override
    public final void run() {
        switch (this.f35694a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f35695b;
                passcodeActivity.getMediaDataController().buildShortcuts();
                if (this.f35696c) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    kb0 kb0Var = passcodeActivity.U;
                    if (kb0Var != null) {
                        AndroidUtilities.runOnUIThread(kb0Var);
                        passcodeActivity.U = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f35695b;
                passcodeActivity2.f33534w.e(true, this.f35696c);
                AndroidUtilities.cancelRunOnUIThread(passcodeActivity2.T);
                return;
        }
    }
}
