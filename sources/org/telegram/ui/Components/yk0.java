package org.telegram.ui.Components;
public final class yk0 implements Runnable {
    public final int f32670a;
    public final bl0 f32671b;

    public yk0(bl0 bl0Var, int i10) {
        this.f32670a = i10;
        this.f32671b = bl0Var;
    }

    @Override
    public final void run() {
        switch (this.f32670a) {
            case 0:
                if (this.f32671b.f24975a.getImageReceiver().getLottieAnimation() != null && !this.f32671b.f24975a.getImageReceiver().getLottieAnimation().f31278k0 && !this.f32671b.f24975a.getImageReceiver().getLottieAnimation().y()) {
                    this.f32671b.f24975a.getImageReceiver().getLottieAnimation().start();
                }
                this.f32671b.E = false;
                return;
            default:
                bl0 bl0Var = this.f32671b;
                dl0 dl0Var = bl0Var.P;
                try {
                    bl0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                dl0Var.m0 = dl0Var.T.indexOf(bl0Var.e);
                dl0Var.f25547l0 = bl0Var.e;
                dl0Var.invalidate();
                return;
        }
    }
}
