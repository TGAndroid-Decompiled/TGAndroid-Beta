package org.telegram.ui.Components;
public final class l7 implements Runnable {
    public final int f25985a;
    public final j8 f25986b;

    public l7(j8 j8Var, int i10) {
        this.f25985a = i10;
        this.f25986b = j8Var;
    }

    @Override
    public final void run() {
        switch (this.f25985a) {
            case 0:
                j8.n(this.f25986b);
                return;
            default:
                j8.G(this.f25986b);
                return;
        }
    }
}
