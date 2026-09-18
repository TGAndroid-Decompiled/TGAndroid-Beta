package org.telegram.ui.Components;
public final class bk0 implements Runnable {
    public final int f22763a;
    public final ek0 f22764b;

    public bk0(ek0 ek0Var, int i10) {
        this.f22763a = i10;
        this.f22764b = ek0Var;
    }

    @Override
    public final void run() {
        switch (this.f22763a) {
            case 0:
                if (this.f22764b.f23583a.getImageReceiver().getLottieAnimation() != null && !this.f22764b.f23583a.getImageReceiver().getLottieAnimation().f30235k0 && !this.f22764b.f23583a.getImageReceiver().getLottieAnimation().y()) {
                    this.f22764b.f23583a.getImageReceiver().getLottieAnimation().start();
                }
                this.f22764b.E = false;
                return;
            default:
                ek0 ek0Var = this.f22764b;
                gk0 gk0Var = ek0Var.P;
                try {
                    ek0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                gk0Var.m0 = gk0Var.T.indexOf(ek0Var.e);
                gk0Var.f24293l0 = ek0Var.e;
                gk0Var.invalidate();
                return;
        }
    }
}
