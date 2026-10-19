package org.telegram.ui;
public final class pz implements Runnable {
    public final int f40318a;
    public final n00 f40319b;

    public pz(n00 n00Var, int i10) {
        this.f40318a = i10;
        this.f40319b = n00Var;
    }

    @Override
    public final void run() {
        switch (this.f40318a) {
            case 0:
                n00.V(this.f40319b);
                return;
            default:
                n00.W(this.f40319b);
                return;
        }
    }
}
