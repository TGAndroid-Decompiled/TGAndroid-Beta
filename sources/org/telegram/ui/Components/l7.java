package org.telegram.ui.Components;
public final class l7 implements Runnable {
    public final int f25964a;
    public final j8 f25965b;

    public l7(j8 j8Var, int i10) {
        this.f25964a = i10;
        this.f25965b = j8Var;
    }

    @Override
    public final void run() {
        switch (this.f25964a) {
            case 0:
                j8.n(this.f25965b);
                return;
            default:
                j8.G(this.f25965b);
                return;
        }
    }
}
