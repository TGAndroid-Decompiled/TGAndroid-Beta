package org.telegram.ui;
public final class ii0 implements Runnable {
    public final int f48745a;
    public final PasscodeActivity f48746b;

    public ii0(PasscodeActivity passcodeActivity, int i7) {
        this.f48745a = i7;
        this.f48746b = passcodeActivity;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f48745a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f48746b;
                passcodeActivity.f43153n.postDelayed(passcodeActivity.T, 3000L);
                passcodeActivity.S = true;
                return;
            case 1:
                PasscodeActivity passcodeActivity2 = this.f48746b;
                b31 b31Var = passcodeActivity2.W;
                if (b31Var != null) {
                    org.telegram.messenger.g0.g3(b31Var);
                    passcodeActivity2.W = null;
                }
                passcodeActivity2.finishFragment();
                return;
            case 2:
                PasscodeActivity passcodeActivity3 = new PasscodeActivity(0);
                PasscodeActivity passcodeActivity4 = this.f48746b;
                passcodeActivity4.presentFragment(passcodeActivity3, true);
                l90 l90Var = passcodeActivity4.V;
                if (l90Var != null) {
                    org.telegram.messenger.g0.g3(l90Var);
                    passcodeActivity4.V = null;
                    return;
                }
                return;
            case 3:
                PasscodeActivity passcodeActivity5 = this.f48746b;
                ii0 ii0Var = new ii0(passcodeActivity5, 4);
                if (passcodeActivity5.s0()) {
                    j3 = 150;
                } else {
                    j3 = 1000;
                }
                org.telegram.messenger.g0.h3(ii0Var, j3);
                return;
            case 4:
                PasscodeActivity passcodeActivity6 = this.f48746b;
                if (passcodeActivity6.s0()) {
                    for (er erVar : passcodeActivity6.f43153n.f46275f) {
                        erVar.A(0.0f);
                    }
                    return;
                }
                passcodeActivity6.f43152f.a(0.0f);
                return;
            case 5:
                PasscodeActivity passcodeActivity7 = this.f48746b;
                passcodeActivity7.S = false;
                org.telegram.messenger.g0.V3(passcodeActivity7.f43154r, false);
                return;
            default:
                this.f48746b.y0();
                return;
        }
    }
}
