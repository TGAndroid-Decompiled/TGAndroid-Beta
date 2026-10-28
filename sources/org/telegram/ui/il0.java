package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class il0 implements Runnable {
    public final int f40204a;
    public final PasscodeActivity f40205b;
    public final boolean f40206c;

    public il0(PasscodeActivity passcodeActivity, boolean z10, int i10) {
        this.f40204a = i10;
        this.f40205b = passcodeActivity;
        this.f40206c = z10;
    }

    @Override
    public final void run() {
        switch (this.f40204a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f40205b;
                passcodeActivity.getMediaDataController().buildShortcuts();
                if (this.f40206c) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    jb0 jb0Var = passcodeActivity.U;
                    if (jb0Var != null) {
                        AndroidUtilities.runOnUIThread(jb0Var);
                        passcodeActivity.U = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f40205b;
                passcodeActivity2.f35624w.e(true, this.f40206c);
                AndroidUtilities.cancelRunOnUIThread(passcodeActivity2.T);
                return;
        }
    }
}
