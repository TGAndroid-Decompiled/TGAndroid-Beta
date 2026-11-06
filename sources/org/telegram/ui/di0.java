package org.telegram.ui;
public final class di0 implements Runnable {
    public final int f45056a;
    public final PasscodeActivity f45057b;

    public di0(PasscodeActivity passcodeActivity, int i7) {
        this.f45056a = i7;
        this.f45057b = passcodeActivity;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f45056a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f45057b;
                passcodeActivity.f41302n.postDelayed(passcodeActivity.S, 3000L);
                passcodeActivity.R = true;
                return;
            case 1:
                PasscodeActivity passcodeActivity2 = this.f45057b;
                org.telegram.ui.Wallet.n nVar = passcodeActivity2.V;
                if (nVar != null) {
                    org.telegram.messenger.g0.h3(nVar);
                    passcodeActivity2.V = null;
                }
                passcodeActivity2.finishFragment();
                return;
            case 2:
                PasscodeActivity passcodeActivity3 = new PasscodeActivity(0);
                PasscodeActivity passcodeActivity4 = this.f45057b;
                passcodeActivity4.presentFragment(passcodeActivity3, true);
                l90 l90Var = passcodeActivity4.U;
                if (l90Var != null) {
                    org.telegram.messenger.g0.h3(l90Var);
                    passcodeActivity4.U = null;
                    return;
                }
                return;
            case 3:
                PasscodeActivity passcodeActivity5 = this.f45057b;
                di0 di0Var = new di0(passcodeActivity5, 4);
                if (passcodeActivity5.s0()) {
                    j3 = 150;
                } else {
                    j3 = 1000;
                }
                org.telegram.messenger.g0.i3(di0Var, j3);
                return;
            case 4:
                PasscodeActivity passcodeActivity6 = this.f45057b;
                if (passcodeActivity6.s0()) {
                    for (br brVar : passcodeActivity6.f41302n.f52294f) {
                        brVar.z(0.0f);
                    }
                    return;
                }
                passcodeActivity6.f41301f.a(0.0f);
                return;
            case 5:
                PasscodeActivity passcodeActivity7 = this.f45057b;
                passcodeActivity7.R = false;
                org.telegram.messenger.g0.X3(passcodeActivity7.f41303r, false);
                return;
            default:
                this.f45057b.y0();
                return;
        }
    }
}
