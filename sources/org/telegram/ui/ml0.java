package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class ml0 implements Runnable {
    public final int f35836a;
    public final PasscodeActivity f35837b;
    public final boolean f35838c;

    public ml0(PasscodeActivity passcodeActivity, boolean z10, int i10) {
        this.f35836a = i10;
        this.f35837b = passcodeActivity;
        this.f35838c = z10;
    }

    @Override
    public final void run() {
        switch (this.f35836a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f35837b;
                passcodeActivity.getMediaDataController().buildShortcuts();
                if (this.f35838c) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    cc0 cc0Var = passcodeActivity.Q;
                    if (cc0Var != null) {
                        AndroidUtilities.runOnUIThread(cc0Var);
                        passcodeActivity.Q = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f35837b;
                passcodeActivity2.f30905w.e(true, this.f35838c);
                AndroidUtilities.cancelRunOnUIThread(passcodeActivity2.P);
                return;
        }
    }
}
