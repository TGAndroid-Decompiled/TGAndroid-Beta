package org.telegram.ui;
public final class ce1 implements Runnable {
    public final int f35114a;
    public final le1 f35115b;

    public ce1(le1 le1Var, int i10) {
        this.f35114a = i10;
        this.f35115b = le1Var;
    }

    @Override
    public final void run() {
        switch (this.f35114a) {
            case 0:
                this.f35115b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f35115b.c(false);
                return;
        }
    }
}
