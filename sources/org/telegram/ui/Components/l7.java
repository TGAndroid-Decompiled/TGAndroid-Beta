package org.telegram.ui.Components;
public final class l7 implements Runnable {
    public final int f26036a;
    public final j8 f26037b;

    public l7(j8 j8Var, int i10) {
        this.f26036a = i10;
        this.f26037b = j8Var;
    }

    @Override
    public final void run() {
        switch (this.f26036a) {
            case 0:
                j8.n(this.f26037b);
                return;
            default:
                j8.G(this.f26037b);
                return;
        }
    }
}
