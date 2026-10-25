package org.telegram.ui.Components;
public final class al0 implements Runnable {
    public final int f26550a;
    public final dl0 f26551b;

    public al0(dl0 dl0Var, int i10) {
        this.f26550a = i10;
        this.f26551b = dl0Var;
    }

    @Override
    public final void run() {
        switch (this.f26550a) {
            case 0:
                if (this.f26551b.f27548a.getImageReceiver().getLottieAnimation() != null && !this.f26551b.f27548a.getImageReceiver().getLottieAnimation().f34746k0 && !this.f26551b.f27548a.getImageReceiver().getLottieAnimation().y()) {
                    this.f26551b.f27548a.getImageReceiver().getLottieAnimation().start();
                }
                this.f26551b.E = false;
                return;
            default:
                dl0 dl0Var = this.f26551b;
                fl0 fl0Var = dl0Var.P;
                try {
                    dl0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                fl0Var.m0 = fl0Var.T.indexOf(dl0Var.e);
                fl0Var.f28252l0 = dl0Var.e;
                fl0Var.invalidate();
                return;
        }
    }
}
