package org.telegram.ui;
public final class gi0 implements Runnable {
    public final int f47450a;
    public final PasscodeActivity f47451b;
    public final boolean f47452c;

    public gi0(PasscodeActivity passcodeActivity, boolean z10, int i7) {
        this.f47450a = i7;
        this.f47451b = passcodeActivity;
        this.f47452c = z10;
    }

    @Override
    public final void run() {
        switch (this.f47450a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f47451b;
                passcodeActivity.getMediaDataController().m();
                if (this.f47452c) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    m90 m90Var = passcodeActivity.V;
                    if (m90Var != null) {
                        org.telegram.messenger.g0.h3(m90Var);
                        passcodeActivity.V = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                org.telegram.messenger.ns.e().k(50, new Object[0]);
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f47451b;
                passcodeActivity2.f42702x.e(true, this.f47452c);
                org.telegram.messenger.g0.r(passcodeActivity2.U);
                return;
        }
    }
}
