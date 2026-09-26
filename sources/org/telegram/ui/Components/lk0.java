package org.telegram.ui.Components;
public final class lk0 implements Runnable {
    public final int f26129a;
    public final ok0 f26130b;

    public lk0(ok0 ok0Var, int i10) {
        this.f26129a = i10;
        this.f26130b = ok0Var;
    }

    @Override
    public final void run() {
        switch (this.f26129a) {
            case 0:
                if (this.f26130b.f27102a.getImageReceiver().getLottieAnimation() != null && !this.f26130b.f27102a.getImageReceiver().getLottieAnimation().f25081k0 && !this.f26130b.f27102a.getImageReceiver().getLottieAnimation().y()) {
                    this.f26130b.f27102a.getImageReceiver().getLottieAnimation().start();
                }
                this.f26130b.E = false;
                return;
            default:
                ok0 ok0Var = this.f26130b;
                qk0 qk0Var = ok0Var.P;
                try {
                    ok0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                qk0Var.m0 = qk0Var.T.indexOf(ok0Var.e);
                qk0Var.f27677l0 = ok0Var.e;
                qk0Var.invalidate();
                return;
        }
    }
}
