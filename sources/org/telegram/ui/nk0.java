package org.telegram.ui;
public final class nk0 implements Runnable {
    public final int f50205a;
    public final ml0 f50206b;

    public nk0(ml0 ml0Var, int i7) {
        this.f50205a = i7;
        this.f50206b = ml0Var;
    }

    @Override
    public final void run() {
        switch (this.f50205a) {
            case 0:
                this.f50206b.z0();
                return;
            case 1:
                ml0 ml0Var = this.f50206b;
                ml0Var.getMessagesController().f25752o7 = null;
                if (ml0Var.f49912g1 == 3 && !ml0Var.isFinishing()) {
                    ml0Var.f49912g1 = 4;
                    ll0 ll0Var = ml0Var.f49896a1;
                    if (ll0Var != null) {
                        ll0Var.d(4);
                    }
                    ml0Var.finishFragment();
                    return;
                } else if (ml0Var.f49912g1 == 1 && !ml0Var.isFinishing()) {
                    ml0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 2:
                ml0 ml0Var2 = this.f50206b;
                if (ml0Var2.f49906e0 != null) {
                    ml0Var2.C0();
                    ml0Var2.f49906e0 = null;
                    return;
                }
                return;
            default:
                ml0 ml0Var3 = this.f50206b;
                ml0Var3.f49908f[0].requestFocus();
                org.telegram.messenger.g0.I3(ml0Var3.f49908f[0]);
                return;
        }
    }
}
