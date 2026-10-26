package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class gl0 implements Runnable {
    public final int f39714a;
    public final PasscodeActivity f39715b;
    public final boolean f39716c;

    public gl0(PasscodeActivity passcodeActivity, boolean z10, int i10) {
        this.f39714a = i10;
        this.f39715b = passcodeActivity;
        this.f39716c = z10;
    }

    @Override
    public final void run() {
        switch (this.f39714a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f39715b;
                passcodeActivity.getMediaDataController().buildShortcuts();
                if (this.f39716c) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    hb0 hb0Var = passcodeActivity.U;
                    if (hb0Var != null) {
                        AndroidUtilities.runOnUIThread(hb0Var);
                        passcodeActivity.U = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f39715b;
                passcodeActivity2.f35600w.e(true, this.f39716c);
                AndroidUtilities.cancelRunOnUIThread(passcodeActivity2.T);
                return;
        }
    }
}
