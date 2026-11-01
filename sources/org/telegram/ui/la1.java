package org.telegram.ui;
public final class la1 implements Runnable {
    public final int f39177a;
    public final nb1 f39178b;

    public la1(nb1 nb1Var, int i10) {
        this.f39177a = i10;
        this.f39178b = nb1Var;
    }

    @Override
    public final void run() {
        switch (this.f39177a) {
            case 0:
                nb1 nb1Var = this.f39178b;
                nb1Var.B0();
                nb1Var.F0();
                return;
            case 1:
                this.f39178b.B0();
                return;
            case 2:
                this.f39178b.S0(true);
                return;
            case 3:
                this.f39178b.finishPreviewFragment();
                return;
            case 4:
                nb1 nb1Var2 = this.f39178b;
                nb1Var2.A0 = null;
                nb1Var2.Z0(true, false);
                return;
            default:
                nb1 nb1Var3 = this.f39178b;
                nb1Var3.N.postOnAnimation(new la1(nb1Var3, 1));
                return;
        }
    }
}
