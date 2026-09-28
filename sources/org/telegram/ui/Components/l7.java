package org.telegram.ui.Components;
public final class l7 implements Runnable {
    public final int f25942a;
    public final j8 f25943b;

    public l7(j8 j8Var, int i10) {
        this.f25942a = i10;
        this.f25943b = j8Var;
    }

    @Override
    public final void run() {
        switch (this.f25942a) {
            case 0:
                j8.n(this.f25943b);
                return;
            default:
                j8.G(this.f25943b);
                return;
        }
    }
}
