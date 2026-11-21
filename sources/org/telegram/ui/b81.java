package org.telegram.ui;
public final class b81 implements Runnable {
    public final int f45812a;
    public final i81 f45813b;

    public b81(i81 i81Var, int i7) {
        this.f45812a = i7;
        this.f45813b = i81Var;
    }

    @Override
    public final void run() {
        switch (this.f45812a) {
            case 0:
                this.f45813b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f45813b.c(false);
                return;
        }
    }
}
