package org.telegram.ui;
public final class b81 implements Runnable {
    public final int f43981a;
    public final i81 f43982b;

    public b81(i81 i81Var, int i7) {
        this.f43981a = i7;
        this.f43982b = i81Var;
    }

    @Override
    public final void run() {
        switch (this.f43981a) {
            case 0:
                this.f43982b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f43982b.c(false);
                return;
        }
    }
}
