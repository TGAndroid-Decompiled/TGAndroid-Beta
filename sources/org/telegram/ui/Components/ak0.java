package org.telegram.ui.Components;
public final class ak0 implements Runnable {
    public final int f26795a;
    public final dk0 f26796b;

    public ak0(dk0 dk0Var, int i10) {
        this.f26795a = i10;
        this.f26796b = dk0Var;
    }

    @Override
    public final void run() {
        switch (this.f26795a) {
            case 0:
                if (this.f26796b.f27794a.getImageReceiver().getLottieAnimation() != null && !this.f26796b.f27794a.getImageReceiver().getLottieAnimation().f34742h0 && !this.f26796b.f27794a.getImageReceiver().getLottieAnimation().w()) {
                    this.f26796b.f27794a.getImageReceiver().getLottieAnimation().start();
                }
                this.f26796b.A = false;
                return;
            default:
                dk0 dk0Var = this.f26796b;
                fk0 fk0Var = dk0Var.L;
                try {
                    dk0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                fk0Var.f28450i0 = fk0Var.P.indexOf(dk0Var.f27797e);
                fk0Var.f28449h0 = dk0Var.f27797e;
                fk0Var.invalidate();
                return;
        }
    }
}
