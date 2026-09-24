package org.telegram.ui.Components;
public final class l7 implements Runnable {
    public final int f26028a;
    public final j8 f26029b;

    public l7(j8 j8Var, int i10) {
        this.f26028a = i10;
        this.f26029b = j8Var;
    }

    @Override
    public final void run() {
        switch (this.f26028a) {
            case 0:
                j8.n(this.f26029b);
                return;
            default:
                j8.G(this.f26029b);
                return;
        }
    }
}
