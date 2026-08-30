package org.telegram.ui.Components;
public final class w01 implements Runnable {
    public final int f30133a;
    public final y01 f30134b;
    public final x01 f30135c;

    public w01(y01 y01Var, x01 x01Var, int i10) {
        this.f30133a = i10;
        this.f30134b = y01Var;
        this.f30135c = x01Var;
    }

    @Override
    public final void run() {
        switch (this.f30133a) {
            case 0:
                this.f30134b.b(this.f30135c);
                return;
            case 1:
                this.f30134b.b(this.f30135c);
                return;
            default:
                this.f30134b.b(this.f30135c);
                return;
        }
    }
}
