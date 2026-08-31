package org.telegram.ui;
public final class ke1 implements Runnable {
    public final int f38387a;
    public final mf1 f38388b;

    public ke1(mf1 mf1Var, int i10) {
        this.f38387a = i10;
        this.f38388b = mf1Var;
    }

    @Override
    public final void run() {
        switch (this.f38387a) {
            case 0:
                mf1 mf1Var = this.f38388b;
                mf1Var.x0();
                mf1Var.B0();
                return;
            case 1:
                this.f38388b.x0();
                return;
            case 2:
                this.f38388b.O0(true);
                return;
            case 3:
                this.f38388b.finishPreviewFragment();
                return;
            case 4:
                mf1 mf1Var2 = this.f38388b;
                mf1Var2.f39144x0 = null;
                mf1Var2.U0(true, false);
                return;
            default:
                mf1 mf1Var3 = this.f38388b;
                mf1Var3.K.postOnAnimation(new ke1(mf1Var3, 1));
                return;
        }
    }
}
