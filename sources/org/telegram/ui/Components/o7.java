package org.telegram.ui.Components;
public final class o7 implements Runnable {
    public final int f31218a;
    public final m8 f31219b;

    public o7(m8 m8Var, int i10) {
        this.f31218a = i10;
        this.f31219b = m8Var;
    }

    @Override
    public final void run() {
        switch (this.f31218a) {
            case 0:
                m8.s(this.f31219b);
                return;
            default:
                m8.u(this.f31219b);
                return;
        }
    }
}
