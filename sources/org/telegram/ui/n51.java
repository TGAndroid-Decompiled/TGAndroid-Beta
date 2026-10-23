package org.telegram.ui;
public final class n51 implements Runnable {
    public final int f39428a;
    public final o51 f39429b;

    public n51(o51 o51Var, int i10) {
        this.f39428a = i10;
        this.f39429b = o51Var;
    }

    @Override
    public final void run() {
        switch (this.f39428a) {
            case 0:
                o51.a(this.f39429b);
                return;
            default:
                this.f39429b.dismiss();
                return;
        }
    }
}
