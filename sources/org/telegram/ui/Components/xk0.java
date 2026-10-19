package org.telegram.ui.Components;
public final class xk0 implements Runnable {
    public final int f32416a;
    public final al0 f32417b;

    public xk0(al0 al0Var, int i10) {
        this.f32416a = i10;
        this.f32417b = al0Var;
    }

    @Override
    public final void run() {
        switch (this.f32416a) {
            case 0:
                if (this.f32417b.f24631a.getImageReceiver().getLottieAnimation() != null && !this.f32417b.f24631a.getImageReceiver().getLottieAnimation().f30989k0 && !this.f32417b.f24631a.getImageReceiver().getLottieAnimation().y()) {
                    this.f32417b.f24631a.getImageReceiver().getLottieAnimation().start();
                }
                this.f32417b.E = false;
                return;
            default:
                al0 al0Var = this.f32417b;
                cl0 cl0Var = al0Var.P;
                try {
                    al0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                cl0Var.m0 = cl0Var.T.indexOf(al0Var.e);
                cl0Var.f25260l0 = al0Var.e;
                cl0Var.invalidate();
                return;
        }
    }
}
