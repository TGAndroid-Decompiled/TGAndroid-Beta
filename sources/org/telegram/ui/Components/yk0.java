package org.telegram.ui.Components;
public final class yk0 implements Runnable {
    public final int f32673a;
    public final bl0 f32674b;

    public yk0(bl0 bl0Var, int i10) {
        this.f32673a = i10;
        this.f32674b = bl0Var;
    }

    @Override
    public final void run() {
        switch (this.f32673a) {
            case 0:
                if (this.f32674b.f24978a.getImageReceiver().getLottieAnimation() != null && !this.f32674b.f24978a.getImageReceiver().getLottieAnimation().f31281k0 && !this.f32674b.f24978a.getImageReceiver().getLottieAnimation().y()) {
                    this.f32674b.f24978a.getImageReceiver().getLottieAnimation().start();
                }
                this.f32674b.E = false;
                return;
            default:
                bl0 bl0Var = this.f32674b;
                dl0 dl0Var = bl0Var.P;
                try {
                    bl0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                dl0Var.m0 = dl0Var.T.indexOf(bl0Var.e);
                dl0Var.f25550l0 = bl0Var.e;
                dl0Var.invalidate();
                return;
        }
    }
}
