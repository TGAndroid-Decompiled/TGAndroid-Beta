package org.telegram.ui.Components;
public final class nk0 implements Runnable {
    public final int f26797a;
    public final qk0 f26798b;

    public nk0(qk0 qk0Var, int i10) {
        this.f26797a = i10;
        this.f26798b = qk0Var;
    }

    @Override
    public final void run() {
        switch (this.f26797a) {
            case 0:
                if (this.f26798b.f27745a.getImageReceiver().getLottieAnimation() != null && !this.f26798b.f27745a.getImageReceiver().getLottieAnimation().f25729k0 && !this.f26798b.f27745a.getImageReceiver().getLottieAnimation().y()) {
                    this.f26798b.f27745a.getImageReceiver().getLottieAnimation().start();
                }
                this.f26798b.E = false;
                return;
            default:
                qk0 qk0Var = this.f26798b;
                sk0 sk0Var = qk0Var.P;
                try {
                    qk0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                sk0Var.m0 = sk0Var.T.indexOf(qk0Var.e);
                sk0Var.f28287l0 = qk0Var.e;
                sk0Var.invalidate();
                return;
        }
    }
}
