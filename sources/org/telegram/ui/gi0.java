package org.telegram.ui;
public final class gi0 implements Runnable {
    public final int f46101a;
    public final PasscodeActivity f46102b;

    public gi0(PasscodeActivity passcodeActivity, int i7) {
        this.f46101a = i7;
        this.f46102b = passcodeActivity;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f46101a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f46102b;
                passcodeActivity.f41328n.postDelayed(passcodeActivity.S, 3000L);
                passcodeActivity.R = true;
                return;
            case 1:
                PasscodeActivity passcodeActivity2 = this.f46102b;
                sb1 sb1Var = passcodeActivity2.V;
                if (sb1Var != null) {
                    org.telegram.messenger.g0.h3(sb1Var);
                    passcodeActivity2.V = null;
                }
                passcodeActivity2.finishFragment();
                return;
            case 2:
                PasscodeActivity passcodeActivity3 = new PasscodeActivity(0);
                PasscodeActivity passcodeActivity4 = this.f46102b;
                passcodeActivity4.presentFragment(passcodeActivity3, true);
                o90 o90Var = passcodeActivity4.U;
                if (o90Var != null) {
                    org.telegram.messenger.g0.h3(o90Var);
                    passcodeActivity4.U = null;
                    return;
                }
                return;
            case 3:
                PasscodeActivity passcodeActivity5 = this.f46102b;
                gi0 gi0Var = new gi0(passcodeActivity5, 4);
                if (passcodeActivity5.s0()) {
                    j3 = 150;
                } else {
                    j3 = 1000;
                }
                org.telegram.messenger.g0.i3(gi0Var, j3);
                return;
            case 4:
                PasscodeActivity passcodeActivity6 = this.f46102b;
                if (passcodeActivity6.s0()) {
                    for (er erVar : passcodeActivity6.f41328n.f44118f) {
                        erVar.z(0.0f);
                    }
                    return;
                }
                passcodeActivity6.f41327f.a(0.0f);
                return;
            case 5:
                PasscodeActivity passcodeActivity7 = this.f46102b;
                passcodeActivity7.R = false;
                org.telegram.messenger.g0.X3(passcodeActivity7.f41329r, false);
                return;
            default:
                this.f46102b.y0();
                return;
        }
    }
}
