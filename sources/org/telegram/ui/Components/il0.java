package org.telegram.ui.Components;
public final class il0 implements Runnable {
    public final int f27223a;
    public final ll0 f27224b;

    public il0(ll0 ll0Var, int i10) {
        this.f27223a = i10;
        this.f27224b = ll0Var;
    }

    @Override
    public final void run() {
        switch (this.f27223a) {
            case 0:
                if (this.f27224b.f28229a.getImageReceiver().getLottieAnimation() != null && !this.f27224b.f28229a.getImageReceiver().getLottieAnimation().f26115k0 && !this.f27224b.f28229a.getImageReceiver().getLottieAnimation().y()) {
                    this.f27224b.f28229a.getImageReceiver().getLottieAnimation().start();
                }
                this.f27224b.E = false;
                return;
            default:
                ll0 ll0Var = this.f27224b;
                nl0 nl0Var = ll0Var.P;
                try {
                    ll0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                nl0Var.m0 = nl0Var.T.indexOf(ll0Var.f28232e);
                nl0Var.f28846l0 = ll0Var.f28232e;
                nl0Var.invalidate();
                return;
        }
    }
}
