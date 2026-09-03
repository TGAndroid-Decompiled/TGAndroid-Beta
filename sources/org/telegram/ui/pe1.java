package org.telegram.ui;
public final class pe1 implements Runnable {
    public final int f37112a;
    public final sf1 f37113b;

    public pe1(sf1 sf1Var, int i10) {
        this.f37112a = i10;
        this.f37113b = sf1Var;
    }

    @Override
    public final void run() {
        switch (this.f37112a) {
            case 0:
                sf1 sf1Var = this.f37113b;
                sf1Var.x0();
                sf1Var.B0();
                return;
            case 1:
                this.f37113b.x0();
                return;
            case 2:
                this.f37113b.O0(true);
                return;
            case 3:
                this.f37113b.finishPreviewFragment();
                return;
            case 4:
                sf1 sf1Var2 = this.f37113b;
                sf1Var2.f38216x0 = null;
                sf1Var2.U0(true, false);
                return;
            default:
                sf1 sf1Var3 = this.f37113b;
                sf1Var3.K.postOnAnimation(new pe1(sf1Var3, 1));
                return;
        }
    }
}
