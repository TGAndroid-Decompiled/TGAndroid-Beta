package org.telegram.ui;
public final class p51 implements Runnable {
    public final int f39991a;
    public final q51 f39992b;

    public p51(q51 q51Var, int i10) {
        this.f39991a = i10;
        this.f39992b = q51Var;
    }

    @Override
    public final void run() {
        switch (this.f39991a) {
            case 0:
                q51.a(this.f39992b);
                return;
            default:
                this.f39992b.dismiss();
                return;
        }
    }
}
