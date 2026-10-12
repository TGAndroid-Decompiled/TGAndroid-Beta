package org.telegram.ui.Components;
public final class bl0 implements Runnable {
    public final int f23798a;
    public final el0 f23799b;

    public bl0(el0 el0Var, int i10) {
        this.f23798a = i10;
        this.f23799b = el0Var;
    }

    @Override
    public final void run() {
        switch (this.f23798a) {
            case 0:
                if (this.f23799b.f24730a.getImageReceiver().getLottieAnimation() != null && !this.f23799b.f24730a.getImageReceiver().getLottieAnimation().f31615k0 && !this.f23799b.f24730a.getImageReceiver().getLottieAnimation().y()) {
                    this.f23799b.f24730a.getImageReceiver().getLottieAnimation().start();
                }
                this.f23799b.E = false;
                return;
            default:
                el0 el0Var = this.f23799b;
                gl0 gl0Var = el0Var.P;
                try {
                    el0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                gl0Var.m0 = gl0Var.T.indexOf(el0Var.e);
                gl0Var.f25342l0 = el0Var.e;
                gl0Var.invalidate();
                return;
        }
    }
}
