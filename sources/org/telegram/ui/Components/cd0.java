package org.telegram.ui.Components;
public final class cd0 implements Runnable {
    public boolean f23294a;
    public final hd0 f23295b;

    public cd0(hd0 hd0Var) {
        this.f23295b = hd0Var;
    }

    @Override
    public final void run() {
        boolean z10 = this.f23294a;
        hd0 hd0Var = this.f23295b;
        hd0Var.a(z10);
        hd0Var.postDelayed(this, hd0Var.L);
    }
}
