package org.telegram.ui;
public final class kk0 implements Runnable {
    public final int f48670a;
    public final kl0 f48671b;

    public kk0(kl0 kl0Var, int i7) {
        this.f48670a = i7;
        this.f48671b = kl0Var;
    }

    @Override
    public final void run() {
        switch (this.f48670a) {
            case 0:
                this.f48671b.z0();
                return;
            case 1:
                kl0 kl0Var = this.f48671b;
                kl0Var.getMessagesController().f25341m7 = null;
                if (kl0Var.f48692g1 == 3 && !kl0Var.isFinishing()) {
                    kl0Var.f48692g1 = 4;
                    jl0 jl0Var = kl0Var.f48676a1;
                    if (jl0Var != null) {
                        jl0Var.e(4);
                    }
                    kl0Var.finishFragment();
                    return;
                } else if (kl0Var.f48692g1 == 1 && !kl0Var.isFinishing()) {
                    kl0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 2:
                kl0 kl0Var2 = this.f48671b;
                if (kl0Var2.f48686e0 != null) {
                    kl0Var2.C0();
                    kl0Var2.f48686e0 = null;
                    return;
                }
                return;
            default:
                kl0 kl0Var3 = this.f48671b;
                kl0Var3.f48688f[0].requestFocus();
                org.telegram.messenger.g0.J3(kl0Var3.f48688f[0]);
                return;
        }
    }
}
