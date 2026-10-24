package org.telegram.ui.Components;
public final class k7 implements Runnable {
    public final int f27907a;
    public final i8 f27908b;

    public k7(i8 i8Var, int i10) {
        this.f27907a = i10;
        this.f27908b = i8Var;
    }

    @Override
    public final void run() {
        switch (this.f27907a) {
            case 0:
                i8.t(this.f27908b);
                return;
            default:
                i8.v(this.f27908b);
                return;
        }
    }
}
