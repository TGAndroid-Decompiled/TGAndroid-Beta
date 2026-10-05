package org.telegram.ui.Components;
public final class nk0 implements Runnable {
    public final int f29100a;
    public final qk0 f29101b;

    public nk0(qk0 qk0Var, int i10) {
        this.f29100a = i10;
        this.f29101b = qk0Var;
    }

    @Override
    public final void run() {
        switch (this.f29100a) {
            case 0:
                if (this.f29101b.f30085a.getImageReceiver().getLottieAnimation() != null && !this.f29101b.f30085a.getImageReceiver().getLottieAnimation().f28224k0 && !this.f29101b.f30085a.getImageReceiver().getLottieAnimation().y()) {
                    this.f29101b.f30085a.getImageReceiver().getLottieAnimation().start();
                }
                this.f29101b.E = false;
                return;
            default:
                qk0 qk0Var = this.f29101b;
                sk0 sk0Var = qk0Var.P;
                try {
                    qk0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                sk0Var.m0 = sk0Var.T.indexOf(qk0Var.f30088e);
                sk0Var.f30842l0 = qk0Var.f30088e;
                sk0Var.invalidate();
                return;
        }
    }
}
