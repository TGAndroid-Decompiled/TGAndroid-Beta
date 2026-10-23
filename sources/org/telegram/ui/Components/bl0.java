package org.telegram.ui.Components;
public final class bl0 implements Runnable {
    public final int f25097a;
    public final el0 f25098b;

    public bl0(el0 el0Var, int i10) {
        this.f25097a = i10;
        this.f25098b = el0Var;
    }

    @Override
    public final void run() {
        switch (this.f25097a) {
            case 0:
                if (this.f25098b.f25999a.getImageReceiver().getLottieAnimation() != null && !this.f25098b.f25999a.getImageReceiver().getLottieAnimation().f32946k0 && !this.f25098b.f25999a.getImageReceiver().getLottieAnimation().y()) {
                    this.f25098b.f25999a.getImageReceiver().getLottieAnimation().start();
                }
                this.f25098b.E = false;
                return;
            default:
                el0 el0Var = this.f25098b;
                gl0 gl0Var = el0Var.P;
                try {
                    el0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                gl0Var.m0 = gl0Var.T.indexOf(el0Var.e);
                gl0Var.f26654l0 = el0Var.e;
                gl0Var.invalidate();
                return;
        }
    }
}
