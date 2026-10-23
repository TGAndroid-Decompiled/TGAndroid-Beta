package org.telegram.ui.Components;
public final class yk0 implements Runnable {
    public final int f32674a;
    public final bl0 f32675b;

    public yk0(bl0 bl0Var, int i10) {
        this.f32674a = i10;
        this.f32675b = bl0Var;
    }

    @Override
    public final void run() {
        switch (this.f32674a) {
            case 0:
                if (this.f32675b.f24979a.getImageReceiver().getLottieAnimation() != null && !this.f32675b.f24979a.getImageReceiver().getLottieAnimation().f31282k0 && !this.f32675b.f24979a.getImageReceiver().getLottieAnimation().y()) {
                    this.f32675b.f24979a.getImageReceiver().getLottieAnimation().start();
                }
                this.f32675b.E = false;
                return;
            default:
                bl0 bl0Var = this.f32675b;
                dl0 dl0Var = bl0Var.P;
                try {
                    bl0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                dl0Var.m0 = dl0Var.T.indexOf(bl0Var.e);
                dl0Var.f25551l0 = bl0Var.e;
                dl0Var.invalidate();
                return;
        }
    }
}
