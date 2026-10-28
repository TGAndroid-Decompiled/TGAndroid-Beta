package org.telegram.ui.Components;
public final class o7 implements Runnable {
    public final int f31206a;
    public final m8 f31207b;

    public o7(m8 m8Var, int i10) {
        this.f31206a = i10;
        this.f31207b = m8Var;
    }

    @Override
    public final void run() {
        switch (this.f31206a) {
            case 0:
                m8.s(this.f31207b);
                return;
            default:
                m8.u(this.f31207b);
                return;
        }
    }
}
