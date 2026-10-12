package org.telegram.ui.Components;
public final class il0 implements Runnable {
    public final int f27217a;
    public final ll0 f27218b;

    public il0(ll0 ll0Var, int i10) {
        this.f27217a = i10;
        this.f27218b = ll0Var;
    }

    @Override
    public final void run() {
        switch (this.f27217a) {
            case 0:
                if (this.f27218b.f28218a.getImageReceiver().getLottieAnimation() != null && !this.f27218b.f28218a.getImageReceiver().getLottieAnimation().f26117k0 && !this.f27218b.f28218a.getImageReceiver().getLottieAnimation().y()) {
                    this.f27218b.f28218a.getImageReceiver().getLottieAnimation().start();
                }
                this.f27218b.E = false;
                return;
            default:
                ll0 ll0Var = this.f27218b;
                nl0 nl0Var = ll0Var.P;
                try {
                    ll0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                nl0Var.m0 = nl0Var.T.indexOf(ll0Var.f28221e);
                nl0Var.f28850l0 = ll0Var.f28221e;
                nl0Var.invalidate();
                return;
        }
    }
}
