package org.telegram.ui.Components;
public final class kk0 implements Runnable {
    public final int f26307a;
    public final nk0 f26308b;

    public kk0(nk0 nk0Var, int i10) {
        this.f26307a = i10;
        this.f26308b = nk0Var;
    }

    @Override
    public final void run() {
        switch (this.f26307a) {
            case 0:
                if (this.f26308b.f27299a.getImageReceiver().getLottieAnimation() != null && !this.f26308b.f27299a.getImageReceiver().getLottieAnimation().f25158i0 && !this.f26308b.f27299a.getImageReceiver().getLottieAnimation().w()) {
                    this.f26308b.f27299a.getImageReceiver().getLottieAnimation().start();
                }
                this.f26308b.B = false;
                return;
            default:
                nk0 nk0Var = this.f26308b;
                pk0 pk0Var = nk0Var.M;
                try {
                    nk0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                pk0Var.f27905j0 = pk0Var.Q.indexOf(nk0Var.e);
                pk0Var.f27904i0 = nk0Var.e;
                pk0Var.invalidate();
                return;
        }
    }
}
