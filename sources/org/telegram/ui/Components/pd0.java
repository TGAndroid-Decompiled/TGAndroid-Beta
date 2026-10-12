package org.telegram.ui.Components;
public final class pd0 implements Runnable {
    public boolean f28297a;
    public final ud0 f28298b;

    public pd0(ud0 ud0Var) {
        this.f28298b = ud0Var;
    }

    @Override
    public final void run() {
        boolean z10 = this.f28297a;
        ud0 ud0Var = this.f28298b;
        ud0Var.a(z10);
        ud0Var.postDelayed(this, ud0Var.L);
    }
}
