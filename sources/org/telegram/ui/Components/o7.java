package org.telegram.ui.Components;
public final class o7 implements Runnable {
    public final int f27895a;
    public final m8 f27896b;

    public o7(m8 m8Var, int i10) {
        this.f27895a = i10;
        this.f27896b = m8Var;
    }

    @Override
    public final void run() {
        switch (this.f27895a) {
            case 0:
                m8.o(this.f27896b);
                return;
            default:
                m8.H(this.f27896b);
                return;
        }
    }
}
