package org.telegram.ui;
public final class bj0 implements Runnable {
    public final int f32979a;
    public final hj0 f32980b;

    public bj0(hj0 hj0Var, int i10) {
        this.f32979a = i10;
        this.f32980b = hj0Var;
    }

    @Override
    public final void run() {
        switch (this.f32979a) {
            case 0:
                this.f32980b.dismiss();
                return;
            case 1:
                this.f32980b.U(true, false);
                return;
            default:
                this.f32980b.U(true, false);
                return;
        }
    }
}
