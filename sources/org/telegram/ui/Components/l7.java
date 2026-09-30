package org.telegram.ui.Components;
public final class l7 implements Runnable {
    public final int f25925a;
    public final j8 f25926b;

    public l7(j8 j8Var, int i10) {
        this.f25925a = i10;
        this.f25926b = j8Var;
    }

    @Override
    public final void run() {
        switch (this.f25925a) {
            case 0:
                j8.n(this.f25926b);
                return;
            default:
                j8.G(this.f25926b);
                return;
        }
    }
}
