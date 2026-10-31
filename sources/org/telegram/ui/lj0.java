package org.telegram.ui;
public final class lj0 implements Runnable {
    public final int f39252a;
    public final PasscodeActivity f39253b;

    public lj0(PasscodeActivity passcodeActivity, int i10) {
        this.f39252a = i10;
        this.f39253b = passcodeActivity;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f39252a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f39253b;
                passcodeActivity.f33421n.postDelayed(passcodeActivity.S, 3000L);
                passcodeActivity.R = true;
                return;
            case 1:
                PasscodeActivity passcodeActivity2 = this.f39253b;
                t11 t11Var = passcodeActivity2.V;
                if (t11Var != null) {
                    org.telegram.messenger.i0.g3(t11Var);
                    passcodeActivity2.V = null;
                }
                passcodeActivity2.finishFragment();
                return;
            case 2:
                PasscodeActivity passcodeActivity3 = new PasscodeActivity(0);
                PasscodeActivity passcodeActivity4 = this.f39253b;
                passcodeActivity4.presentFragment(passcodeActivity3, true);
                qa0 qa0Var = passcodeActivity4.U;
                if (qa0Var != null) {
                    org.telegram.messenger.i0.g3(qa0Var);
                    passcodeActivity4.U = null;
                    return;
                }
                return;
            case 3:
                PasscodeActivity passcodeActivity5 = this.f39253b;
                lj0 lj0Var = new lj0(passcodeActivity5, 4);
                if (passcodeActivity5.r0()) {
                    j10 = 150;
                } else {
                    j10 = 1000;
                }
                org.telegram.messenger.i0.h3(lj0Var, j10);
                return;
            case 4:
                PasscodeActivity passcodeActivity6 = this.f39253b;
                if (passcodeActivity6.r0()) {
                    for (bs bsVar : passcodeActivity6.f33421n.f44219f) {
                        bsVar.z(0.0f);
                    }
                    return;
                }
                passcodeActivity6.f33420f.a(0.0f);
                return;
            case 5:
                PasscodeActivity passcodeActivity7 = this.f39253b;
                passcodeActivity7.R = false;
                org.telegram.messenger.i0.W3(passcodeActivity7.f33422r, false);
                return;
            default:
                this.f39253b.x0();
                return;
        }
    }
}
