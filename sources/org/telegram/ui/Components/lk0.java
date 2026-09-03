package org.telegram.ui.Components;
public final class lk0 implements Runnable {
    public final int f28801a;
    public final ok0 f28802b;

    public lk0(ok0 ok0Var, int i10) {
        this.f28801a = i10;
        this.f28802b = ok0Var;
    }

    @Override
    public final void run() {
        switch (this.f28801a) {
            case 0:
                if (this.f28802b.f29791a.getImageReceiver().getLottieAnimation() != null && !this.f28802b.f29791a.getImageReceiver().getLottieAnimation().f27530i0 && !this.f28802b.f29791a.getImageReceiver().getLottieAnimation().w()) {
                    this.f28802b.f29791a.getImageReceiver().getLottieAnimation().start();
                }
                this.f28802b.B = false;
                return;
            default:
                ok0 ok0Var = this.f28802b;
                qk0 qk0Var = ok0Var.M;
                try {
                    ok0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                qk0Var.f30444j0 = qk0Var.Q.indexOf(ok0Var.f29794e);
                qk0Var.f30443i0 = ok0Var.f29794e;
                qk0Var.invalidate();
                return;
        }
    }
}
