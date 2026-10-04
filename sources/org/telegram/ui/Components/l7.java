package org.telegram.ui.Components;
public final class l7 implements Runnable {
    public final int f28297a;
    public final j8 f28298b;

    public l7(j8 j8Var, int i10) {
        this.f28297a = i10;
        this.f28298b = j8Var;
    }

    @Override
    public final void run() {
        switch (this.f28297a) {
            case 0:
                j8.n(this.f28298b);
                return;
            default:
                j8.E(this.f28298b);
                return;
        }
    }
}
