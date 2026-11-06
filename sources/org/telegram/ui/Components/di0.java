package org.telegram.ui.Components;
public final class di0 implements Runnable {
    public final int f33015a;
    public final gi0 f33016b;

    public di0(gi0 gi0Var, int i7) {
        this.f33015a = i7;
        this.f33016b = gi0Var;
    }

    @Override
    public final void run() {
        switch (this.f33015a) {
            case 0:
                if (this.f33016b.f33923a.getImageReceiver().B() != null && !this.f33016b.f33923a.getImageReceiver().B().f40984k0 && !this.f33016b.f33923a.getImageReceiver().B().y()) {
                    this.f33016b.f33923a.getImageReceiver().B().start();
                }
                this.f33016b.E = false;
                return;
            default:
                gi0 gi0Var = this.f33016b;
                ii0 ii0Var = gi0Var.P;
                try {
                    gi0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                ii0Var.m0 = ii0Var.T.indexOf(gi0Var.f33926e);
                ii0Var.f34662l0 = gi0Var.f33926e;
                ii0Var.invalidate();
                return;
        }
    }
}
