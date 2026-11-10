package org.telegram.ui;
public final class lk0 implements Runnable {
    public final int f47623a;
    public final kl0 f47624b;

    public lk0(kl0 kl0Var, int i7) {
        this.f47623a = i7;
        this.f47624b = kl0Var;
    }

    @Override
    public final void run() {
        switch (this.f47623a) {
            case 0:
                this.f47624b.z0();
                return;
            case 1:
                kl0 kl0Var = this.f47624b;
                kl0Var.getMessagesController().f24838l7 = null;
                if (kl0Var.f47341f1 == 3 && !kl0Var.isFinishing()) {
                    kl0Var.f47341f1 = 4;
                    jl0 jl0Var = kl0Var.Z0;
                    if (jl0Var != null) {
                        jl0Var.b(4);
                    }
                    kl0Var.finishFragment();
                    return;
                } else if (kl0Var.f47341f1 == 1 && !kl0Var.isFinishing()) {
                    kl0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 2:
                kl0 kl0Var2 = this.f47624b;
                if (kl0Var2.f47334d0 != null) {
                    kl0Var2.C0();
                    kl0Var2.f47334d0 = null;
                    return;
                }
                return;
            default:
                kl0 kl0Var3 = this.f47624b;
                kl0Var3.f47339f[0].requestFocus();
                org.telegram.messenger.g0.K3(kl0Var3.f47339f[0]);
                return;
        }
    }
}
