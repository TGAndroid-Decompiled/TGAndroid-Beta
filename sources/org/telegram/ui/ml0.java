package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ml0 implements Runnable {
    public final int f38758a;
    public final PasscodeActivity f38759b;

    public ml0(PasscodeActivity passcodeActivity, int i10) {
        this.f38758a = i10;
        this.f38759b = passcodeActivity;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f38758a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f38759b;
                passcodeActivity.f33527n.postDelayed(passcodeActivity.O, 3000L);
                passcodeActivity.N = true;
                return;
            case 1:
                PasscodeActivity passcodeActivity2 = new PasscodeActivity(0);
                PasscodeActivity passcodeActivity3 = this.f38759b;
                passcodeActivity3.presentFragment(passcodeActivity2, true);
                ac0 ac0Var = passcodeActivity3.Q;
                if (ac0Var != null) {
                    AndroidUtilities.runOnUIThread(ac0Var);
                    passcodeActivity3.Q = null;
                    return;
                }
                return;
            case 2:
                PasscodeActivity passcodeActivity4 = this.f38759b;
                ml0 ml0Var = new ml0(passcodeActivity4, 3);
                if (passcodeActivity4.e0()) {
                    j3 = 150;
                } else {
                    j3 = 1000;
                }
                AndroidUtilities.runOnUIThread(ml0Var, j3);
                return;
            case 3:
                PasscodeActivity passcodeActivity5 = this.f38759b;
                if (passcodeActivity5.e0()) {
                    for (gs gsVar : passcodeActivity5.f33527n.f36190f) {
                        gsVar.i(0.0f);
                    }
                    return;
                }
                passcodeActivity5.f33526f.a(0.0f);
                return;
            case 4:
                PasscodeActivity passcodeActivity6 = this.f38759b;
                passcodeActivity6.N = false;
                AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity6.f33528r, false);
                return;
            default:
                this.f38759b.k0();
                return;
        }
    }
}
