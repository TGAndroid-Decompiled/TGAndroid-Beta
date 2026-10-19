package org.telegram.ui.Components;
public final class xk0 implements Runnable {
    public final int f32414a;
    public final al0 f32415b;

    public xk0(al0 al0Var, int i10) {
        this.f32414a = i10;
        this.f32415b = al0Var;
    }

    @Override
    public final void run() {
        switch (this.f32414a) {
            case 0:
                if (this.f32415b.f24629a.getImageReceiver().getLottieAnimation() != null && !this.f32415b.f24629a.getImageReceiver().getLottieAnimation().f30987k0 && !this.f32415b.f24629a.getImageReceiver().getLottieAnimation().y()) {
                    this.f32415b.f24629a.getImageReceiver().getLottieAnimation().start();
                }
                this.f32415b.E = false;
                return;
            default:
                al0 al0Var = this.f32415b;
                cl0 cl0Var = al0Var.P;
                try {
                    al0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                cl0Var.m0 = cl0Var.T.indexOf(al0Var.e);
                cl0Var.f25258l0 = al0Var.e;
                cl0Var.invalidate();
                return;
        }
    }
}
