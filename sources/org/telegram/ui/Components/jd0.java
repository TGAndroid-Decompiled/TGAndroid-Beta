package org.telegram.ui.Components;
public final class jd0 implements Runnable {
    public boolean f27515a;
    public final od0 f27516b;

    public jd0(od0 od0Var) {
        this.f27516b = od0Var;
    }

    @Override
    public final void run() {
        boolean z10 = this.f27515a;
        od0 od0Var = this.f27516b;
        od0Var.a(z10);
        od0Var.postDelayed(this, od0Var.L);
    }
}
