package org.telegram.ui;
public final class q51 implements Runnable {
    public final int f40717a;
    public final r51 f40718b;

    public q51(r51 r51Var, int i10) {
        this.f40717a = i10;
        this.f40718b = r51Var;
    }

    @Override
    public final void run() {
        switch (this.f40717a) {
            case 0:
                r51.a(this.f40718b);
                return;
            default:
                this.f40718b.dismiss();
                return;
        }
    }
}
