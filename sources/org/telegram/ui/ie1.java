package org.telegram.ui;
public final class ie1 implements Runnable {
    public final int f36793a;
    public final re1 f36794b;

    public ie1(re1 re1Var, int i10) {
        this.f36793a = i10;
        this.f36794b = re1Var;
    }

    @Override
    public final void run() {
        switch (this.f36793a) {
            case 0:
                this.f36794b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f36794b.c(false);
                return;
        }
    }
}
