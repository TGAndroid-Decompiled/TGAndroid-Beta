package org.telegram.ui.Components;
public final class si0 implements Runnable {
    public final int f39627a;
    public final vi0 f39628b;

    public si0(vi0 vi0Var, int i7) {
        this.f39627a = i7;
        this.f39628b = vi0Var;
    }

    @Override
    public final void run() {
        switch (this.f39627a) {
            case 0:
                if (this.f39628b.f40708a.getImageReceiver().C() != null && !this.f39628b.f40708a.getImageReceiver().C().f37814l0 && !this.f39628b.f40708a.getImageReceiver().C().y()) {
                    this.f39628b.f40708a.getImageReceiver().C().start();
                }
                this.f39628b.F = false;
                return;
            default:
                vi0 vi0Var = this.f39628b;
                xi0 xi0Var = vi0Var.Q;
                try {
                    vi0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                xi0Var.f42037n0 = xi0Var.U.indexOf(vi0Var.f40711e);
                xi0Var.m0 = vi0Var.f40711e;
                xi0Var.invalidate();
                return;
        }
    }
}
