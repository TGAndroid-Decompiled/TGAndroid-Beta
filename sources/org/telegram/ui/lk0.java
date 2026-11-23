package org.telegram.ui;
public final class lk0 implements Runnable {
    public final int f49776a;
    public final kl0 f49777b;

    public lk0(kl0 kl0Var, int i7) {
        this.f49776a = i7;
        this.f49777b = kl0Var;
    }

    @Override
    public final void run() {
        switch (this.f49776a) {
            case 0:
                this.f49777b.z0();
                return;
            case 1:
                kl0 kl0Var = this.f49777b;
                kl0Var.getMessagesController().f25819o7 = null;
                if (kl0Var.f49471g1 == 3 && !kl0Var.isFinishing()) {
                    kl0Var.f49471g1 = 4;
                    jl0 jl0Var = kl0Var.f49455a1;
                    if (jl0Var != null) {
                        jl0Var.e(4);
                    }
                    kl0Var.finishFragment();
                    return;
                } else if (kl0Var.f49471g1 == 1 && !kl0Var.isFinishing()) {
                    kl0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 2:
                kl0 kl0Var2 = this.f49777b;
                if (kl0Var2.f49465e0 != null) {
                    kl0Var2.C0();
                    kl0Var2.f49465e0 = null;
                    return;
                }
                return;
            default:
                kl0 kl0Var3 = this.f49777b;
                kl0Var3.f49467f[0].requestFocus();
                org.telegram.messenger.g0.I3(kl0Var3.f49467f[0]);
                return;
        }
    }
}
