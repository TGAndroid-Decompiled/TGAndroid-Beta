package org.telegram.ui.Components;
public final class x11 implements Runnable {
    public final int f32717a;
    public final a21 f32718b;
    public final z11 f32719c;

    public x11(a21 a21Var, z11 z11Var, int i10) {
        this.f32717a = i10;
        this.f32718b = a21Var;
        this.f32719c = z11Var;
    }

    @Override
    public final void run() {
        switch (this.f32717a) {
            case 0:
                this.f32718b.b(this.f32719c);
                return;
            case 1:
                this.f32718b.b(this.f32719c);
                return;
            default:
                this.f32718b.b(this.f32719c);
                return;
        }
    }
}
