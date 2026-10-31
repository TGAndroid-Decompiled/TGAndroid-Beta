package org.telegram.ui;
public final class q91 implements Runnable {
    public final int f40938a;
    public final x91 f40939b;

    public q91(x91 x91Var, int i10) {
        this.f40938a = i10;
        this.f40939b = x91Var;
    }

    @Override
    public final void run() {
        switch (this.f40938a) {
            case 0:
                this.f40939b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f40939b.c(false);
                return;
        }
    }
}
