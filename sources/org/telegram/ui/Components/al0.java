package org.telegram.ui.Components;
public final class al0 implements Runnable {
    public final int f24747a;
    public final dl0 f24748b;

    public al0(dl0 dl0Var, int i10) {
        this.f24747a = i10;
        this.f24748b = dl0Var;
    }

    @Override
    public final void run() {
        switch (this.f24747a) {
            case 0:
                if (this.f24748b.f25779a.getImageReceiver().getLottieAnimation() != null && !this.f24748b.f25779a.getImageReceiver().getLottieAnimation().f32607k0 && !this.f24748b.f25779a.getImageReceiver().getLottieAnimation().y()) {
                    this.f24748b.f25779a.getImageReceiver().getLottieAnimation().start();
                }
                this.f24748b.E = false;
                return;
            default:
                dl0 dl0Var = this.f24748b;
                fl0 fl0Var = dl0Var.P;
                try {
                    dl0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                fl0Var.m0 = fl0Var.T.indexOf(dl0Var.e);
                fl0Var.f26372l0 = dl0Var.e;
                fl0Var.invalidate();
                return;
        }
    }
}
