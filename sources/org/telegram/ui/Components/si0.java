package org.telegram.ui.Components;
public final class si0 implements Runnable {
    public final int f39558a;
    public final vi0 f39559b;

    public si0(vi0 vi0Var, int i7) {
        this.f39558a = i7;
        this.f39559b = vi0Var;
    }

    @Override
    public final void run() {
        switch (this.f39558a) {
            case 0:
                if (this.f39559b.f40787a.getImageReceiver().B() != null && !this.f39559b.f40787a.getImageReceiver().B().f38188l0 && !this.f39559b.f40787a.getImageReceiver().B().y()) {
                    this.f39559b.f40787a.getImageReceiver().B().start();
                }
                this.f39559b.F = false;
                return;
            default:
                vi0 vi0Var = this.f39559b;
                xi0 xi0Var = vi0Var.Q;
                try {
                    vi0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                xi0Var.f42085n0 = xi0Var.U.indexOf(vi0Var.f40790e);
                xi0Var.m0 = vi0Var.f40790e;
                xi0Var.invalidate();
                return;
        }
    }
}
