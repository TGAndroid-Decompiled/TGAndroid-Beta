package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class ol0 implements Runnable {
    public final int f40557a;
    public final PasscodeActivity f40558b;
    public final boolean f40559c;

    public ol0(PasscodeActivity passcodeActivity, boolean z10, int i10) {
        this.f40557a = i10;
        this.f40558b = passcodeActivity;
        this.f40559c = z10;
    }

    @Override
    public final void run() {
        switch (this.f40557a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f40558b;
                passcodeActivity.getMediaDataController().buildShortcuts();
                if (this.f40559c) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    zb0 zb0Var = passcodeActivity.U;
                    if (zb0Var != null) {
                        AndroidUtilities.runOnUIThread(zb0Var);
                        passcodeActivity.U = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f40558b;
                passcodeActivity2.f33857w.e(true, this.f40559c);
                AndroidUtilities.cancelRunOnUIThread(passcodeActivity2.T);
                return;
        }
    }
}
