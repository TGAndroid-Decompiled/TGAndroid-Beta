package org.telegram.ui;
public final class gf1 implements Runnable {
    public final int f33088a;
    public final ig1 f33089b;

    public gf1(ig1 ig1Var, int i10) {
        this.f33088a = i10;
        this.f33089b = ig1Var;
    }

    @Override
    public final void run() {
        switch (this.f33088a) {
            case 0:
                ig1 ig1Var = this.f33089b;
                ig1Var.x0();
                ig1Var.B0();
                return;
            case 1:
                this.f33089b.x0();
                return;
            case 2:
                this.f33089b.O0(true);
                return;
            case 3:
                this.f33089b.finishPreviewFragment();
                return;
            case 4:
                ig1 ig1Var2 = this.f33089b;
                ig1Var2.A0 = null;
                ig1Var2.U0(true, false);
                return;
            default:
                ig1 ig1Var3 = this.f33089b;
                ig1Var3.N.postOnAnimation(new gf1(ig1Var3, 1));
                return;
        }
    }
}
