package org.telegram.ui;
public final class c00 implements Runnable {
    public final int f32534a;
    public final b10 f32535b;

    public c00(b10 b10Var, int i10) {
        this.f32534a = i10;
        this.f32535b = b10Var;
    }

    @Override
    public final void run() {
        switch (this.f32534a) {
            case 0:
                b10.V(this.f32535b);
                return;
            default:
                b10.W(this.f32535b);
                return;
        }
    }
}
