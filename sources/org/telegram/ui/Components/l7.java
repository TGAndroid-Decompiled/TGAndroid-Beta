package org.telegram.ui.Components;
public final class l7 implements Runnable {
    public final int f26035a;
    public final j8 f26036b;

    public l7(j8 j8Var, int i10) {
        this.f26035a = i10;
        this.f26036b = j8Var;
    }

    @Override
    public final void run() {
        switch (this.f26035a) {
            case 0:
                j8.n(this.f26036b);
                return;
            default:
                j8.G(this.f26036b);
                return;
        }
    }
}
