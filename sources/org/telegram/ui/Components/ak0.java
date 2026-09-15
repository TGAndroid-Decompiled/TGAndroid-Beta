package org.telegram.ui.Components;
public final class ak0 implements Runnable {
    public final int f22433a;
    public final dk0 f22434b;

    public ak0(dk0 dk0Var, int i10) {
        this.f22433a = i10;
        this.f22434b = dk0Var;
    }

    @Override
    public final void run() {
        switch (this.f22433a) {
            case 0:
                if (this.f22434b.f23345a.getImageReceiver().getLottieAnimation() != null && !this.f22434b.f23345a.getImageReceiver().getLottieAnimation().f29960l0 && !this.f22434b.f23345a.getImageReceiver().getLottieAnimation().y()) {
                    this.f22434b.f23345a.getImageReceiver().getLottieAnimation().start();
                }
                this.f22434b.E = false;
                return;
            default:
                dk0 dk0Var = this.f22434b;
                fk0 fk0Var = dk0Var.P;
                try {
                    dk0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                fk0Var.m0 = fk0Var.T.indexOf(dk0Var.e);
                fk0Var.f23991l0 = dk0Var.e;
                fk0Var.invalidate();
                return;
        }
    }
}
