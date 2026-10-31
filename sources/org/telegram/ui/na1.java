package org.telegram.ui;
public final class na1 implements Runnable {
    public final int f39891a;
    public final pb1 f39892b;

    public na1(pb1 pb1Var, int i10) {
        this.f39891a = i10;
        this.f39892b = pb1Var;
    }

    @Override
    public final void run() {
        switch (this.f39891a) {
            case 0:
                pb1 pb1Var = this.f39892b;
                pb1Var.A0();
                pb1Var.E0();
                return;
            case 1:
                this.f39892b.A0();
                return;
            case 2:
                this.f39892b.R0(true);
                return;
            case 3:
                this.f39892b.finishPreviewFragment();
                return;
            case 4:
                pb1 pb1Var2 = this.f39892b;
                pb1Var2.A0 = null;
                pb1Var2.Y0(true, false);
                return;
            default:
                pb1 pb1Var3 = this.f39892b;
                pb1Var3.N.postOnAnimation(new na1(pb1Var3, 1));
                return;
        }
    }
}
