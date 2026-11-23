package org.telegram.ui;
public final class nk0 implements Runnable {
    public final int f50213a;
    public final ml0 f50214b;

    public nk0(ml0 ml0Var, int i7) {
        this.f50213a = i7;
        this.f50214b = ml0Var;
    }

    @Override
    public final void run() {
        switch (this.f50213a) {
            case 0:
                this.f50214b.z0();
                return;
            case 1:
                ml0 ml0Var = this.f50214b;
                ml0Var.getMessagesController().f25887o7 = null;
                if (ml0Var.f49885g1 == 3 && !ml0Var.isFinishing()) {
                    ml0Var.f49885g1 = 4;
                    ll0 ll0Var = ml0Var.f49869a1;
                    if (ll0Var != null) {
                        ll0Var.d(4);
                    }
                    ml0Var.finishFragment();
                    return;
                } else if (ml0Var.f49885g1 == 1 && !ml0Var.isFinishing()) {
                    ml0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 2:
                ml0 ml0Var2 = this.f50214b;
                if (ml0Var2.f49879e0 != null) {
                    ml0Var2.C0();
                    ml0Var2.f49879e0 = null;
                    return;
                }
                return;
            default:
                ml0 ml0Var3 = this.f50214b;
                ml0Var3.f49881f[0].requestFocus();
                org.telegram.messenger.g0.I3(ml0Var3.f49881f[0]);
                return;
        }
    }
}
