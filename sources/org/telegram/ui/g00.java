package org.telegram.ui;
public final class g00 implements Runnable {
    public final int f39513a;
    public final h00 f39514b;

    public g00(h00 h00Var, int i10) {
        this.f39513a = i10;
        this.f39514b = h00Var;
    }

    @Override
    public final void run() {
        switch (this.f39513a) {
            case 0:
                this.f39514b.d();
                return;
            case 1:
                this.f39514b.a();
                return;
            default:
                h00 h00Var = this.f39514b;
                h00Var.b(h00Var.f39822y);
                return;
        }
    }
}
