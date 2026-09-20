package org.telegram.ui;
public final class de1 implements Runnable {
    public final int f33024a;
    public final me1 f33025b;

    public de1(me1 me1Var, int i10) {
        this.f33024a = i10;
        this.f33025b = me1Var;
    }

    @Override
    public final void run() {
        switch (this.f33024a) {
            case 0:
                this.f33025b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f33025b.c(false);
                return;
        }
    }
}
