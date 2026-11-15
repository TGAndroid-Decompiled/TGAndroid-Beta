package org.telegram.ui.Components;
public final class hi0 implements Runnable {
    public final int f35267a;
    public final ki0 f35268b;

    public hi0(ki0 ki0Var, int i7) {
        this.f35267a = i7;
        this.f35268b = ki0Var;
    }

    @Override
    public final void run() {
        switch (this.f35267a) {
            case 0:
                if (this.f35268b.f36524a.getImageReceiver().B() != null && !this.f35268b.f36524a.getImageReceiver().B().f33586l0 && !this.f35268b.f36524a.getImageReceiver().B().y()) {
                    this.f35268b.f36524a.getImageReceiver().B().start();
                }
                this.f35268b.F = false;
                return;
            default:
                ki0 ki0Var = this.f35268b;
                mi0 mi0Var = ki0Var.Q;
                try {
                    ki0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                mi0Var.f37285n0 = mi0Var.U.indexOf(ki0Var.f36527e);
                mi0Var.m0 = ki0Var.f36527e;
                mi0Var.invalidate();
                return;
        }
    }
}
