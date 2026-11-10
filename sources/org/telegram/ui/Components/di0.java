package org.telegram.ui.Components;
public final class di0 implements Runnable {
    public final int f32999a;
    public final gi0 f33000b;

    public di0(gi0 gi0Var, int i7) {
        this.f32999a = i7;
        this.f33000b = gi0Var;
    }

    @Override
    public final void run() {
        switch (this.f32999a) {
            case 0:
                if (this.f33000b.f33903a.getImageReceiver().B() != null && !this.f33000b.f33903a.getImageReceiver().B().f40976k0 && !this.f33000b.f33903a.getImageReceiver().B().y()) {
                    this.f33000b.f33903a.getImageReceiver().B().start();
                }
                this.f33000b.E = false;
                return;
            default:
                gi0 gi0Var = this.f33000b;
                ii0 ii0Var = gi0Var.P;
                try {
                    gi0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                ii0Var.m0 = ii0Var.T.indexOf(gi0Var.f33906e);
                ii0Var.f34661l0 = gi0Var.f33906e;
                ii0Var.invalidate();
                return;
        }
    }
}
