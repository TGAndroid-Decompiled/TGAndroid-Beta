package org.telegram.ui;
public final class de1 implements Runnable {
    public final int f36986a;
    public final me1 f36987b;

    public de1(me1 me1Var, int i10) {
        this.f36986a = i10;
        this.f36987b = me1Var;
    }

    @Override
    public final void run() {
        switch (this.f36986a) {
            case 0:
                this.f36987b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f36987b.c(false);
                return;
        }
    }
}
