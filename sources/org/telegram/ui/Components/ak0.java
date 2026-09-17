package org.telegram.ui.Components;
public final class ak0 implements Runnable {
    public final int f24415a;
    public final dk0 f24416b;

    public ak0(dk0 dk0Var, int i10) {
        this.f24415a = i10;
        this.f24416b = dk0Var;
    }

    @Override
    public final void run() {
        switch (this.f24415a) {
            case 0:
                if (this.f24416b.f25408a.getImageReceiver().getLottieAnimation() != null && !this.f24416b.f25408a.getImageReceiver().getLottieAnimation().f32567l0 && !this.f24416b.f25408a.getImageReceiver().getLottieAnimation().w()) {
                    this.f24416b.f25408a.getImageReceiver().getLottieAnimation().start();
                }
                this.f24416b.E = false;
                return;
            default:
                dk0 dk0Var = this.f24416b;
                fk0 fk0Var = dk0Var.P;
                try {
                    dk0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                fk0Var.m0 = fk0Var.T.indexOf(dk0Var.f25411e);
                fk0Var.f26104l0 = dk0Var.f25411e;
                fk0Var.invalidate();
                return;
        }
    }
}
