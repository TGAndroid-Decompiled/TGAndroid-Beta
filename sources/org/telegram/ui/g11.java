package org.telegram.ui;
public final class g11 implements Runnable {
    public final int f45752a;
    public final h11 f45753b;

    public g11(h11 h11Var, int i7) {
        this.f45752a = i7;
        this.f45753b = h11Var;
    }

    @Override
    public final void run() {
        switch (this.f45752a) {
            case 0:
                h11.a(this.f45753b);
                return;
            default:
                this.f45753b.dismiss();
                return;
        }
    }
}
