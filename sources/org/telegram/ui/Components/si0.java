package org.telegram.ui.Components;
public final class si0 implements Runnable {
    public final int f39603a;
    public final vi0 f39604b;

    public si0(vi0 vi0Var, int i7) {
        this.f39603a = i7;
        this.f39604b = vi0Var;
    }

    @Override
    public final void run() {
        switch (this.f39603a) {
            case 0:
                if (this.f39604b.f40837a.getImageReceiver().B() != null && !this.f39604b.f40837a.getImageReceiver().B().f38220l0 && !this.f39604b.f40837a.getImageReceiver().B().y()) {
                    this.f39604b.f40837a.getImageReceiver().B().start();
                }
                this.f39604b.F = false;
                return;
            default:
                vi0 vi0Var = this.f39604b;
                xi0 xi0Var = vi0Var.Q;
                try {
                    vi0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                xi0Var.f42131n0 = xi0Var.U.indexOf(vi0Var.f40840e);
                xi0Var.m0 = vi0Var.f40840e;
                xi0Var.invalidate();
                return;
        }
    }
}
