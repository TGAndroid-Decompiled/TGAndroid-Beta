package org.telegram.ui.Components;
public final class ij0 implements Runnable {
    public final int f27106a;
    public final lj0 f27107b;

    public ij0(lj0 lj0Var, int i10) {
        this.f27106a = i10;
        this.f27107b = lj0Var;
    }

    @Override
    public final void run() {
        switch (this.f27106a) {
            case 0:
                if (this.f27107b.f28182a.getImageReceiver().B() != null && !this.f27107b.f28182a.getImageReceiver().B().f25144k0 && !this.f27107b.f28182a.getImageReceiver().B().y()) {
                    this.f27107b.f28182a.getImageReceiver().B().start();
                }
                this.f27107b.E = false;
                return;
            default:
                lj0 lj0Var = this.f27107b;
                nj0 nj0Var = lj0Var.P;
                try {
                    lj0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                nj0Var.m0 = nj0Var.T.indexOf(lj0Var.e);
                nj0Var.f28884l0 = lj0Var.e;
                nj0Var.invalidate();
                return;
        }
    }
}
