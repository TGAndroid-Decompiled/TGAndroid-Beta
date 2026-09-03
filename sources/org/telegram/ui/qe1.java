package org.telegram.ui;
public final class qe1 implements Runnable {
    public final int f40449a;
    public final sf1 f40450b;

    public qe1(sf1 sf1Var, int i10) {
        this.f40449a = i10;
        this.f40450b = sf1Var;
    }

    @Override
    public final void run() {
        switch (this.f40449a) {
            case 0:
                sf1 sf1Var = this.f40450b;
                sf1Var.x0();
                sf1Var.B0();
                return;
            case 1:
                this.f40450b.x0();
                return;
            case 2:
                this.f40450b.O0(true);
                return;
            case 3:
                this.f40450b.finishPreviewFragment();
                return;
            case 4:
                sf1 sf1Var2 = this.f40450b;
                sf1Var2.f41230x0 = null;
                sf1Var2.U0(true, false);
                return;
            default:
                sf1 sf1Var3 = this.f40450b;
                sf1Var3.K.postOnAnimation(new qe1(sf1Var3, 1));
                return;
        }
    }
}
