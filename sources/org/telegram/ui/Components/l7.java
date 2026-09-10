package org.telegram.ui.Components;
public final class l7 implements Runnable {
    public final int f24894a;
    public final j8 f24895b;

    public l7(j8 j8Var, int i10) {
        this.f24894a = i10;
        this.f24895b = j8Var;
    }

    @Override
    public final void run() {
        switch (this.f24894a) {
            case 0:
                j8.n(this.f24895b);
                return;
            default:
                j8.F(this.f24895b);
                return;
        }
    }
}
