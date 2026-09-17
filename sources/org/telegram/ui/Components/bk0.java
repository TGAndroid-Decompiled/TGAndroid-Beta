package org.telegram.ui.Components;
public final class bk0 implements Runnable {
    public final int f22760a;
    public final ek0 f22761b;

    public bk0(ek0 ek0Var, int i10) {
        this.f22760a = i10;
        this.f22761b = ek0Var;
    }

    @Override
    public final void run() {
        switch (this.f22760a) {
            case 0:
                if (this.f22761b.f23580a.getImageReceiver().getLottieAnimation() != null && !this.f22761b.f23580a.getImageReceiver().getLottieAnimation().f30233l0 && !this.f22761b.f23580a.getImageReceiver().getLottieAnimation().y()) {
                    this.f22761b.f23580a.getImageReceiver().getLottieAnimation().start();
                }
                this.f22761b.E = false;
                return;
            default:
                ek0 ek0Var = this.f22761b;
                gk0 gk0Var = ek0Var.P;
                try {
                    ek0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                gk0Var.m0 = gk0Var.T.indexOf(ek0Var.e);
                gk0Var.f24290l0 = ek0Var.e;
                gk0Var.invalidate();
                return;
        }
    }
}
