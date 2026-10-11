package org.telegram.ui.Components;
public final class pd0 implements Runnable {
    public boolean f29858a;
    public final ud0 f29859b;

    public pd0(ud0 ud0Var) {
        this.f29859b = ud0Var;
    }

    @Override
    public final void run() {
        boolean z10 = this.f29858a;
        ud0 ud0Var = this.f29859b;
        ud0Var.a(z10);
        ud0Var.postDelayed(this, ud0Var.L);
    }
}
