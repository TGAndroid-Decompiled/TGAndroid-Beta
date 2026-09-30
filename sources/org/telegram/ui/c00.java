package org.telegram.ui;
public final class c00 implements Runnable {
    public final int f32536a;
    public final b10 f32537b;

    public c00(b10 b10Var, int i10) {
        this.f32536a = i10;
        this.f32537b = b10Var;
    }

    @Override
    public final void run() {
        switch (this.f32536a) {
            case 0:
                b10.V(this.f32537b);
                return;
            default:
                b10.W(this.f32537b);
                return;
        }
    }
}
