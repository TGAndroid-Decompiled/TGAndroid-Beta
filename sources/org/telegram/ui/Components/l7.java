package org.telegram.ui.Components;
public final class l7 implements Runnable {
    public final int f25941a;
    public final j8 f25942b;

    public l7(j8 j8Var, int i10) {
        this.f25941a = i10;
        this.f25942b = j8Var;
    }

    @Override
    public final void run() {
        switch (this.f25941a) {
            case 0:
                j8.n(this.f25942b);
                return;
            default:
                j8.G(this.f25942b);
                return;
        }
    }
}
