package org.telegram.ui;
public final class hi0 implements Runnable {
    public final int f48560a;
    public final PasscodeActivity f48561b;
    public final boolean f48562c;

    public hi0(PasscodeActivity passcodeActivity, boolean z10, int i7) {
        this.f48560a = i7;
        this.f48561b = passcodeActivity;
        this.f48562c = z10;
    }

    @Override
    public final void run() {
        switch (this.f48560a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f48561b;
                passcodeActivity.getMediaDataController().o();
                if (this.f48562c) {
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
                PasscodeActivity passcodeActivity2 = this.f48561b;
                passcodeActivity2.f43267x.e(true, this.f48562c);
                org.telegram.messenger.g0.r(passcodeActivity2.U);
                return;
        }
    }
}
