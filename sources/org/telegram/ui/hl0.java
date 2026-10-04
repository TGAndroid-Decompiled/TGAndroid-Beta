package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class hl0 implements Runnable {
    public final int f37114a;
    public final PasscodeActivity f37115b;

    public hl0(PasscodeActivity passcodeActivity, int i10) {
        this.f37114a = i10;
        this.f37115b = passcodeActivity;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f37114a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f37115b;
                passcodeActivity.f33845n.postDelayed(passcodeActivity.O, 3000L);
                passcodeActivity.N = true;
                return;
            case 1:
                PasscodeActivity passcodeActivity2 = new PasscodeActivity(0);
                PasscodeActivity passcodeActivity3 = this.f37115b;
                passcodeActivity3.presentFragment(passcodeActivity2, true);
                yb0 yb0Var = passcodeActivity3.Q;
                if (yb0Var != null) {
                    AndroidUtilities.runOnUIThread(yb0Var);
                    passcodeActivity3.Q = null;
                    return;
                }
                return;
            case 2:
                PasscodeActivity passcodeActivity4 = this.f37115b;
                hl0 hl0Var = new hl0(passcodeActivity4, 3);
                if (passcodeActivity4.e0()) {
                    j3 = 150;
                } else {
                    j3 = 1000;
                }
                AndroidUtilities.runOnUIThread(hl0Var, j3);
                return;
            case 3:
                PasscodeActivity passcodeActivity5 = this.f37115b;
                if (passcodeActivity5.e0()) {
                    for (es esVar : passcodeActivity5.f33845n.f35544f) {
                        esVar.i(0.0f);
                    }
                    return;
                }
                passcodeActivity5.f33844f.a(0.0f);
                return;
            case 4:
                PasscodeActivity passcodeActivity6 = this.f37115b;
                passcodeActivity6.N = false;
                AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity6.f33846r, false);
                return;
            default:
                this.f37115b.k0();
                return;
        }
    }
}
