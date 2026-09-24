package org.telegram.ui.Components;
public final class lk0 implements Runnable {
    public final int f26122a;
    public final ok0 f26123b;

    public lk0(ok0 ok0Var, int i10) {
        this.f26122a = i10;
        this.f26123b = ok0Var;
    }

    @Override
    public final void run() {
        switch (this.f26122a) {
            case 0:
                if (this.f26123b.f27098a.getImageReceiver().getLottieAnimation() != null && !this.f26123b.f27098a.getImageReceiver().getLottieAnimation().f25055k0 && !this.f26123b.f27098a.getImageReceiver().getLottieAnimation().y()) {
                    this.f26123b.f27098a.getImageReceiver().getLottieAnimation().start();
                }
                this.f26123b.E = false;
                return;
            default:
                ok0 ok0Var = this.f26123b;
                qk0 qk0Var = ok0Var.P;
                try {
                    ok0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                qk0Var.m0 = qk0Var.T.indexOf(ok0Var.e);
                qk0Var.f27671l0 = ok0Var.e;
                qk0Var.invalidate();
                return;
        }
    }
}
