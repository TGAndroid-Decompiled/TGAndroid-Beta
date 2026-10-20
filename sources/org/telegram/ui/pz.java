package org.telegram.ui;
public final class pz implements Runnable {
    public final int f40319a;
    public final n00 f40320b;

    public pz(n00 n00Var, int i10) {
        this.f40319a = i10;
        this.f40320b = n00Var;
    }

    @Override
    public final void run() {
        switch (this.f40319a) {
            case 0:
                n00.V(this.f40320b);
                return;
            default:
                n00.W(this.f40320b);
                return;
        }
    }
}
