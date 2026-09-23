package org.telegram.ui;
public final class d00 implements Runnable {
    public final int f32463a;
    public final c10 f32464b;

    public d00(c10 c10Var, int i10) {
        this.f32463a = i10;
        this.f32464b = c10Var;
    }

    @Override
    public final void run() {
        switch (this.f32463a) {
            case 0:
                c10.V(this.f32464b);
                return;
            default:
                c10.W(this.f32464b);
                return;
        }
    }
}
