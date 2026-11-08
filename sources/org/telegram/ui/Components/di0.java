package org.telegram.ui.Components;
public final class di0 implements Runnable {
    public final int f33023a;
    public final gi0 f33024b;

    public di0(gi0 gi0Var, int i7) {
        this.f33023a = i7;
        this.f33024b = gi0Var;
    }

    @Override
    public final void run() {
        switch (this.f33023a) {
            case 0:
                if (this.f33024b.f33949a.getImageReceiver().B() != null && !this.f33024b.f33949a.getImageReceiver().B().f41003k0 && !this.f33024b.f33949a.getImageReceiver().B().y()) {
                    this.f33024b.f33949a.getImageReceiver().B().start();
                }
                this.f33024b.E = false;
                return;
            default:
                gi0 gi0Var = this.f33024b;
                ii0 ii0Var = gi0Var.P;
                try {
                    gi0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                ii0Var.m0 = ii0Var.T.indexOf(gi0Var.f33952e);
                ii0Var.f34706l0 = gi0Var.f33952e;
                ii0Var.invalidate();
                return;
        }
    }
}
