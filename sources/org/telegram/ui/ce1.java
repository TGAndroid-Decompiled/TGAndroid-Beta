package org.telegram.ui;
public final class ce1 implements Runnable {
    public final int f35086a;
    public final le1 f35087b;

    public ce1(le1 le1Var, int i10) {
        this.f35086a = i10;
        this.f35087b = le1Var;
    }

    @Override
    public final void run() {
        switch (this.f35086a) {
            case 0:
                this.f35087b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f35087b.c(false);
                return;
        }
    }
}
