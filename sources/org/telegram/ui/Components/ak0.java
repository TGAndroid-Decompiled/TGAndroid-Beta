package org.telegram.ui.Components;
public final class ak0 implements Runnable {
    public final int f22430a;
    public final dk0 f22431b;

    public ak0(dk0 dk0Var, int i10) {
        this.f22430a = i10;
        this.f22431b = dk0Var;
    }

    @Override
    public final void run() {
        switch (this.f22430a) {
            case 0:
                if (this.f22431b.f23344a.getImageReceiver().getLottieAnimation() != null && !this.f22431b.f23344a.getImageReceiver().getLottieAnimation().f29956k0 && !this.f22431b.f23344a.getImageReceiver().getLottieAnimation().y()) {
                    this.f22431b.f23344a.getImageReceiver().getLottieAnimation().start();
                }
                this.f22431b.E = false;
                return;
            default:
                dk0 dk0Var = this.f22431b;
                fk0 fk0Var = dk0Var.P;
                try {
                    dk0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                fk0Var.m0 = fk0Var.T.indexOf(dk0Var.e);
                fk0Var.f23990l0 = dk0Var.e;
                fk0Var.invalidate();
                return;
        }
    }
}
