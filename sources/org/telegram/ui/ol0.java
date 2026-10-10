package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class ol0 implements Runnable {
    public final int f40603a;
    public final PasscodeActivity f40604b;
    public final boolean f40605c;

    public ol0(PasscodeActivity passcodeActivity, boolean z10, int i10) {
        this.f40603a = i10;
        this.f40604b = passcodeActivity;
        this.f40605c = z10;
    }

    @Override
    public final void run() {
        switch (this.f40603a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f40604b;
                passcodeActivity.getMediaDataController().buildShortcuts();
                if (this.f40605c) {
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
                PasscodeActivity passcodeActivity2 = this.f40604b;
                passcodeActivity2.f33895w.e(true, this.f40605c);
                AndroidUtilities.cancelRunOnUIThread(passcodeActivity2.T);
                return;
        }
    }
}
