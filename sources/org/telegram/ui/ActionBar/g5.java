package org.telegram.ui.ActionBar;
public final class g5 implements Runnable {
    public final int f27498a;
    public final j5 f27499b;

    public g5(j5 j5Var, int i7) {
        this.f27498a = i7;
        this.f27499b = j5Var;
    }

    @Override
    public final void run() {
        switch (this.f27498a) {
            case 0:
                j5 j5Var = this.f27499b;
                if (!j5Var.D && j5Var.N) {
                    j5Var.c();
                    return;
                }
                return;
            default:
                this.f27499b.a(true);
                return;
        }
    }
}
