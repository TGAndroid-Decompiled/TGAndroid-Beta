package org.telegram.ui;
public final class ae1 implements Runnable {
    public final int f37758a;
    public final cf1 f37759b;

    public ae1(cf1 cf1Var, int i10) {
        this.f37758a = i10;
        this.f37759b = cf1Var;
    }

    @Override
    public final void run() {
        switch (this.f37758a) {
            case 0:
                cf1 cf1Var = this.f37759b;
                cf1Var.x0();
                cf1Var.B0();
                return;
            case 1:
                this.f37759b.x0();
                return;
            case 2:
                this.f37759b.O0(true);
                return;
            case 3:
                this.f37759b.finishPreviewFragment();
                return;
            case 4:
                cf1 cf1Var2 = this.f37759b;
                cf1Var2.A0 = null;
                cf1Var2.V0(true, false);
                return;
            default:
                cf1 cf1Var3 = this.f37759b;
                cf1Var3.N.postOnAnimation(new ae1(cf1Var3, 1));
                return;
        }
    }
}
