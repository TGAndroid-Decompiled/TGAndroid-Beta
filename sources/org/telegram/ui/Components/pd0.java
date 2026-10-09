package org.telegram.ui.Components;
public final class pd0 implements Runnable {
    public boolean f29855a;
    public final ud0 f29856b;

    public pd0(ud0 ud0Var) {
        this.f29856b = ud0Var;
    }

    @Override
    public final void run() {
        boolean z10 = this.f29855a;
        ud0 ud0Var = this.f29856b;
        ud0Var.a(z10);
        ud0Var.postDelayed(this, ud0Var.L);
    }
}
