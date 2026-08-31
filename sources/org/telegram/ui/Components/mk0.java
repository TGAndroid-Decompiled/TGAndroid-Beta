package org.telegram.ui.Components;
public final class mk0 implements Runnable {
    public final int f29148a;
    public final pk0 f29149b;

    public mk0(pk0 pk0Var, int i10) {
        this.f29148a = i10;
        this.f29149b = pk0Var;
    }

    @Override
    public final void run() {
        switch (this.f29148a) {
            case 0:
                if (this.f29149b.f30098a.getImageReceiver().getLottieAnimation() != null && !this.f29149b.f30098a.getImageReceiver().getLottieAnimation().f27823i0 && !this.f29149b.f30098a.getImageReceiver().getLottieAnimation().w()) {
                    this.f29149b.f30098a.getImageReceiver().getLottieAnimation().start();
                }
                this.f29149b.B = false;
                return;
            default:
                pk0 pk0Var = this.f29149b;
                rk0 rk0Var = pk0Var.M;
                try {
                    pk0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                rk0Var.f30773j0 = rk0Var.Q.indexOf(pk0Var.f30101e);
                rk0Var.f30772i0 = pk0Var.f30101e;
                rk0Var.invalidate();
                return;
        }
    }
}
