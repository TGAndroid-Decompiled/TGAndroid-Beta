package org.telegram.ui;
public final class c00 implements Runnable {
    public final int f32620a;
    public final b10 f32621b;

    public c00(b10 b10Var, int i10) {
        this.f32620a = i10;
        this.f32621b = b10Var;
    }

    @Override
    public final void run() {
        switch (this.f32620a) {
            case 0:
                b10.V(this.f32621b);
                return;
            default:
                b10.W(this.f32621b);
                return;
        }
    }
}
