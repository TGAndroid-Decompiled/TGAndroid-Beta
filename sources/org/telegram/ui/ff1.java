package org.telegram.ui;
public final class ff1 implements Runnable {
    public final int f37765a;
    public final hg1 f37766b;

    public ff1(hg1 hg1Var, int i10) {
        this.f37765a = i10;
        this.f37766b = hg1Var;
    }

    @Override
    public final void run() {
        switch (this.f37765a) {
            case 0:
                hg1 hg1Var = this.f37766b;
                hg1Var.x0();
                hg1Var.B0();
                return;
            case 1:
                this.f37766b.x0();
                return;
            case 2:
                this.f37766b.O0(true);
                return;
            case 3:
                this.f37766b.finishPreviewFragment();
                return;
            case 4:
                hg1 hg1Var2 = this.f37766b;
                hg1Var2.A0 = null;
                hg1Var2.U0(true, false);
                return;
            default:
                hg1 hg1Var3 = this.f37766b;
                hg1Var3.N.postOnAnimation(new ff1(hg1Var3, 1));
                return;
        }
    }
}
