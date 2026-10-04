package org.telegram.ui.Components;
public final class nk0 implements Runnable {
    public final int f29011a;
    public final qk0 f29012b;

    public nk0(qk0 qk0Var, int i10) {
        this.f29011a = i10;
        this.f29012b = qk0Var;
    }

    @Override
    public final void run() {
        switch (this.f29011a) {
            case 0:
                if (this.f29012b.f30063a.getImageReceiver().getLottieAnimation() != null && !this.f29012b.f30063a.getImageReceiver().getLottieAnimation().f28138k0 && !this.f29012b.f30063a.getImageReceiver().getLottieAnimation().y()) {
                    this.f29012b.f30063a.getImageReceiver().getLottieAnimation().start();
                }
                this.f29012b.E = false;
                return;
            default:
                qk0 qk0Var = this.f29012b;
                sk0 sk0Var = qk0Var.P;
                try {
                    qk0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                sk0Var.m0 = sk0Var.T.indexOf(qk0Var.f30066e);
                sk0Var.f30786l0 = qk0Var.f30066e;
                sk0Var.invalidate();
                return;
        }
    }
}
