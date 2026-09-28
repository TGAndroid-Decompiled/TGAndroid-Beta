package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class dl0 implements Runnable {
    public final int f33154a;
    public final PasscodeActivity f33155b;

    public dl0(PasscodeActivity passcodeActivity, int i10) {
        this.f33154a = i10;
        this.f33155b = passcodeActivity;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f33154a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f33155b;
                passcodeActivity.f31174n.postDelayed(passcodeActivity.O, 3000L);
                passcodeActivity.N = true;
                return;
            case 1:
                PasscodeActivity passcodeActivity2 = new PasscodeActivity(0);
                PasscodeActivity passcodeActivity3 = this.f33155b;
                passcodeActivity3.presentFragment(passcodeActivity2, true);
                ub0 ub0Var = passcodeActivity3.Q;
                if (ub0Var != null) {
                    AndroidUtilities.runOnUIThread(ub0Var);
                    passcodeActivity3.Q = null;
                    return;
                }
                return;
            case 2:
                PasscodeActivity passcodeActivity4 = this.f33155b;
                dl0 dl0Var = new dl0(passcodeActivity4, 3);
                if (passcodeActivity4.e0()) {
                    j3 = 150;
                } else {
                    j3 = 1000;
                }
                AndroidUtilities.runOnUIThread(dl0Var, j3);
                return;
            case 3:
                PasscodeActivity passcodeActivity5 = this.f33155b;
                if (passcodeActivity5.e0()) {
                    for (as asVar : passcodeActivity5.f31174n.f40237f) {
                        asVar.i(0.0f);
                    }
                    return;
                }
                passcodeActivity5.f31173f.a(0.0f);
                return;
            case 4:
                PasscodeActivity passcodeActivity6 = this.f33155b;
                passcodeActivity6.N = false;
                AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity6.f31175r, false);
                return;
            default:
                this.f33155b.k0();
                return;
        }
    }
}
