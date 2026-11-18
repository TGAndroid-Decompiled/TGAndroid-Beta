package org.telegram.ui;
public final class b81 implements Runnable {
    public final int f45795a;
    public final i81 f45796b;

    public b81(i81 i81Var, int i7) {
        this.f45795a = i7;
        this.f45796b = i81Var;
    }

    @Override
    public final void run() {
        switch (this.f45795a) {
            case 0:
                this.f45796b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f45796b.c(false);
                return;
        }
    }
}
