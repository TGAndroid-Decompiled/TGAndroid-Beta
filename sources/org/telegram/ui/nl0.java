package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class nl0 implements Runnable {
    public final int f36070a;
    public final PasscodeActivity f36071b;
    public final boolean f36072c;

    public nl0(PasscodeActivity passcodeActivity, boolean z10, int i10) {
        this.f36070a = i10;
        this.f36071b = passcodeActivity;
        this.f36072c = z10;
    }

    @Override
    public final void run() {
        switch (this.f36070a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f36071b;
                passcodeActivity.getMediaDataController().buildShortcuts();
                if (this.f36072c) {
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
                PasscodeActivity passcodeActivity2 = this.f36071b;
                passcodeActivity2.f31196w.e(true, this.f36072c);
                AndroidUtilities.cancelRunOnUIThread(passcodeActivity2.P);
                return;
        }
    }
}
