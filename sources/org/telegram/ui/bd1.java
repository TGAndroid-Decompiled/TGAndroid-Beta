package org.telegram.ui;
public final class bd1 implements Runnable {
    public final int f38013a;
    public final kd1 f38014b;

    public bd1(kd1 kd1Var, int i10) {
        this.f38013a = i10;
        this.f38014b = kd1Var;
    }

    @Override
    public final void run() {
        switch (this.f38013a) {
            case 0:
                this.f38014b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f38014b.c(false);
                return;
        }
    }
}
