package org.telegram.ui.Components;
public final class u70 implements Runnable {
    public final int f38641a;
    public final n2.n0 f38642b;
    public final y70 f38643c;

    public u70(n2.n0 n0Var, y70 y70Var, int i7) {
        this.f38641a = i7;
        this.f38642b = n0Var;
        this.f38643c = y70Var;
    }

    @Override
    public final void run() {
        switch (this.f38641a) {
            case 0:
                this.f38642b.m(this.f38643c, false);
                return;
            default:
                this.f38642b.m(this.f38643c, false);
                return;
        }
    }
}
