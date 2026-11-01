package org.telegram.ui;
public final class lz implements Runnable {
    public final int f39403a;
    public final h00 f39404b;

    public lz(h00 h00Var, int i10) {
        this.f39403a = i10;
        this.f39404b = h00Var;
    }

    @Override
    public final void run() {
        switch (this.f39403a) {
            case 0:
                h00.a0(this.f39404b);
                return;
            default:
                h00.b0(this.f39404b);
                return;
        }
    }
}
