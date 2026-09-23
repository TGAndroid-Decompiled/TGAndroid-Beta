package org.telegram.ui.Components;
public final class l7 implements Runnable {
    public final int f25831a;
    public final j8 f25832b;

    public l7(j8 j8Var, int i10) {
        this.f25831a = i10;
        this.f25832b = j8Var;
    }

    @Override
    public final void run() {
        switch (this.f25831a) {
            case 0:
                j8.n(this.f25832b);
                return;
            default:
                j8.G(this.f25832b);
                return;
        }
    }
}
