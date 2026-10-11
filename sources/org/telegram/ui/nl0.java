package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class nl0 implements Runnable {
    public final int f40275a;
    public final PasscodeActivity f40276b;
    public final boolean f40277c;

    public nl0(PasscodeActivity passcodeActivity, boolean z10, int i10) {
        this.f40275a = i10;
        this.f40276b = passcodeActivity;
        this.f40277c = z10;
    }

    @Override
    public final void run() {
        switch (this.f40275a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f40276b;
                passcodeActivity.getMediaDataController().buildShortcuts();
                if (this.f40277c) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    yb0 yb0Var = passcodeActivity.U;
                    if (yb0Var != null) {
                        AndroidUtilities.runOnUIThread(yb0Var);
                        passcodeActivity.U = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f40276b;
                passcodeActivity2.f33885w.e(true, this.f40277c);
                AndroidUtilities.cancelRunOnUIThread(passcodeActivity2.T);
                return;
        }
    }
}
