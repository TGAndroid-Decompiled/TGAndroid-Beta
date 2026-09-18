package org.telegram.ui.Components;
public final class l7 implements Runnable {
    public final int f26047a;
    public final j8 f26048b;

    public l7(j8 j8Var, int i10) {
        this.f26047a = i10;
        this.f26048b = j8Var;
    }

    @Override
    public final void run() {
        switch (this.f26047a) {
            case 0:
                j8.n(this.f26048b);
                return;
            default:
                j8.G(this.f26048b);
                return;
        }
    }
}
