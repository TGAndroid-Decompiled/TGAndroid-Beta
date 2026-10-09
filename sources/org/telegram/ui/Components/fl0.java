package org.telegram.ui.Components;
public final class fl0 implements Runnable {
    public final int f26405a;
    public final il0 f26406b;

    public fl0(il0 il0Var, int i10) {
        this.f26405a = i10;
        this.f26406b = il0Var;
    }

    @Override
    public final void run() {
        switch (this.f26405a) {
            case 0:
                if (this.f26406b.f27420a.getImageReceiver().getLottieAnimation() != null && !this.f26406b.f27420a.getImageReceiver().getLottieAnimation().f25409k0 && !this.f26406b.f27420a.getImageReceiver().getLottieAnimation().y()) {
                    this.f26406b.f27420a.getImageReceiver().getLottieAnimation().start();
                }
                this.f26406b.E = false;
                return;
            default:
                il0 il0Var = this.f26406b;
                kl0 kl0Var = il0Var.P;
                try {
                    il0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                kl0Var.m0 = kl0Var.T.indexOf(il0Var.f27423e);
                kl0Var.f28090l0 = il0Var.f27423e;
                kl0Var.invalidate();
                return;
        }
    }
}
