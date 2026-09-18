package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class nl0 implements Runnable {
    public final int f35975a;
    public final PasscodeActivity f35976b;
    public final boolean f35977c;

    public nl0(PasscodeActivity passcodeActivity, boolean z10, int i10) {
        this.f35975a = i10;
        this.f35976b = passcodeActivity;
        this.f35977c = z10;
    }

    @Override
    public final void run() {
        switch (this.f35975a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f35976b;
                passcodeActivity.getMediaDataController().buildShortcuts();
                if (this.f35977c) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    bc0 bc0Var = passcodeActivity.Q;
                    if (bc0Var != null) {
                        AndroidUtilities.runOnUIThread(bc0Var);
                        passcodeActivity.Q = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f35976b;
                passcodeActivity2.f31135w.e(true, this.f35977c);
                AndroidUtilities.cancelRunOnUIThread(passcodeActivity2.P);
                return;
        }
    }
}
