package org.telegram.ui.Components;
public final class gl0 implements Runnable {
    public final int f26788a;
    public final jl0 f26789b;

    public gl0(jl0 jl0Var, int i10) {
        this.f26788a = i10;
        this.f26789b = jl0Var;
    }

    @Override
    public final void run() {
        switch (this.f26788a) {
            case 0:
                if (this.f26789b.f27717a.getImageReceiver().getLottieAnimation() != null && !this.f26789b.f27717a.getImageReceiver().getLottieAnimation().f25740k0 && !this.f26789b.f27717a.getImageReceiver().getLottieAnimation().y()) {
                    this.f26789b.f27717a.getImageReceiver().getLottieAnimation().start();
                }
                this.f26789b.E = false;
                return;
            default:
                jl0 jl0Var = this.f26789b;
                ll0 ll0Var = jl0Var.P;
                try {
                    jl0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                ll0Var.m0 = ll0Var.T.indexOf(jl0Var.f27720e);
                ll0Var.f28405l0 = jl0Var.f27720e;
                ll0Var.invalidate();
                return;
        }
    }
}
