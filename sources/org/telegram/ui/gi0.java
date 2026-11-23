package org.telegram.ui;
public final class gi0 implements Runnable {
    public final int f48306a;
    public final PasscodeActivity f48307b;

    public gi0(PasscodeActivity passcodeActivity, int i7) {
        this.f48306a = i7;
        this.f48307b = passcodeActivity;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f48306a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f48307b;
                passcodeActivity.f43263n.postDelayed(passcodeActivity.T, 3000L);
                passcodeActivity.S = true;
                return;
            case 1:
                PasscodeActivity passcodeActivity2 = this.f48307b;
                org.telegram.ui.Wallet.r rVar = passcodeActivity2.W;
                if (rVar != null) {
                    org.telegram.messenger.g0.g3(rVar);
                    passcodeActivity2.W = null;
                }
                passcodeActivity2.finishFragment();
                return;
            case 2:
                PasscodeActivity passcodeActivity3 = new PasscodeActivity(0);
                PasscodeActivity passcodeActivity4 = this.f48307b;
                passcodeActivity4.presentFragment(passcodeActivity3, true);
                k90 k90Var = passcodeActivity4.V;
                if (k90Var != null) {
                    org.telegram.messenger.g0.g3(k90Var);
                    passcodeActivity4.V = null;
                    return;
                }
                return;
            case 3:
                PasscodeActivity passcodeActivity5 = this.f48307b;
                gi0 gi0Var = new gi0(passcodeActivity5, 4);
                if (passcodeActivity5.s0()) {
                    j3 = 150;
                } else {
                    j3 = 1000;
                }
                org.telegram.messenger.g0.h3(gi0Var, j3);
                return;
            case 4:
                PasscodeActivity passcodeActivity6 = this.f48307b;
                if (passcodeActivity6.s0()) {
                    for (er erVar : passcodeActivity6.f43263n.f46491f) {
                        erVar.A(0.0f);
                    }
                    return;
                }
                passcodeActivity6.f43262f.a(0.0f);
                return;
            case 5:
                PasscodeActivity passcodeActivity7 = this.f48307b;
                passcodeActivity7.S = false;
                org.telegram.messenger.g0.V3(passcodeActivity7.f43264r, false);
                return;
            default:
                this.f48307b.y0();
                return;
        }
    }
}
