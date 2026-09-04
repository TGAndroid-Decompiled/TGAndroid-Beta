package org.telegram.ui.Components;
public final class ak0 implements Runnable {
    public final int f24414a;
    public final dk0 f24415b;

    public ak0(dk0 dk0Var, int i10) {
        this.f24414a = i10;
        this.f24415b = dk0Var;
    }

    @Override
    public final void run() {
        switch (this.f24414a) {
            case 0:
                if (this.f24415b.f25407a.getImageReceiver().getLottieAnimation() != null && !this.f24415b.f25407a.getImageReceiver().getLottieAnimation().f32566l0 && !this.f24415b.f25407a.getImageReceiver().getLottieAnimation().w()) {
                    this.f24415b.f25407a.getImageReceiver().getLottieAnimation().start();
                }
                this.f24415b.E = false;
                return;
            default:
                dk0 dk0Var = this.f24415b;
                fk0 fk0Var = dk0Var.P;
                try {
                    dk0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                fk0Var.m0 = fk0Var.T.indexOf(dk0Var.f25410e);
                fk0Var.f26103l0 = dk0Var.f25410e;
                fk0Var.invalidate();
                return;
        }
    }
}
