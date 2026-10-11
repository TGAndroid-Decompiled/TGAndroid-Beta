package org.telegram.ui;
public final class cf1 implements Runnable {
    public final int f36687a;
    public final eg1 f36688b;

    public cf1(eg1 eg1Var, int i10) {
        this.f36687a = i10;
        this.f36688b = eg1Var;
    }

    @Override
    public final void run() {
        switch (this.f36687a) {
            case 0:
                eg1 eg1Var = this.f36688b;
                eg1Var.x0();
                eg1Var.B0();
                return;
            case 1:
                this.f36688b.x0();
                return;
            case 2:
                this.f36688b.O0(true);
                return;
            case 3:
                this.f36688b.finishPreviewFragment();
                return;
            case 4:
                eg1 eg1Var2 = this.f36688b;
                eg1Var2.A0 = null;
                eg1Var2.U0(true, false);
                return;
            default:
                eg1 eg1Var3 = this.f36688b;
                eg1Var3.N.postOnAnimation(new cf1(eg1Var3, 1));
                return;
        }
    }
}
