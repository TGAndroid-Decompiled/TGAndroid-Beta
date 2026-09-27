package org.telegram.ui;
public final class f00 implements Runnable {
    public final int f33375a;
    public final e10 f33376b;

    public f00(e10 e10Var, int i10) {
        this.f33375a = i10;
        this.f33376b = e10Var;
    }

    @Override
    public final void run() {
        switch (this.f33375a) {
            case 0:
                e10.V(this.f33376b);
                return;
            default:
                e10.W(this.f33376b);
                return;
        }
    }
}
