package org.telegram.ui;
public final class p51 implements Runnable {
    public final int f39972a;
    public final q51 f39973b;

    public p51(q51 q51Var, int i10) {
        this.f39972a = i10;
        this.f39973b = q51Var;
    }

    @Override
    public final void run() {
        switch (this.f39972a) {
            case 0:
                q51.a(this.f39973b);
                return;
            default:
                this.f39973b.dismiss();
                return;
        }
    }
}
