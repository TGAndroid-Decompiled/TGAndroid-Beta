package org.telegram.ui;
public final class gi0 implements Runnable {
    public final int f46012a;
    public final PasscodeActivity f46013b;
    public final boolean f46014c;

    public gi0(PasscodeActivity passcodeActivity, boolean z9, int i7) {
        this.f46012a = i7;
        this.f46013b = passcodeActivity;
        this.f46014c = z9;
    }

    @Override
    public final void run() {
        switch (this.f46012a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f46013b;
                passcodeActivity.getMediaDataController().m();
                if (this.f46014c) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    n90 n90Var = passcodeActivity.U;
                    if (n90Var != null) {
                        org.telegram.messenger.g0.h3(n90Var);
                        passcodeActivity.U = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                org.telegram.messenger.qs.e().k(50, new Object[0]);
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f46013b;
                passcodeActivity2.f41341x.e(true, this.f46014c);
                org.telegram.messenger.g0.r(passcodeActivity2.T);
                return;
        }
    }
}
