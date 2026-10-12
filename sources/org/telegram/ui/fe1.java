package org.telegram.ui;
public final class fe1 implements Runnable {
    public final int f37759a;
    public final oe1 f37760b;

    public fe1(oe1 oe1Var, int i10) {
        this.f37759a = i10;
        this.f37760b = oe1Var;
    }

    @Override
    public final void run() {
        switch (this.f37759a) {
            case 0:
                this.f37760b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f37760b.c(false);
                return;
        }
    }
}
