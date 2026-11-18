package org.telegram.ui.Components;
public final class qi0 implements Runnable {
    public final int f38814a;
    public final ti0 f38815b;

    public qi0(ti0 ti0Var, int i7) {
        this.f38814a = i7;
        this.f38815b = ti0Var;
    }

    @Override
    public final void run() {
        switch (this.f38814a) {
            case 0:
                if (this.f38815b.f40009a.getImageReceiver().B() != null && !this.f38815b.f40009a.getImageReceiver().B().f37495l0 && !this.f38815b.f40009a.getImageReceiver().B().y()) {
                    this.f38815b.f40009a.getImageReceiver().B().start();
                }
                this.f38815b.F = false;
                return;
            default:
                ti0 ti0Var = this.f38815b;
                vi0 vi0Var = ti0Var.Q;
                try {
                    ti0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                vi0Var.f40667n0 = vi0Var.U.indexOf(ti0Var.f40012e);
                vi0Var.m0 = ti0Var.f40012e;
                vi0Var.invalidate();
                return;
        }
    }
}
