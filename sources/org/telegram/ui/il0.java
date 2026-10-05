package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class il0 implements Runnable {
    public final int f37448a;
    public final PasscodeActivity f37449b;
    public final boolean f37450c;

    public il0(PasscodeActivity passcodeActivity, boolean z10, int i10) {
        this.f37448a = i10;
        this.f37449b = passcodeActivity;
        this.f37450c = z10;
    }

    @Override
    public final void run() {
        switch (this.f37448a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f37449b;
                passcodeActivity.getMediaDataController().buildShortcuts();
                if (this.f37450c) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    yb0 yb0Var = passcodeActivity.Q;
                    if (yb0Var != null) {
                        AndroidUtilities.runOnUIThread(yb0Var);
                        passcodeActivity.Q = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f37449b;
                passcodeActivity2.f33867w.e(true, this.f37450c);
                AndroidUtilities.cancelRunOnUIThread(passcodeActivity2.P);
                return;
        }
    }
}
