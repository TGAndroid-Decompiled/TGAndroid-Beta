package org.telegram.ui;
public final class ie1 implements Runnable {
    public final int f37104a;
    public final se1 f37105b;

    public ie1(se1 se1Var, int i10) {
        this.f37104a = i10;
        this.f37105b = se1Var;
    }

    @Override
    public final void run() {
        switch (this.f37104a) {
            case 0:
                this.f37105b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f37105b.c(false);
                return;
        }
    }
}
