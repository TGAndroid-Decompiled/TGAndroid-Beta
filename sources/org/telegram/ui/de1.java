package org.telegram.ui;
public final class de1 implements Runnable {
    public final int f36940a;
    public final me1 f36941b;

    public de1(me1 me1Var, int i10) {
        this.f36940a = i10;
        this.f36941b = me1Var;
    }

    @Override
    public final void run() {
        switch (this.f36940a) {
            case 0:
                this.f36941b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f36941b.c(false);
                return;
        }
    }
}
