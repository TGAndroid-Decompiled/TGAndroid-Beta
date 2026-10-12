package org.telegram.ui;
public final class jf1 implements Runnable {
    public final int f37372a;
    public final lg1 f37373b;

    public jf1(lg1 lg1Var, int i10) {
        this.f37372a = i10;
        this.f37373b = lg1Var;
    }

    @Override
    public final void run() {
        switch (this.f37372a) {
            case 0:
                lg1 lg1Var = this.f37373b;
                lg1Var.x0();
                lg1Var.B0();
                return;
            case 1:
                this.f37373b.x0();
                return;
            case 2:
                this.f37373b.O0(true);
                return;
            case 3:
                this.f37373b.finishPreviewFragment();
                return;
            case 4:
                lg1 lg1Var2 = this.f37373b;
                lg1Var2.A0 = null;
                lg1Var2.U0(true, false);
                return;
            default:
                lg1 lg1Var3 = this.f37373b;
                lg1Var3.N.postOnAnimation(new jf1(lg1Var3, 1));
                return;
        }
    }
}
