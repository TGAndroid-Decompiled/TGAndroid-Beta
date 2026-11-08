package org.telegram.ui;
public final class g11 implements Runnable {
    public final int f45755a;
    public final h11 f45756b;

    public g11(h11 h11Var, int i7) {
        this.f45755a = i7;
        this.f45756b = h11Var;
    }

    @Override
    public final void run() {
        switch (this.f45755a) {
            case 0:
                h11.a(this.f45756b);
                return;
            default:
                this.f45756b.dismiss();
                return;
        }
    }
}
