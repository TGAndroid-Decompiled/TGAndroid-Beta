package org.telegram.ui.Components;
public final class l7 implements Runnable {
    public final int f28292a;
    public final j8 f28293b;

    public l7(j8 j8Var, int i10) {
        this.f28292a = i10;
        this.f28293b = j8Var;
    }

    @Override
    public final void run() {
        switch (this.f28292a) {
            case 0:
                j8.n(this.f28293b);
                return;
            default:
                j8.E(this.f28293b);
                return;
        }
    }
}
