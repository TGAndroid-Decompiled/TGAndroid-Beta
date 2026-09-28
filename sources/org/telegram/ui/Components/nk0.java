package org.telegram.ui.Components;
public final class nk0 implements Runnable {
    public final int f26799a;
    public final qk0 f26800b;

    public nk0(qk0 qk0Var, int i10) {
        this.f26799a = i10;
        this.f26800b = qk0Var;
    }

    @Override
    public final void run() {
        switch (this.f26799a) {
            case 0:
                if (this.f26800b.f27754a.getImageReceiver().getLottieAnimation() != null && !this.f26800b.f27754a.getImageReceiver().getLottieAnimation().f25730k0 && !this.f26800b.f27754a.getImageReceiver().getLottieAnimation().y()) {
                    this.f26800b.f27754a.getImageReceiver().getLottieAnimation().start();
                }
                this.f26800b.E = false;
                return;
            default:
                qk0 qk0Var = this.f26800b;
                sk0 sk0Var = qk0Var.P;
                try {
                    qk0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                sk0Var.m0 = sk0Var.T.indexOf(qk0Var.e);
                sk0Var.f28290l0 = qk0Var.e;
                sk0Var.invalidate();
                return;
        }
    }
}
