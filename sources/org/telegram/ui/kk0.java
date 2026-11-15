package org.telegram.ui;
public final class kk0 implements Runnable {
    public final int f48716a;
    public final jl0 f48717b;

    public kk0(jl0 jl0Var, int i7) {
        this.f48716a = i7;
        this.f48717b = jl0Var;
    }

    @Override
    public final void run() {
        switch (this.f48716a) {
            case 0:
                this.f48717b.z0();
                return;
            case 1:
                jl0 jl0Var = this.f48717b;
                jl0Var.getMessagesController().f25338m7 = null;
                if (jl0Var.f48400g1 == 3 && !jl0Var.isFinishing()) {
                    jl0Var.f48400g1 = 4;
                    il0 il0Var = jl0Var.f48384a1;
                    if (il0Var != null) {
                        il0Var.e(4);
                    }
                    jl0Var.finishFragment();
                    return;
                } else if (jl0Var.f48400g1 == 1 && !jl0Var.isFinishing()) {
                    jl0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 2:
                jl0 jl0Var2 = this.f48717b;
                if (jl0Var2.f48394e0 != null) {
                    jl0Var2.C0();
                    jl0Var2.f48394e0 = null;
                    return;
                }
                return;
            default:
                jl0 jl0Var3 = this.f48717b;
                jl0Var3.f48396f[0].requestFocus();
                org.telegram.messenger.g0.J3(jl0Var3.f48396f[0]);
                return;
        }
    }
}
