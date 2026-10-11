package org.telegram.ui;
public final class ce1 implements Runnable {
    public final int f36678a;
    public final le1 f36679b;

    public ce1(le1 le1Var, int i10) {
        this.f36678a = i10;
        this.f36679b = le1Var;
    }

    @Override
    public final void run() {
        switch (this.f36678a) {
            case 0:
                this.f36679b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f36679b.c(false);
                return;
        }
    }
}
