package org.telegram.ui;
public final class p71 implements Runnable {
    public final int f48486a;
    public final w71 f48487b;

    public p71(w71 w71Var, int i3) {
        this.f48486a = i3;
        this.f48487b = w71Var;
    }

    @Override
    public final void run() {
        switch (this.f48486a) {
            case 0:
                this.f48487b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f48487b.c(false);
                return;
        }
    }
}
