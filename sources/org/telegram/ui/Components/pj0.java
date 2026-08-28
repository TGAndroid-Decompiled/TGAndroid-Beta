package org.telegram.ui.Components;
public final class pj0 implements Runnable {
    public final int f31683a;
    public final sj0 f31684b;

    public pj0(sj0 sj0Var, int i9) {
        this.f31683a = i9;
        this.f31684b = sj0Var;
    }

    @Override
    public final void run() {
        switch (this.f31683a) {
            case 0:
                if (this.f31684b.f32474a.getImageReceiver().getLottieAnimation() != null && !this.f31684b.f32474a.getImageReceiver().getLottieAnimation().f30852h0 && !this.f31684b.f32474a.getImageReceiver().getLottieAnimation().w()) {
                    this.f31684b.f32474a.getImageReceiver().getLottieAnimation().start();
                }
                this.f31684b.A = false;
                return;
            default:
                sj0 sj0Var = this.f31684b;
                uj0 uj0Var = sj0Var.L;
                try {
                    sj0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                uj0Var.f33061i0 = uj0Var.P.indexOf(sj0Var.f32477e);
                uj0Var.f33060h0 = sj0Var.f32477e;
                uj0Var.invalidate();
                return;
        }
    }
}
