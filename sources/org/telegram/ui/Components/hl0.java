package org.telegram.ui.Components;
public final class hl0 implements Runnable {
    public final int f27027a;
    public final kl0 f27028b;

    public hl0(kl0 kl0Var, int i10) {
        this.f27027a = i10;
        this.f27028b = kl0Var;
    }

    @Override
    public final void run() {
        switch (this.f27027a) {
            case 0:
                if (this.f27028b.f28030a.getImageReceiver().getLottieAnimation() != null && !this.f27028b.f28030a.getImageReceiver().getLottieAnimation().f26051k0 && !this.f27028b.f28030a.getImageReceiver().getLottieAnimation().y()) {
                    this.f27028b.f28030a.getImageReceiver().getLottieAnimation().start();
                }
                this.f27028b.E = false;
                return;
            default:
                kl0 kl0Var = this.f27028b;
                ml0 ml0Var = kl0Var.P;
                try {
                    kl0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                ml0Var.m0 = ml0Var.T.indexOf(kl0Var.f28033e);
                ml0Var.f28776l0 = kl0Var.f28033e;
                ml0Var.invalidate();
                return;
        }
    }
}
