package org.telegram.ui.Components;
public final class kk0 implements Runnable {
    public final int f26325a;
    public final nk0 f26326b;

    public kk0(nk0 nk0Var, int i10) {
        this.f26325a = i10;
        this.f26326b = nk0Var;
    }

    @Override
    public final void run() {
        switch (this.f26325a) {
            case 0:
                if (this.f26326b.f27284a.getImageReceiver().getLottieAnimation() != null && !this.f26326b.f27284a.getImageReceiver().getLottieAnimation().f25164i0 && !this.f26326b.f27284a.getImageReceiver().getLottieAnimation().w()) {
                    this.f26326b.f27284a.getImageReceiver().getLottieAnimation().start();
                }
                this.f26326b.B = false;
                return;
            default:
                nk0 nk0Var = this.f26326b;
                pk0 pk0Var = nk0Var.M;
                try {
                    nk0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                pk0Var.f27900j0 = pk0Var.Q.indexOf(nk0Var.e);
                pk0Var.f27899i0 = nk0Var.e;
                pk0Var.invalidate();
                return;
        }
    }
}
