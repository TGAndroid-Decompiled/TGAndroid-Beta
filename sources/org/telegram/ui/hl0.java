package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class hl0 implements Runnable {
    public final int f34247a;
    public final PasscodeActivity f34248b;
    public final boolean f34249c;

    public hl0(PasscodeActivity passcodeActivity, boolean z10, int i10) {
        this.f34247a = i10;
        this.f34248b = passcodeActivity;
        this.f34249c = z10;
    }

    @Override
    public final void run() {
        switch (this.f34247a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f34248b;
                passcodeActivity.getMediaDataController().buildShortcuts();
                if (this.f34249c) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    xb0 xb0Var = passcodeActivity.Q;
                    if (xb0Var != null) {
                        AndroidUtilities.runOnUIThread(xb0Var);
                        passcodeActivity.Q = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f34248b;
                passcodeActivity2.f31179w.e(true, this.f34249c);
                AndroidUtilities.cancelRunOnUIThread(passcodeActivity2.P);
                return;
        }
    }
}
