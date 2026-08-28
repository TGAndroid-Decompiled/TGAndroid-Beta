package org.telegram.ui;
public final class pz implements Runnable {
    public final int f41628a;
    public final n00 f41629b;

    public pz(n00 n00Var, int i9) {
        this.f41628a = i9;
        this.f41629b = n00Var;
    }

    @Override
    public final void run() {
        switch (this.f41628a) {
            case 0:
                n00.U(this.f41629b);
                return;
            default:
                n00.V(this.f41629b);
                return;
        }
    }
}
