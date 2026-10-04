package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class il0 implements Runnable {
    public final int f37455a;
    public final PasscodeActivity f37456b;
    public final boolean f37457c;

    public il0(PasscodeActivity passcodeActivity, boolean z10, int i10) {
        this.f37455a = i10;
        this.f37456b = passcodeActivity;
        this.f37457c = z10;
    }

    @Override
    public final void run() {
        switch (this.f37455a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f37456b;
                passcodeActivity.getMediaDataController().buildShortcuts();
                if (this.f37457c) {
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
                PasscodeActivity passcodeActivity2 = this.f37456b;
                passcodeActivity2.f33847w.e(true, this.f37457c);
                AndroidUtilities.cancelRunOnUIThread(passcodeActivity2.P);
                return;
        }
    }
}
