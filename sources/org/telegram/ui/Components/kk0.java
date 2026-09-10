package org.telegram.ui.Components;
public final class kk0 implements Runnable {
    public final int f24743a;
    public final nk0 f24744b;

    public kk0(nk0 nk0Var, int i10) {
        this.f24743a = i10;
        this.f24744b = nk0Var;
    }

    @Override
    public final void run() {
        switch (this.f24743a) {
            case 0:
                if (this.f24744b.f25540a.getImageReceiver().getLottieAnimation() != null && !this.f24744b.f25540a.getImageReceiver().getLottieAnimation().f23660l0 && !this.f24744b.f25540a.getImageReceiver().getLottieAnimation().y()) {
                    this.f24744b.f25540a.getImageReceiver().getLottieAnimation().start();
                }
                this.f24744b.E = false;
                return;
            default:
                nk0 nk0Var = this.f24744b;
                pk0 pk0Var = nk0Var.P;
                try {
                    nk0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                pk0Var.m0 = pk0Var.T.indexOf(nk0Var.e);
                pk0Var.f26183l0 = nk0Var.e;
                pk0Var.invalidate();
                return;
        }
    }
}
