package org.telegram.ui;
public final class e00 implements Runnable {
    public final int f33573a;
    public final c10 f33574b;

    public e00(c10 c10Var, int i10) {
        this.f33573a = i10;
        this.f33574b = c10Var;
    }

    @Override
    public final void run() {
        switch (this.f33573a) {
            case 0:
                c10.V(this.f33574b);
                return;
            default:
                c10.W(this.f33574b);
                return;
        }
    }
}
