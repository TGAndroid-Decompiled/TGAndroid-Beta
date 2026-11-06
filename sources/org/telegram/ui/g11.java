package org.telegram.ui;
public final class g11 implements Runnable {
    public final int f45778a;
    public final h11 f45779b;

    public g11(h11 h11Var, int i7) {
        this.f45778a = i7;
        this.f45779b = h11Var;
    }

    @Override
    public final void run() {
        switch (this.f45778a) {
            case 0:
                h11.a(this.f45779b);
                return;
            default:
                this.f45779b.dismiss();
                return;
        }
    }
}
