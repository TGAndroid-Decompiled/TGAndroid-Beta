package org.telegram.ui.Components;
public final class z0 implements Runnable {
    public final int f32954a;
    public final r4 f32955b;
    public final org.telegram.ui.ActionBar.x1 f32956c;
    public final org.telegram.ui.ActionBar.k2 d;

    public z0(r4 r4Var, org.telegram.ui.ActionBar.x1 x1Var, org.telegram.ui.ActionBar.k2 k2Var, int i10) {
        this.f32954a = i10;
        this.f32955b = r4Var;
        this.f32956c = x1Var;
        this.d = k2Var;
    }

    @Override
    public final void run() {
        switch (this.f32954a) {
            case 0:
                org.telegram.messenger.i0.g3(new z0(this.f32955b, this.f32956c, this.d, 1));
                return;
            default:
                s4.d0(this.f32955b, this.f32956c, this.d);
                return;
        }
    }
}
