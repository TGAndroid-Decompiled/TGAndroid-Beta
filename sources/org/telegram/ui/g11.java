package org.telegram.ui;
public final class g11 implements Runnable {
    public final int f48022a;
    public final h11 f48023b;

    public g11(h11 h11Var, int i7) {
        this.f48022a = i7;
        this.f48023b = h11Var;
    }

    @Override
    public final void run() {
        switch (this.f48022a) {
            case 0:
                h11.a(this.f48023b);
                return;
            default:
                this.f48023b.dismiss();
                return;
        }
    }
}
