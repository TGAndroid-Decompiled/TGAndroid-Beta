package org.telegram.ui;
public final class fe1 implements Runnable {
    public final int f37763a;
    public final oe1 f37764b;

    public fe1(oe1 oe1Var, int i10) {
        this.f37763a = i10;
        this.f37764b = oe1Var;
    }

    @Override
    public final void run() {
        switch (this.f37763a) {
            case 0:
                this.f37764b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f37764b.c(false);
                return;
        }
    }
}
