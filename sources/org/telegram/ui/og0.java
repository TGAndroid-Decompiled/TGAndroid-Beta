package org.telegram.ui;
public final class og0 implements Runnable {
    public final int f50609a;
    public final ug0 f50610b;

    public og0(ug0 ug0Var, int i7) {
        this.f50609a = i7;
        this.f50610b = ug0Var;
    }

    @Override
    public final void run() {
        switch (this.f50609a) {
            case 0:
                this.f50610b.dismiss();
                return;
            case 1:
                this.f50610b.h1(true, false);
                return;
            default:
                this.f50610b.h1(true, false);
                return;
        }
    }
}
