package org.telegram.ui.Components;
public final class nk0 implements Runnable {
    public final int f29005a;
    public final qk0 f29006b;

    public nk0(qk0 qk0Var, int i10) {
        this.f29005a = i10;
        this.f29006b = qk0Var;
    }

    @Override
    public final void run() {
        switch (this.f29005a) {
            case 0:
                if (this.f29006b.f30057a.getImageReceiver().getLottieAnimation() != null && !this.f29006b.f30057a.getImageReceiver().getLottieAnimation().f28132k0 && !this.f29006b.f30057a.getImageReceiver().getLottieAnimation().y()) {
                    this.f29006b.f30057a.getImageReceiver().getLottieAnimation().start();
                }
                this.f29006b.E = false;
                return;
            default:
                qk0 qk0Var = this.f29006b;
                sk0 sk0Var = qk0Var.P;
                try {
                    qk0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                sk0Var.m0 = sk0Var.T.indexOf(qk0Var.f30060e);
                sk0Var.f30779l0 = qk0Var.f30060e;
                sk0Var.invalidate();
                return;
        }
    }
}
