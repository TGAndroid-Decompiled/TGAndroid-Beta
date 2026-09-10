package org.telegram.ui;
public final class d80 implements Runnable {
    public final int f31859a;
    public final k80 f31860b;

    public d80(k80 k80Var, int i10) {
        this.f31859a = i10;
        this.f31860b = k80Var;
    }

    @Override
    public final void run() {
        switch (this.f31859a) {
            case 0:
                k80 k80Var = this.f31860b;
                k80Var.h.postOnAnimation(new d80(k80Var, 1));
                return;
            default:
                this.f31860b.Y();
                return;
        }
    }
}
