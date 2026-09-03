package org.telegram.ui;
public final class pd1 implements Runnable {
    public final int f37106a;
    public final yd1 f37107b;

    public pd1(yd1 yd1Var, int i10) {
        this.f37106a = i10;
        this.f37107b = yd1Var;
    }

    @Override
    public final void run() {
        switch (this.f37106a) {
            case 0:
                this.f37107b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f37107b.c(false);
                return;
        }
    }
}
