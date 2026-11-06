package org.telegram.ui.Components;
public final class di0 implements Runnable {
    public final int f32973a;
    public final gi0 f32974b;

    public di0(gi0 gi0Var, int i7) {
        this.f32973a = i7;
        this.f32974b = gi0Var;
    }

    @Override
    public final void run() {
        switch (this.f32973a) {
            case 0:
                if (this.f32974b.f33967a.getImageReceiver().B() != null && !this.f32974b.f33967a.getImageReceiver().B().f40939k0 && !this.f32974b.f33967a.getImageReceiver().B().y()) {
                    this.f32974b.f33967a.getImageReceiver().B().start();
                }
                this.f32974b.E = false;
                return;
            default:
                gi0 gi0Var = this.f32974b;
                ii0 ii0Var = gi0Var.P;
                try {
                    gi0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                ii0Var.m0 = ii0Var.T.indexOf(gi0Var.f33970e);
                ii0Var.f34669l0 = gi0Var.f33970e;
                ii0Var.invalidate();
                return;
        }
    }
}
