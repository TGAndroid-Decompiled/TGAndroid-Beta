package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ml0 implements Runnable {
    public final int f35692a;
    public final PasscodeActivity f35693b;

    public ml0(PasscodeActivity passcodeActivity, int i10) {
        this.f35692a = i10;
        this.f35693b = passcodeActivity;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f35692a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f35693b;
                passcodeActivity.f31132n.postDelayed(passcodeActivity.O, 3000L);
                passcodeActivity.N = true;
                return;
            case 1:
                PasscodeActivity passcodeActivity2 = new PasscodeActivity(0);
                PasscodeActivity passcodeActivity3 = this.f35693b;
                passcodeActivity3.presentFragment(passcodeActivity2, true);
                bc0 bc0Var = passcodeActivity3.Q;
                if (bc0Var != null) {
                    AndroidUtilities.runOnUIThread(bc0Var);
                    passcodeActivity3.Q = null;
                    return;
                }
                return;
            case 2:
                PasscodeActivity passcodeActivity4 = this.f35693b;
                ml0 ml0Var = new ml0(passcodeActivity4, 3);
                if (passcodeActivity4.e0()) {
                    j3 = 150;
                } else {
                    j3 = 1000;
                }
                AndroidUtilities.runOnUIThread(ml0Var, j3);
                return;
            case 3:
                PasscodeActivity passcodeActivity5 = this.f35693b;
                if (passcodeActivity5.e0()) {
                    for (gs gsVar : passcodeActivity5.f31132n.f33074f) {
                        gsVar.i(0.0f);
                    }
                    return;
                }
                passcodeActivity5.f31131f.a(0.0f);
                return;
            case 4:
                PasscodeActivity passcodeActivity6 = this.f35693b;
                passcodeActivity6.N = false;
                AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity6.f31133r, false);
                return;
            default:
                this.f35693b.k0();
                return;
        }
    }
}
