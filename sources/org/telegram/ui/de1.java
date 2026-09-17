package org.telegram.ui;
public final class de1 implements Runnable {
    public final int f33104a;
    public final me1 f33105b;

    public de1(me1 me1Var, int i10) {
        this.f33104a = i10;
        this.f33105b = me1Var;
    }

    @Override
    public final void run() {
        switch (this.f33104a) {
            case 0:
                this.f33105b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f33105b.c(false);
                return;
        }
    }
}
