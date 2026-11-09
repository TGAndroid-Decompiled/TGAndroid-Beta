package org.telegram.ui;
public final class kk0 implements Runnable {
    public final int f47305a;
    public final jl0 f47306b;

    public kk0(jl0 jl0Var, int i7) {
        this.f47305a = i7;
        this.f47306b = jl0Var;
    }

    @Override
    public final void run() {
        switch (this.f47305a) {
            case 0:
                this.f47306b.z0();
                return;
            case 1:
                jl0 jl0Var = this.f47306b;
                jl0Var.getMessagesController().f24834l7 = null;
                if (jl0Var.f47009f1 == 3 && !jl0Var.isFinishing()) {
                    jl0Var.f47009f1 = 4;
                    il0 il0Var = jl0Var.Z0;
                    if (il0Var != null) {
                        il0Var.b(4);
                    }
                    jl0Var.finishFragment();
                    return;
                } else if (jl0Var.f47009f1 == 1 && !jl0Var.isFinishing()) {
                    jl0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 2:
                jl0 jl0Var2 = this.f47306b;
                if (jl0Var2.f47002d0 != null) {
                    jl0Var2.C0();
                    jl0Var2.f47002d0 = null;
                    return;
                }
                return;
            default:
                jl0 jl0Var3 = this.f47306b;
                jl0Var3.f47007f[0].requestFocus();
                org.telegram.messenger.g0.K3(jl0Var3.f47007f[0]);
                return;
        }
    }
}
