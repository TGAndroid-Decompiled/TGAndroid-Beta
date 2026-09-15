package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class jl0 implements Runnable {
    public final int f34936a;
    public final PasscodeActivity f34937b;

    public jl0(PasscodeActivity passcodeActivity, int i10) {
        this.f34936a = i10;
        this.f34937b = passcodeActivity;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f34936a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f34937b;
                passcodeActivity.f30888n.postDelayed(passcodeActivity.O, 3000L);
                passcodeActivity.N = true;
                return;
            case 1:
                PasscodeActivity passcodeActivity2 = new PasscodeActivity(0);
                PasscodeActivity passcodeActivity3 = this.f34937b;
                passcodeActivity3.presentFragment(passcodeActivity2, true);
                ac0 ac0Var = passcodeActivity3.Q;
                if (ac0Var != null) {
                    AndroidUtilities.runOnUIThread(ac0Var);
                    passcodeActivity3.Q = null;
                    return;
                }
                return;
            case 2:
                PasscodeActivity passcodeActivity4 = this.f34937b;
                jl0 jl0Var = new jl0(passcodeActivity4, 3);
                if (passcodeActivity4.e0()) {
                    j3 = 150;
                } else {
                    j3 = 1000;
                }
                AndroidUtilities.runOnUIThread(jl0Var, j3);
                return;
            case 3:
                PasscodeActivity passcodeActivity5 = this.f34937b;
                if (passcodeActivity5.e0()) {
                    for (gs gsVar : passcodeActivity5.f30888n.f33120f) {
                        gsVar.i(0.0f);
                    }
                    return;
                }
                passcodeActivity5.f30887f.a(0.0f);
                return;
            case 4:
                PasscodeActivity passcodeActivity6 = this.f34937b;
                passcodeActivity6.N = false;
                AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity6.f30889r, false);
                return;
            default:
                this.f34937b.k0();
                return;
        }
    }
}
