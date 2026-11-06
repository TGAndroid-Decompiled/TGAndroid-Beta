package org.telegram.ui;
public final class g11 implements Runnable {
    public final int f45779a;
    public final h11 f45780b;

    public g11(h11 h11Var, int i7) {
        this.f45779a = i7;
        this.f45780b = h11Var;
    }

    @Override
    public final void run() {
        switch (this.f45779a) {
            case 0:
                h11.a(this.f45780b);
                return;
            default:
                this.f45780b.dismiss();
                return;
        }
    }
}
