package org.telegram.ui.Components;
public final class si0 implements Runnable {
    public final int f39610a;
    public final vi0 f39611b;

    public si0(vi0 vi0Var, int i7) {
        this.f39610a = i7;
        this.f39611b = vi0Var;
    }

    @Override
    public final void run() {
        switch (this.f39610a) {
            case 0:
                if (this.f39611b.f40835a.getImageReceiver().B() != null && !this.f39611b.f40835a.getImageReceiver().B().f38226l0 && !this.f39611b.f40835a.getImageReceiver().B().y()) {
                    this.f39611b.f40835a.getImageReceiver().B().start();
                }
                this.f39611b.F = false;
                return;
            default:
                vi0 vi0Var = this.f39611b;
                xi0 xi0Var = vi0Var.Q;
                try {
                    vi0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                xi0Var.f42138n0 = xi0Var.U.indexOf(vi0Var.f40838e);
                xi0Var.m0 = vi0Var.f40838e;
                xi0Var.invalidate();
                return;
        }
    }
}
