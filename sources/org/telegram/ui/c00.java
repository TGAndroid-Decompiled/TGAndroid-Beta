package org.telegram.ui;
public final class c00 implements Runnable {
    public final int f32535a;
    public final b10 f32536b;

    public c00(b10 b10Var, int i10) {
        this.f32535a = i10;
        this.f32536b = b10Var;
    }

    @Override
    public final void run() {
        switch (this.f32535a) {
            case 0:
                b10.V(this.f32536b);
                return;
            default:
                b10.W(this.f32536b);
                return;
        }
    }
}
