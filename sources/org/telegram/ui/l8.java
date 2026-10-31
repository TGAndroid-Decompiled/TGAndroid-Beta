package org.telegram.ui;
public final class l8 implements Runnable {
    public final int f39086a;
    public final j9 f39087b;

    public l8(j9 j9Var, int i10) {
        this.f39086a = i10;
        this.f39087b = j9Var;
    }

    @Override
    public final void run() {
        switch (this.f39086a) {
            case 0:
                this.f39087b.l0(false);
                return;
            default:
                this.f39087b.g0();
                return;
        }
    }
}
