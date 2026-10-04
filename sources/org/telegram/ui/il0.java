package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class il0 implements Runnable {
    public final int f37456a;
    public final PasscodeActivity f37457b;
    public final boolean f37458c;

    public il0(PasscodeActivity passcodeActivity, boolean z10, int i10) {
        this.f37456a = i10;
        this.f37457b = passcodeActivity;
        this.f37458c = z10;
    }

    @Override
    public final void run() {
        switch (this.f37456a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f37457b;
                passcodeActivity.getMediaDataController().buildShortcuts();
                if (this.f37458c) {
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
                PasscodeActivity passcodeActivity2 = this.f37457b;
                passcodeActivity2.f33848w.e(true, this.f37458c);
                AndroidUtilities.cancelRunOnUIThread(passcodeActivity2.P);
                return;
        }
    }
}
