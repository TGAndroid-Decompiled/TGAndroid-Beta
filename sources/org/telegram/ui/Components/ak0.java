package org.telegram.ui.Components;
public final class ak0 implements Runnable {
    public final int f24442a;
    public final dk0 f24443b;

    public ak0(dk0 dk0Var, int i10) {
        this.f24442a = i10;
        this.f24443b = dk0Var;
    }

    @Override
    public final void run() {
        switch (this.f24442a) {
            case 0:
                if (this.f24443b.f25435a.getImageReceiver().getLottieAnimation() != null && !this.f24443b.f25435a.getImageReceiver().getLottieAnimation().f32594l0 && !this.f24443b.f25435a.getImageReceiver().getLottieAnimation().w()) {
                    this.f24443b.f25435a.getImageReceiver().getLottieAnimation().start();
                }
                this.f24443b.E = false;
                return;
            default:
                dk0 dk0Var = this.f24443b;
                fk0 fk0Var = dk0Var.P;
                try {
                    dk0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                fk0Var.m0 = fk0Var.T.indexOf(dk0Var.f25438e);
                fk0Var.f26131l0 = dk0Var.f25438e;
                fk0Var.invalidate();
                return;
        }
    }
}
