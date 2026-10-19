package org.telegram.ui;
public final class pz implements Runnable {
    public final int f40313a;
    public final n00 f40314b;

    public pz(n00 n00Var, int i10) {
        this.f40313a = i10;
        this.f40314b = n00Var;
    }

    @Override
    public final void run() {
        switch (this.f40313a) {
            case 0:
                n00.V(this.f40314b);
                return;
            default:
                n00.W(this.f40314b);
                return;
        }
    }
}
