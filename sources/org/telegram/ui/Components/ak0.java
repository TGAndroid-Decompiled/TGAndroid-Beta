package org.telegram.ui.Components;
public final class ak0 implements Runnable {
    public final int f24441a;
    public final dk0 f24442b;

    public ak0(dk0 dk0Var, int i10) {
        this.f24441a = i10;
        this.f24442b = dk0Var;
    }

    @Override
    public final void run() {
        switch (this.f24441a) {
            case 0:
                if (this.f24442b.f25434a.getImageReceiver().getLottieAnimation() != null && !this.f24442b.f25434a.getImageReceiver().getLottieAnimation().f32593l0 && !this.f24442b.f25434a.getImageReceiver().getLottieAnimation().w()) {
                    this.f24442b.f25434a.getImageReceiver().getLottieAnimation().start();
                }
                this.f24442b.E = false;
                return;
            default:
                dk0 dk0Var = this.f24442b;
                fk0 fk0Var = dk0Var.P;
                try {
                    dk0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                fk0Var.m0 = fk0Var.T.indexOf(dk0Var.f25437e);
                fk0Var.f26130l0 = dk0Var.f25437e;
                fk0Var.invalidate();
                return;
        }
    }
}
