package org.telegram.ui.Components;
public final class ok0 implements Runnable {
    public final int f27115a;
    public final rk0 f27116b;

    public ok0(rk0 rk0Var, int i10) {
        this.f27115a = i10;
        this.f27116b = rk0Var;
    }

    @Override
    public final void run() {
        switch (this.f27115a) {
            case 0:
                if (this.f27116b.f28050a.getImageReceiver().getLottieAnimation() != null && !this.f27116b.f28050a.getImageReceiver().getLottieAnimation().f26021k0 && !this.f27116b.f28050a.getImageReceiver().getLottieAnimation().y()) {
                    this.f27116b.f28050a.getImageReceiver().getLottieAnimation().start();
                }
                this.f27116b.E = false;
                return;
            default:
                rk0 rk0Var = this.f27116b;
                tk0 tk0Var = rk0Var.P;
                try {
                    rk0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                tk0Var.m0 = tk0Var.T.indexOf(rk0Var.e);
                tk0Var.f28577l0 = rk0Var.e;
                tk0Var.invalidate();
                return;
        }
    }
}
