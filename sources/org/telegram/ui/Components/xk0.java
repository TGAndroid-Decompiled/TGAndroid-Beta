package org.telegram.ui.Components;
public final class xk0 implements Runnable {
    public final int f32419a;
    public final al0 f32420b;

    public xk0(al0 al0Var, int i10) {
        this.f32419a = i10;
        this.f32420b = al0Var;
    }

    @Override
    public final void run() {
        switch (this.f32419a) {
            case 0:
                if (this.f32420b.f24656a.getImageReceiver().getLottieAnimation() != null && !this.f32420b.f24656a.getImageReceiver().getLottieAnimation().f31021k0 && !this.f32420b.f24656a.getImageReceiver().getLottieAnimation().y()) {
                    this.f32420b.f24656a.getImageReceiver().getLottieAnimation().start();
                }
                this.f32420b.E = false;
                return;
            default:
                al0 al0Var = this.f32420b;
                cl0 cl0Var = al0Var.P;
                try {
                    al0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                cl0Var.m0 = cl0Var.T.indexOf(al0Var.e);
                cl0Var.f25289l0 = al0Var.e;
                cl0Var.invalidate();
                return;
        }
    }
}
