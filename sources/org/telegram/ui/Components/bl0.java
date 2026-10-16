package org.telegram.ui.Components;
public final class bl0 implements Runnable {
    public final int f23492a;
    public final el0 f23493b;

    public bl0(el0 el0Var, int i10) {
        this.f23492a = i10;
        this.f23493b = el0Var;
    }

    @Override
    public final void run() {
        switch (this.f23492a) {
            case 0:
                if (this.f23493b.f24416a.getImageReceiver().getLottieAnimation() != null && !this.f23493b.f24416a.getImageReceiver().getLottieAnimation().f31298k0 && !this.f23493b.f24416a.getImageReceiver().getLottieAnimation().y()) {
                    this.f23493b.f24416a.getImageReceiver().getLottieAnimation().start();
                }
                this.f23493b.E = false;
                return;
            default:
                el0 el0Var = this.f23493b;
                gl0 gl0Var = el0Var.P;
                try {
                    el0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                gl0Var.m0 = gl0Var.T.indexOf(el0Var.e);
                gl0Var.f25031l0 = el0Var.e;
                gl0Var.invalidate();
                return;
        }
    }
}
