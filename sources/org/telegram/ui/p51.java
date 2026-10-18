package org.telegram.ui;
public final class p51 implements Runnable {
    public final int f39952a;
    public final q51 f39953b;

    public p51(q51 q51Var, int i10) {
        this.f39952a = i10;
        this.f39953b = q51Var;
    }

    @Override
    public final void run() {
        switch (this.f39952a) {
            case 0:
                q51.a(this.f39953b);
                return;
            default:
                this.f39953b.dismiss();
                return;
        }
    }
}
