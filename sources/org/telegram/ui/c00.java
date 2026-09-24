package org.telegram.ui;
public final class c00 implements Runnable {
    public final int f32520a;
    public final b10 f32521b;

    public c00(b10 b10Var, int i10) {
        this.f32520a = i10;
        this.f32521b = b10Var;
    }

    @Override
    public final void run() {
        switch (this.f32520a) {
            case 0:
                b10.V(this.f32521b);
                return;
            default:
                b10.W(this.f32521b);
                return;
        }
    }
}
