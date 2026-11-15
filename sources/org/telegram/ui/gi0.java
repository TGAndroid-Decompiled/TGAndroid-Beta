package org.telegram.ui;
public final class gi0 implements Runnable {
    public final int f47460a;
    public final PasscodeActivity f47461b;
    public final boolean f47462c;

    public gi0(PasscodeActivity passcodeActivity, boolean z10, int i7) {
        this.f47460a = i7;
        this.f47461b = passcodeActivity;
        this.f47462c = z10;
    }

    @Override
    public final void run() {
        switch (this.f47460a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f47461b;
                passcodeActivity.getMediaDataController().m();
                if (this.f47462c) {
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
                PasscodeActivity passcodeActivity2 = this.f47461b;
                passcodeActivity2.f42702x.e(true, this.f47462c);
                org.telegram.messenger.g0.r(passcodeActivity2.U);
                return;
        }
    }
}
