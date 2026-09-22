package org.telegram.ui.Components;
public final class nk0 implements Runnable {
    public final int f26800a;
    public final qk0 f26801b;

    public nk0(qk0 qk0Var, int i10) {
        this.f26800a = i10;
        this.f26801b = qk0Var;
    }

    @Override
    public final void run() {
        switch (this.f26800a) {
            case 0:
                if (this.f26801b.f27588a.getImageReceiver().getLottieAnimation() != null && !this.f26801b.f27588a.getImageReceiver().getLottieAnimation().f25724k0 && !this.f26801b.f27588a.getImageReceiver().getLottieAnimation().y()) {
                    this.f26801b.f27588a.getImageReceiver().getLottieAnimation().start();
                }
                this.f26801b.E = false;
                return;
            default:
                qk0 qk0Var = this.f26801b;
                sk0 sk0Var = qk0Var.P;
                try {
                    qk0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                sk0Var.m0 = sk0Var.T.indexOf(qk0Var.e);
                sk0Var.f28251l0 = qk0Var.e;
                sk0Var.invalidate();
                return;
        }
    }
}
