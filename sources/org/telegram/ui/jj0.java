package org.telegram.ui;
public final class jj0 implements Runnable {
    public final int f38402a;
    public final PasscodeActivity f38403b;

    public jj0(PasscodeActivity passcodeActivity, int i10) {
        this.f38402a = i10;
        this.f38403b = passcodeActivity;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f38402a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f38403b;
                passcodeActivity.f33428n.postDelayed(passcodeActivity.S, 3000L);
                passcodeActivity.R = true;
                return;
            case 1:
                PasscodeActivity passcodeActivity2 = this.f38403b;
                y01 y01Var = passcodeActivity2.V;
                if (y01Var != null) {
                    org.telegram.messenger.i0.g3(y01Var);
                    passcodeActivity2.V = null;
                }
                passcodeActivity2.finishFragment();
                return;
            case 2:
                PasscodeActivity passcodeActivity3 = new PasscodeActivity(0);
                PasscodeActivity passcodeActivity4 = this.f38403b;
                passcodeActivity4.presentFragment(passcodeActivity3, true);
                pa0 pa0Var = passcodeActivity4.U;
                if (pa0Var != null) {
                    org.telegram.messenger.i0.g3(pa0Var);
                    passcodeActivity4.U = null;
                    return;
                }
                return;
            case 3:
                PasscodeActivity passcodeActivity5 = this.f38403b;
                jj0 jj0Var = new jj0(passcodeActivity5, 4);
                if (passcodeActivity5.s0()) {
                    j10 = 150;
                } else {
                    j10 = 1000;
                }
                org.telegram.messenger.i0.h3(jj0Var, j10);
                return;
            case 4:
                PasscodeActivity passcodeActivity6 = this.f38403b;
                if (passcodeActivity6.s0()) {
                    for (bs bsVar : passcodeActivity6.f33428n.f44045f) {
                        bsVar.z(0.0f);
                    }
                    return;
                }
                passcodeActivity6.f33427f.a(0.0f);
                return;
            case 5:
                PasscodeActivity passcodeActivity7 = this.f38403b;
                passcodeActivity7.R = false;
                org.telegram.messenger.i0.W3(passcodeActivity7.f33429r, false);
                return;
            default:
                this.f38403b.y0();
                return;
        }
    }
}
