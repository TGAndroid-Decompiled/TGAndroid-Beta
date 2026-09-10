package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class ml0 implements Runnable {
    public final int f34998a;
    public final PasscodeActivity f34999b;
    public final boolean f35000c;

    public ml0(PasscodeActivity passcodeActivity, boolean z10, int i10) {
        this.f34998a = i10;
        this.f34999b = passcodeActivity;
        this.f35000c = z10;
    }

    @Override
    public final void run() {
        switch (this.f34998a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f34999b;
                passcodeActivity.getMediaDataController().buildShortcuts();
                if (this.f35000c) {
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
                PasscodeActivity passcodeActivity2 = this.f34999b;
                passcodeActivity2.f30004w.e(true, this.f35000c);
                AndroidUtilities.cancelRunOnUIThread(passcodeActivity2.P);
                return;
        }
    }
}
