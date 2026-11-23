package org.telegram.ui.Components;
public final class si0 implements Runnable {
    public final int f39602a;
    public final vi0 f39603b;

    public si0(vi0 vi0Var, int i7) {
        this.f39602a = i7;
        this.f39603b = vi0Var;
    }

    @Override
    public final void run() {
        switch (this.f39602a) {
            case 0:
                if (this.f39603b.f40836a.getImageReceiver().B() != null && !this.f39603b.f40836a.getImageReceiver().B().f38219l0 && !this.f39603b.f40836a.getImageReceiver().B().y()) {
                    this.f39603b.f40836a.getImageReceiver().B().start();
                }
                this.f39603b.F = false;
                return;
            default:
                vi0 vi0Var = this.f39603b;
                xi0 xi0Var = vi0Var.Q;
                try {
                    vi0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                xi0Var.f42130n0 = xi0Var.U.indexOf(vi0Var.f40839e);
                xi0Var.m0 = vi0Var.f40839e;
                xi0Var.invalidate();
                return;
        }
    }
}
