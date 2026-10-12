package org.telegram.ui.Components;
public final class ea0 implements Runnable {
    public final int f25651a;
    public final fa0 f25652b;
    public final ja0 f25653c;

    public ea0(fa0 fa0Var, ja0 ja0Var, int i10) {
        this.f25651a = i10;
        this.f25652b = fa0Var;
        this.f25653c = ja0Var;
    }

    @Override
    public final void run() {
        switch (this.f25651a) {
            case 0:
                this.f25652b.k(this.f25653c, false);
                return;
            default:
                this.f25652b.k(this.f25653c, false);
                return;
        }
    }
}
