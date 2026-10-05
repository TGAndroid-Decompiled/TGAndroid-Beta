package org.telegram.ui.Components;
public final class l7 implements Runnable {
    public final int f28385a;
    public final j8 f28386b;

    public l7(j8 j8Var, int i10) {
        this.f28385a = i10;
        this.f28386b = j8Var;
    }

    @Override
    public final void run() {
        switch (this.f28385a) {
            case 0:
                j8.n(this.f28386b);
                return;
            default:
                j8.E(this.f28386b);
                return;
        }
    }
}
