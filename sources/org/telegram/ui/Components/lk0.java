package org.telegram.ui.Components;
public final class lk0 implements Runnable {
    public final int f26130a;
    public final ok0 f26131b;

    public lk0(ok0 ok0Var, int i10) {
        this.f26130a = i10;
        this.f26131b = ok0Var;
    }

    @Override
    public final void run() {
        switch (this.f26130a) {
            case 0:
                if (this.f26131b.f27103a.getImageReceiver().getLottieAnimation() != null && !this.f26131b.f27103a.getImageReceiver().getLottieAnimation().f25082k0 && !this.f26131b.f27103a.getImageReceiver().getLottieAnimation().y()) {
                    this.f26131b.f27103a.getImageReceiver().getLottieAnimation().start();
                }
                this.f26131b.E = false;
                return;
            default:
                ok0 ok0Var = this.f26131b;
                qk0 qk0Var = ok0Var.P;
                try {
                    ok0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                qk0Var.m0 = qk0Var.T.indexOf(ok0Var.e);
                qk0Var.f27678l0 = ok0Var.e;
                qk0Var.invalidate();
                return;
        }
    }
}
