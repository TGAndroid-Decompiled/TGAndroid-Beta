package org.telegram.ui.Components;
public final class bl0 implements Runnable {
    public final int f26851a;
    public final el0 f26852b;

    public bl0(el0 el0Var, int i10) {
        this.f26851a = i10;
        this.f26852b = el0Var;
    }

    @Override
    public final void run() {
        switch (this.f26851a) {
            case 0:
                if (this.f26852b.f27876a.getImageReceiver().getLottieAnimation() != null && !this.f26852b.f27876a.getImageReceiver().getLottieAnimation().f35080k0 && !this.f26852b.f27876a.getImageReceiver().getLottieAnimation().y()) {
                    this.f26852b.f27876a.getImageReceiver().getLottieAnimation().start();
                }
                this.f26852b.E = false;
                return;
            default:
                el0 el0Var = this.f26852b;
                gl0 gl0Var = el0Var.P;
                try {
                    el0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                gl0Var.m0 = gl0Var.T.indexOf(el0Var.e);
                gl0Var.f28632l0 = el0Var.e;
                gl0Var.invalidate();
                return;
        }
    }
}
