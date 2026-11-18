package org.telegram.ui.Components;
public final class nb0 implements Runnable {
    public boolean f37758a;
    public final sb0 f37759b;

    public nb0(sb0 sb0Var) {
        this.f37759b = sb0Var;
    }

    @Override
    public final void run() {
        boolean z10 = this.f37758a;
        sb0 sb0Var = this.f37759b;
        sb0Var.a(z10);
        sb0Var.postDelayed(this, sb0Var.N);
    }
}
