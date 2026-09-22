package org.telegram.ui.Components;
public final class k7 implements Runnable {
    public final int f25639a;
    public final i8 f25640b;

    public k7(i8 i8Var, int i10) {
        this.f25639a = i10;
        this.f25640b = i8Var;
    }

    @Override
    public final void run() {
        switch (this.f25639a) {
            case 0:
                i8.n(this.f25640b);
                return;
            default:
                i8.F(this.f25640b);
                return;
        }
    }
}
