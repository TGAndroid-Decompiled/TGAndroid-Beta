package org.telegram.ui.Components;
public final class l7 implements Runnable {
    public final int f25929a;
    public final j8 f25930b;

    public l7(j8 j8Var, int i10) {
        this.f25929a = i10;
        this.f25930b = j8Var;
    }

    @Override
    public final void run() {
        switch (this.f25929a) {
            case 0:
                j8.n(this.f25930b);
                return;
            default:
                j8.G(this.f25930b);
                return;
        }
    }
}
