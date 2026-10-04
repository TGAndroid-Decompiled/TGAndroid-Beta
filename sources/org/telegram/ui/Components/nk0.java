package org.telegram.ui.Components;
public final class nk0 implements Runnable {
    public final int f29006a;
    public final qk0 f29007b;

    public nk0(qk0 qk0Var, int i10) {
        this.f29006a = i10;
        this.f29007b = qk0Var;
    }

    @Override
    public final void run() {
        switch (this.f29006a) {
            case 0:
                if (this.f29007b.f30058a.getImageReceiver().getLottieAnimation() != null && !this.f29007b.f30058a.getImageReceiver().getLottieAnimation().f28133k0 && !this.f29007b.f30058a.getImageReceiver().getLottieAnimation().y()) {
                    this.f29007b.f30058a.getImageReceiver().getLottieAnimation().start();
                }
                this.f29007b.E = false;
                return;
            default:
                qk0 qk0Var = this.f29007b;
                sk0 sk0Var = qk0Var.P;
                try {
                    qk0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                sk0Var.m0 = sk0Var.T.indexOf(qk0Var.f30061e);
                sk0Var.f30780l0 = qk0Var.f30061e;
                sk0Var.invalidate();
                return;
        }
    }
}
