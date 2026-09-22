package org.telegram.ui;
public final class df1 implements Runnable {
    public final int f33050a;
    public final fg1 f33051b;

    public df1(fg1 fg1Var, int i10) {
        this.f33050a = i10;
        this.f33051b = fg1Var;
    }

    @Override
    public final void run() {
        switch (this.f33050a) {
            case 0:
                fg1 fg1Var = this.f33051b;
                fg1Var.x0();
                fg1Var.B0();
                return;
            case 1:
                this.f33051b.x0();
                return;
            case 2:
                this.f33051b.O0(true);
                return;
            case 3:
                this.f33051b.finishPreviewFragment();
                return;
            case 4:
                fg1 fg1Var2 = this.f33051b;
                fg1Var2.A0 = null;
                fg1Var2.U0(true, false);
                return;
            default:
                fg1 fg1Var3 = this.f33051b;
                fg1Var3.N.postOnAnimation(new df1(fg1Var3, 1));
                return;
        }
    }
}
