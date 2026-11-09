package org.telegram.ui.Components;
public final class db0 implements Runnable {
    public boolean f32929a;
    public final ib0 f32930b;

    public db0(ib0 ib0Var) {
        this.f32930b = ib0Var;
    }

    @Override
    public final void run() {
        boolean z9 = this.f32929a;
        ib0 ib0Var = this.f32930b;
        ib0Var.a(z9);
        ib0Var.postDelayed(this, ib0Var.M);
    }
}
