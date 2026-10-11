package org.telegram.ui.Components;
public final class gl0 implements Runnable {
    public final int f26817a;
    public final jl0 f26818b;

    public gl0(jl0 jl0Var, int i10) {
        this.f26817a = i10;
        this.f26818b = jl0Var;
    }

    @Override
    public final void run() {
        switch (this.f26817a) {
            case 0:
                if (this.f26818b.f27776a.getImageReceiver().getLottieAnimation() != null && !this.f26818b.f27776a.getImageReceiver().getLottieAnimation().f25818k0 && !this.f26818b.f27776a.getImageReceiver().getLottieAnimation().y()) {
                    this.f26818b.f27776a.getImageReceiver().getLottieAnimation().start();
                }
                this.f26818b.E = false;
                return;
            default:
                jl0 jl0Var = this.f26818b;
                ll0 ll0Var = jl0Var.P;
                try {
                    jl0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                ll0Var.m0 = ll0Var.T.indexOf(jl0Var.f27779e);
                ll0Var.f28481l0 = jl0Var.f27779e;
                ll0Var.invalidate();
                return;
        }
    }
}
