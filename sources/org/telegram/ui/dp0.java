package org.telegram.ui;
public final class dp0 implements Runnable {
    public final int f38651a;
    public final np0 f38652b;

    public dp0(np0 np0Var, int i10) {
        this.f38651a = i10;
        this.f38652b = np0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f38651a;
        np0 np0Var = this.f38652b;
        switch (i10) {
            case 0:
                if (np0Var.G) {
                    np0Var.f41839b.invalidate();
                    return;
                }
                return;
            case 1:
                np0Var.h();
                return;
            case 2:
                int i11 = np0.f41836q0;
                np0Var.h();
                return;
            default:
                int i12 = np0.f41836q0;
                np0Var.h();
                return;
        }
    }
}
