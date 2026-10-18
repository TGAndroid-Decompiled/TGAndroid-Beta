package org.telegram.ui.Components;
public final class xk0 implements Runnable {
    public final int f32412a;
    public final al0 f32413b;

    public xk0(al0 al0Var, int i10) {
        this.f32412a = i10;
        this.f32413b = al0Var;
    }

    @Override
    public final void run() {
        switch (this.f32412a) {
            case 0:
                if (this.f32413b.f24649a.getImageReceiver().getLottieAnimation() != null && !this.f32413b.f24649a.getImageReceiver().getLottieAnimation().f31014k0 && !this.f32413b.f24649a.getImageReceiver().getLottieAnimation().y()) {
                    this.f32413b.f24649a.getImageReceiver().getLottieAnimation().start();
                }
                this.f32413b.E = false;
                return;
            default:
                al0 al0Var = this.f32413b;
                cl0 cl0Var = al0Var.P;
                try {
                    al0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                cl0Var.m0 = cl0Var.T.indexOf(al0Var.e);
                cl0Var.f25282l0 = al0Var.e;
                cl0Var.invalidate();
                return;
        }
    }
}
