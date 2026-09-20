package org.telegram.ui.Components;
public final class kk0 implements Runnable {
    public final int f25813a;
    public final nk0 f25814b;

    public kk0(nk0 nk0Var, int i10) {
        this.f25813a = i10;
        this.f25814b = nk0Var;
    }

    @Override
    public final void run() {
        switch (this.f25813a) {
            case 0:
                if (this.f25814b.f26670a.getImageReceiver().getLottieAnimation() != null && !this.f25814b.f26670a.getImageReceiver().getLottieAnimation().f24691k0 && !this.f25814b.f26670a.getImageReceiver().getLottieAnimation().y()) {
                    this.f25814b.f26670a.getImageReceiver().getLottieAnimation().start();
                }
                this.f25814b.E = false;
                return;
            default:
                nk0 nk0Var = this.f25814b;
                pk0 pk0Var = nk0Var.P;
                try {
                    nk0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                pk0Var.m0 = pk0Var.T.indexOf(nk0Var.e);
                pk0Var.f27360l0 = nk0Var.e;
                pk0Var.invalidate();
                return;
        }
    }
}
