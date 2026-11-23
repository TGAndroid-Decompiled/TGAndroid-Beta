package org.telegram.ui;
public final class b81 implements Runnable {
    public final int f45767a;
    public final i81 f45768b;

    public b81(i81 i81Var, int i7) {
        this.f45767a = i7;
        this.f45768b = i81Var;
    }

    @Override
    public final void run() {
        switch (this.f45767a) {
            case 0:
                this.f45768b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f45768b.c(false);
                return;
        }
    }
}
