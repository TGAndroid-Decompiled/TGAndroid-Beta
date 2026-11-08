package org.telegram.ui.Components;
public final class cb0 implements Runnable {
    public boolean f32535a;
    public final hb0 f32536b;

    public cb0(hb0 hb0Var) {
        this.f32536b = hb0Var;
    }

    @Override
    public final void run() {
        boolean z9 = this.f32535a;
        hb0 hb0Var = this.f32536b;
        hb0Var.a(z9);
        hb0Var.postDelayed(this, hb0Var.M);
    }
}
