package org.telegram.ui.Components;
public final class hj0 implements Runnable {
    public final int f26750a;
    public final kj0 f26751b;

    public hj0(kj0 kj0Var, int i10) {
        this.f26750a = i10;
        this.f26751b = kj0Var;
    }

    @Override
    public final void run() {
        switch (this.f26750a) {
            case 0:
                if (this.f26751b.f27771a.getImageReceiver().B() != null && !this.f26751b.f27771a.getImageReceiver().B().f24765k0 && !this.f26751b.f27771a.getImageReceiver().B().y()) {
                    this.f26751b.f27771a.getImageReceiver().B().start();
                }
                this.f26751b.E = false;
                return;
            default:
                kj0 kj0Var = this.f26751b;
                mj0 mj0Var = kj0Var.P;
                try {
                    kj0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                mj0Var.m0 = mj0Var.T.indexOf(kj0Var.e);
                mj0Var.f28523l0 = kj0Var.e;
                mj0Var.invalidate();
                return;
        }
    }
}
