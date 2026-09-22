package org.telegram.ui;
public final class de1 implements Runnable {
    public final int f33045a;
    public final me1 f33046b;

    public de1(me1 me1Var, int i10) {
        this.f33045a = i10;
        this.f33046b = me1Var;
    }

    @Override
    public final void run() {
        switch (this.f33045a) {
            case 0:
                this.f33046b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f33046b.c(false);
                return;
        }
    }
}
