package org.telegram.ui;
public final class ji0 implements Runnable {
    public final int f49000a;
    public final PasscodeActivity f49001b;
    public final boolean f49002c;

    public ji0(PasscodeActivity passcodeActivity, boolean z10, int i7) {
        this.f49000a = i7;
        this.f49001b = passcodeActivity;
        this.f49002c = z10;
    }

    @Override
    public final void run() {
        switch (this.f49000a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f49001b;
                passcodeActivity.getMediaDataController().o();
                if (this.f49002c) {
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
                PasscodeActivity passcodeActivity2 = this.f49001b;
                passcodeActivity2.f43188x.e(true, this.f49002c);
                org.telegram.messenger.g0.r(passcodeActivity2.U);
                return;
        }
    }
}
