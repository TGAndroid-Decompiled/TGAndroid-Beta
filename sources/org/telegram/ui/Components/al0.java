package org.telegram.ui.Components;
public final class al0 implements Runnable {
    public final int f26552a;
    public final dl0 f26553b;

    public al0(dl0 dl0Var, int i10) {
        this.f26552a = i10;
        this.f26553b = dl0Var;
    }

    @Override
    public final void run() {
        switch (this.f26552a) {
            case 0:
                if (this.f26553b.f27550a.getImageReceiver().getLottieAnimation() != null && !this.f26553b.f27550a.getImageReceiver().getLottieAnimation().f34749k0 && !this.f26553b.f27550a.getImageReceiver().getLottieAnimation().y()) {
                    this.f26553b.f27550a.getImageReceiver().getLottieAnimation().start();
                }
                this.f26553b.E = false;
                return;
            default:
                dl0 dl0Var = this.f26553b;
                fl0 fl0Var = dl0Var.P;
                try {
                    dl0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                fl0Var.m0 = fl0Var.T.indexOf(dl0Var.e);
                fl0Var.f28254l0 = dl0Var.e;
                fl0Var.invalidate();
                return;
        }
    }
}
