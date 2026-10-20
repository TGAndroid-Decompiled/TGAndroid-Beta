package org.telegram.ui;
public final class pd1 implements Runnable {
    public final int f40196a;
    public final re1 f40197b;

    public pd1(re1 re1Var, int i10) {
        this.f40196a = i10;
        this.f40197b = re1Var;
    }

    @Override
    public final void run() {
        switch (this.f40196a) {
            case 0:
                re1 re1Var = this.f40197b;
                re1Var.x0();
                re1Var.B0();
                return;
            case 1:
                this.f40197b.x0();
                return;
            case 2:
                this.f40197b.O0(true);
                return;
            case 3:
                this.f40197b.finishPreviewFragment();
                return;
            case 4:
                re1 re1Var2 = this.f40197b;
                re1Var2.A0 = null;
                re1Var2.U0(true, false);
                return;
            default:
                re1 re1Var3 = this.f40197b;
                re1Var3.N.postOnAnimation(new pd1(re1Var3, 1));
                return;
        }
    }
}
