package org.telegram.ui;
public final class kd1 implements Runnable {
    public final int f38354a;
    public final ud1 f38355b;

    public kd1(ud1 ud1Var, int i10) {
        this.f38354a = i10;
        this.f38355b = ud1Var;
    }

    @Override
    public final void run() {
        switch (this.f38354a) {
            case 0:
                this.f38355b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f38355b.c(false);
                return;
        }
    }
}
