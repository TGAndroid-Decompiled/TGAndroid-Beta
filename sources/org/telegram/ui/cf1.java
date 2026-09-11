package org.telegram.ui;
public final class cf1 implements Runnable {
    public final int f35093a;
    public final eg1 f35094b;

    public cf1(eg1 eg1Var, int i10) {
        this.f35093a = i10;
        this.f35094b = eg1Var;
    }

    @Override
    public final void run() {
        switch (this.f35093a) {
            case 0:
                eg1 eg1Var = this.f35094b;
                eg1Var.x0();
                eg1Var.B0();
                return;
            case 1:
                this.f35094b.x0();
                return;
            case 2:
                this.f35094b.O0(true);
                return;
            case 3:
                this.f35094b.finishPreviewFragment();
                return;
            case 4:
                eg1 eg1Var2 = this.f35094b;
                eg1Var2.A0 = null;
                eg1Var2.U0(true, false);
                return;
            default:
                eg1 eg1Var3 = this.f35094b;
                eg1Var3.N.postOnAnimation(new cf1(eg1Var3, 1));
                return;
        }
    }
}
