package org.telegram.ui;
public final class de1 implements Runnable {
    public final int f33108a;
    public final me1 f33109b;

    public de1(me1 me1Var, int i10) {
        this.f33108a = i10;
        this.f33109b = me1Var;
    }

    @Override
    public final void run() {
        switch (this.f33108a) {
            case 0:
                this.f33109b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f33109b.c(false);
                return;
        }
    }
}
