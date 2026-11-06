package org.telegram.ui;
public final class ei0 implements Runnable {
    public final int f45324a;
    public final PasscodeActivity f45325b;
    public final boolean f45326c;

    public ei0(PasscodeActivity passcodeActivity, boolean z9, int i7) {
        this.f45324a = i7;
        this.f45325b = passcodeActivity;
        this.f45326c = z9;
    }

    @Override
    public final void run() {
        switch (this.f45324a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f45325b;
                passcodeActivity.getMediaDataController().m();
                if (this.f45326c) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    l90 l90Var = passcodeActivity.U;
                    if (l90Var != null) {
                        org.telegram.messenger.g0.h3(l90Var);
                        passcodeActivity.U = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                org.telegram.messenger.qs.e().k(50, new Object[0]);
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f45325b;
                passcodeActivity2.f41306x.e(true, this.f45326c);
                org.telegram.messenger.g0.r(passcodeActivity2.T);
                return;
        }
    }
}
