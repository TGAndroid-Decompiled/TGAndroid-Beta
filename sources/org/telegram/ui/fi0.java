package org.telegram.ui;
public final class fi0 implements Runnable {
    public final int f45729a;
    public final PasscodeActivity f45730b;

    public fi0(PasscodeActivity passcodeActivity, int i7) {
        this.f45729a = i7;
        this.f45730b = passcodeActivity;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f45729a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f45730b;
                passcodeActivity.f41337n.postDelayed(passcodeActivity.S, 3000L);
                passcodeActivity.R = true;
                return;
            case 1:
                PasscodeActivity passcodeActivity2 = this.f45730b;
                wb1 wb1Var = passcodeActivity2.V;
                if (wb1Var != null) {
                    org.telegram.messenger.g0.h3(wb1Var);
                    passcodeActivity2.V = null;
                }
                passcodeActivity2.finishFragment();
                return;
            case 2:
                PasscodeActivity passcodeActivity3 = new PasscodeActivity(0);
                PasscodeActivity passcodeActivity4 = this.f45730b;
                passcodeActivity4.presentFragment(passcodeActivity3, true);
                n90 n90Var = passcodeActivity4.U;
                if (n90Var != null) {
                    org.telegram.messenger.g0.h3(n90Var);
                    passcodeActivity4.U = null;
                    return;
                }
                return;
            case 3:
                PasscodeActivity passcodeActivity5 = this.f45730b;
                fi0 fi0Var = new fi0(passcodeActivity5, 4);
                if (passcodeActivity5.s0()) {
                    j3 = 150;
                } else {
                    j3 = 1000;
                }
                org.telegram.messenger.g0.i3(fi0Var, j3);
                return;
            case 4:
                PasscodeActivity passcodeActivity6 = this.f45730b;
                if (passcodeActivity6.s0()) {
                    for (dr drVar : passcodeActivity6.f41337n.f43768f) {
                        drVar.z(0.0f);
                    }
                    return;
                }
                passcodeActivity6.f41336f.a(0.0f);
                return;
            case 5:
                PasscodeActivity passcodeActivity7 = this.f45730b;
                passcodeActivity7.R = false;
                org.telegram.messenger.g0.X3(passcodeActivity7.f41338r, false);
                return;
            default:
                this.f45730b.y0();
                return;
        }
    }
}
