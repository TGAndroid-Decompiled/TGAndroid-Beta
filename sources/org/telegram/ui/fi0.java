package org.telegram.ui;
public final class fi0 implements Runnable {
    public final int f47129a;
    public final PasscodeActivity f47130b;

    public fi0(PasscodeActivity passcodeActivity, int i7) {
        this.f47129a = i7;
        this.f47130b = passcodeActivity;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f47129a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f47130b;
                passcodeActivity.f42698n.postDelayed(passcodeActivity.T, 3000L);
                passcodeActivity.S = true;
                return;
            case 1:
                PasscodeActivity passcodeActivity2 = this.f47130b;
                fy0 fy0Var = passcodeActivity2.W;
                if (fy0Var != null) {
                    org.telegram.messenger.g0.h3(fy0Var);
                    passcodeActivity2.W = null;
                }
                passcodeActivity2.finishFragment();
                return;
            case 2:
                PasscodeActivity passcodeActivity3 = new PasscodeActivity(0);
                PasscodeActivity passcodeActivity4 = this.f47130b;
                passcodeActivity4.presentFragment(passcodeActivity3, true);
                m90 m90Var = passcodeActivity4.V;
                if (m90Var != null) {
                    org.telegram.messenger.g0.h3(m90Var);
                    passcodeActivity4.V = null;
                    return;
                }
                return;
            case 3:
                PasscodeActivity passcodeActivity5 = this.f47130b;
                fi0 fi0Var = new fi0(passcodeActivity5, 4);
                if (passcodeActivity5.s0()) {
                    j3 = 150;
                } else {
                    j3 = 1000;
                }
                org.telegram.messenger.g0.i3(fi0Var, j3);
                return;
            case 4:
                PasscodeActivity passcodeActivity6 = this.f47130b;
                if (passcodeActivity6.s0()) {
                    for (dr drVar : passcodeActivity6.f42698n.f45485f) {
                        drVar.A(0.0f);
                    }
                    return;
                }
                passcodeActivity6.f42697f.a(0.0f);
                return;
            case 5:
                PasscodeActivity passcodeActivity7 = this.f47130b;
                passcodeActivity7.S = false;
                org.telegram.messenger.g0.W3(passcodeActivity7.f42699r, false);
                return;
            default:
                this.f47130b.y0();
                return;
        }
    }
}
