package org.telegram.ui;
public final class ji0 implements Runnable {
    public final int f48991a;
    public final PasscodeActivity f48992b;
    public final boolean f48993c;

    public ji0(PasscodeActivity passcodeActivity, boolean z10, int i7) {
        this.f48991a = i7;
        this.f48992b = passcodeActivity;
        this.f48993c = z10;
    }

    @Override
    public final void run() {
        switch (this.f48991a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f48992b;
                passcodeActivity.getMediaDataController().o();
                if (this.f48993c) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    k90 k90Var = passcodeActivity.V;
                    if (k90Var != null) {
                        org.telegram.messenger.g0.g3(k90Var);
                        passcodeActivity.V = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                org.telegram.messenger.ks.e().k(50, new Object[0]);
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f48992b;
                passcodeActivity2.f43147x.e(true, this.f48993c);
                org.telegram.messenger.g0.r(passcodeActivity2.U);
                return;
        }
    }
}
