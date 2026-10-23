package org.telegram.ui;
public final class pz implements Runnable {
    public final int f40323a;
    public final n00 f40324b;

    public pz(n00 n00Var, int i10) {
        this.f40323a = i10;
        this.f40324b = n00Var;
    }

    @Override
    public final void run() {
        switch (this.f40323a) {
            case 0:
                n00.V(this.f40324b);
                return;
            default:
                n00.W(this.f40324b);
                return;
        }
    }
}
