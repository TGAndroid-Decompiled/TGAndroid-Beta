package org.telegram.ui.Components;

public final class rj0 implements Runnable {

    public final int f32194a;

    public final uj0 f32195b;

    public rj0(uj0 uj0Var, int i10) {
        this.f32194a = i10;
        this.f32195b = uj0Var;
    }

    @Override
    public final void run() {
        switch (this.f32194a) {
            case 0:
                if (this.f32195b.f33099a.getImageReceiver().getLottieAnimation() != null && !this.f32195b.f33099a.getImageReceiver().getLottieAnimation().f31317h0 && !this.f32195b.f33099a.getImageReceiver().getLottieAnimation().w()) {
                    this.f32195b.f33099a.getImageReceiver().getLottieAnimation().start();
                }
                this.f32195b.A = false;
                break;
            default:
                uj0 uj0Var = this.f32195b;
                wj0 wj0Var = uj0Var.L;
                try {
                    uj0Var.performHapticFeedback(0);
                    break;
                } catch (Exception unused) {
                }
                wj0Var.f34252i0 = wj0Var.P.indexOf(uj0Var.f33102e);
                wj0Var.f34251h0 = uj0Var.f33102e;
                wj0Var.invalidate();
                break;
        }
    }
}
