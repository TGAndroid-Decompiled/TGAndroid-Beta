package org.telegram.ui.Components;
public final class o7 implements Runnable {
    public final int f31216a;
    public final m8 f31217b;

    public o7(m8 m8Var, int i10) {
        this.f31216a = i10;
        this.f31217b = m8Var;
    }

    @Override
    public final void run() {
        switch (this.f31216a) {
            case 0:
                m8.s(this.f31217b);
                return;
            default:
                m8.u(this.f31217b);
                return;
        }
    }
}
