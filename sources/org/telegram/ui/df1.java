package org.telegram.ui;
public final class df1 implements Runnable {
    public final int f33029a;
    public final fg1 f33030b;

    public df1(fg1 fg1Var, int i10) {
        this.f33029a = i10;
        this.f33030b = fg1Var;
    }

    @Override
    public final void run() {
        switch (this.f33029a) {
            case 0:
                fg1 fg1Var = this.f33030b;
                fg1Var.x0();
                fg1Var.B0();
                return;
            case 1:
                this.f33030b.x0();
                return;
            case 2:
                this.f33030b.O0(true);
                return;
            case 3:
                this.f33030b.finishPreviewFragment();
                return;
            case 4:
                fg1 fg1Var2 = this.f33030b;
                fg1Var2.A0 = null;
                fg1Var2.U0(true, false);
                return;
            default:
                fg1 fg1Var3 = this.f33030b;
                fg1Var3.N.postOnAnimation(new df1(fg1Var3, 1));
                return;
        }
    }
}
