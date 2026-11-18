package org.telegram.ui;
public final class ji0 implements Runnable {
    public final int f48967a;
    public final PasscodeActivity f48968b;
    public final boolean f48969c;

    public ji0(PasscodeActivity passcodeActivity, boolean z10, int i7) {
        this.f48967a = i7;
        this.f48968b = passcodeActivity;
        this.f48969c = z10;
    }

    @Override
    public final void run() {
        switch (this.f48967a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f48968b;
                passcodeActivity.getMediaDataController().o();
                if (this.f48969c) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    l90 l90Var = passcodeActivity.V;
                    if (l90Var != null) {
                        org.telegram.messenger.g0.g3(l90Var);
                        passcodeActivity.V = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                org.telegram.messenger.ks.e().k(50, new Object[0]);
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f48968b;
                passcodeActivity2.f43147x.e(true, this.f48969c);
                org.telegram.messenger.g0.r(passcodeActivity2.U);
                return;
        }
    }
}
