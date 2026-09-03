package org.telegram.ui;
public final class pd1 implements Runnable {
    public final int f39982a;
    public final zd1 f39983b;

    public pd1(zd1 zd1Var, int i10) {
        this.f39982a = i10;
        this.f39983b = zd1Var;
    }

    @Override
    public final void run() {
        switch (this.f39982a) {
            case 0:
                this.f39983b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f39983b.c(false);
                return;
        }
    }
}
