package org.telegram.ui.Components;
public final class bk0 implements Runnable {
    public final int f22777a;
    public final ek0 f22778b;

    public bk0(ek0 ek0Var, int i10) {
        this.f22777a = i10;
        this.f22778b = ek0Var;
    }

    @Override
    public final void run() {
        switch (this.f22777a) {
            case 0:
                if (this.f22778b.f23706a.getImageReceiver().getLottieAnimation() != null && !this.f22778b.f23706a.getImageReceiver().getLottieAnimation().f30271k0 && !this.f22778b.f23706a.getImageReceiver().getLottieAnimation().y()) {
                    this.f22778b.f23706a.getImageReceiver().getLottieAnimation().start();
                }
                this.f22778b.E = false;
                return;
            default:
                ek0 ek0Var = this.f22778b;
                gk0 gk0Var = ek0Var.P;
                try {
                    ek0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                gk0Var.m0 = gk0Var.T.indexOf(ek0Var.e);
                gk0Var.f24343l0 = ek0Var.e;
                gk0Var.invalidate();
                return;
        }
    }
}
