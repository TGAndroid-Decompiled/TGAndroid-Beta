package org.telegram.ui.Components;
public final class rc0 implements Runnable {
    public boolean f28446a;
    public final wc0 f28447b;

    public rc0(wc0 wc0Var) {
        this.f28447b = wc0Var;
    }

    @Override
    public final void run() {
        boolean z4 = this.f28446a;
        wc0 wc0Var = this.f28447b;
        wc0Var.a(z4);
        wc0Var.postDelayed(this, wc0Var.I);
    }
}
