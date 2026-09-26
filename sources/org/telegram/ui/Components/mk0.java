package org.telegram.ui.Components;
public final class mk0 implements Runnable {
    public final int f26441a;
    public final pk0 f26442b;

    public mk0(pk0 pk0Var, int i10) {
        this.f26441a = i10;
        this.f26442b = pk0Var;
    }

    @Override
    public final void run() {
        switch (this.f26441a) {
            case 0:
                if (this.f26442b.f27407a.getImageReceiver().getLottieAnimation() != null && !this.f26442b.f27407a.getImageReceiver().getLottieAnimation().f25435k0 && !this.f26442b.f27407a.getImageReceiver().getLottieAnimation().y()) {
                    this.f26442b.f27407a.getImageReceiver().getLottieAnimation().start();
                }
                this.f26442b.E = false;
                return;
            default:
                pk0 pk0Var = this.f26442b;
                rk0 rk0Var = pk0Var.P;
                try {
                    pk0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                rk0Var.m0 = rk0Var.T.indexOf(pk0Var.e);
                rk0Var.f27973l0 = pk0Var.e;
                rk0Var.invalidate();
                return;
        }
    }
}
