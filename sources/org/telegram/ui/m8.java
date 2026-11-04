package org.telegram.ui;
public final class m8 implements Runnable {
    public final int f47560a;
    public final h9 f47561b;

    public m8(h9 h9Var, int i3) {
        this.f47560a = i3;
        this.f47561b = h9Var;
    }

    @Override
    public final void run() {
        switch (this.f47560a) {
            case 0:
                this.f47561b.m0(false);
                return;
            default:
                this.f47561b.h0();
                return;
        }
    }
}
