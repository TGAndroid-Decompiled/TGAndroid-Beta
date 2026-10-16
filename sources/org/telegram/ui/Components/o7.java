package org.telegram.ui.Components;
public final class o7 implements Runnable {
    public final int f27589a;
    public final m8 f27590b;

    public o7(m8 m8Var, int i10) {
        this.f27589a = i10;
        this.f27590b = m8Var;
    }

    @Override
    public final void run() {
        switch (this.f27589a) {
            case 0:
                m8.o(this.f27590b);
                return;
            default:
                m8.H(this.f27590b);
                return;
        }
    }
}
