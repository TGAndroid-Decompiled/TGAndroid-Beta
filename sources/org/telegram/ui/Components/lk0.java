package org.telegram.ui.Components;
public final class lk0 implements Runnable {
    public final int f26177a;
    public final ok0 f26178b;

    public lk0(ok0 ok0Var, int i10) {
        this.f26177a = i10;
        this.f26178b = ok0Var;
    }

    @Override
    public final void run() {
        switch (this.f26177a) {
            case 0:
                if (this.f26178b.f26973a.getImageReceiver().getLottieAnimation() != null && !this.f26178b.f26973a.getImageReceiver().getLottieAnimation().f24985k0 && !this.f26178b.f26973a.getImageReceiver().getLottieAnimation().y()) {
                    this.f26178b.f26973a.getImageReceiver().getLottieAnimation().start();
                }
                this.f26178b.E = false;
                return;
            default:
                ok0 ok0Var = this.f26178b;
                qk0 qk0Var = ok0Var.P;
                try {
                    ok0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                qk0Var.m0 = qk0Var.T.indexOf(ok0Var.e);
                qk0Var.f27659l0 = ok0Var.e;
                qk0Var.invalidate();
                return;
        }
    }
}
