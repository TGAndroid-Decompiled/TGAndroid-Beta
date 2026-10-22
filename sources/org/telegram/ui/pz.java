package org.telegram.ui;
public final class pz implements Runnable {
    public final int f40322a;
    public final n00 f40323b;

    public pz(n00 n00Var, int i10) {
        this.f40322a = i10;
        this.f40323b = n00Var;
    }

    @Override
    public final void run() {
        switch (this.f40322a) {
            case 0:
                n00.V(this.f40323b);
                return;
            default:
                n00.W(this.f40323b);
                return;
        }
    }
}
