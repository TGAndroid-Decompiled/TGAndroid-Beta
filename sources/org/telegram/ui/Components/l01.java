package org.telegram.ui.Components;
public final class l01 implements Runnable {
    public final int f30184a;
    public final n01 f30185b;
    public final m01 f30186c;

    public l01(n01 n01Var, m01 m01Var, int i10) {
        this.f30184a = i10;
        this.f30185b = n01Var;
        this.f30186c = m01Var;
    }

    @Override
    public final void run() {
        switch (this.f30184a) {
            case 0:
                this.f30185b.b(this.f30186c);
                return;
            case 1:
                this.f30185b.b(this.f30186c);
                return;
            default:
                this.f30185b.b(this.f30186c);
                return;
        }
    }
}
