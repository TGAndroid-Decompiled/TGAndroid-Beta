package org.telegram.ui;
public final class n51 implements Runnable {
    public final int f39418a;
    public final o51 f39419b;

    public n51(o51 o51Var, int i10) {
        this.f39418a = i10;
        this.f39419b = o51Var;
    }

    @Override
    public final void run() {
        switch (this.f39418a) {
            case 0:
                o51.a(this.f39419b);
                return;
            default:
                this.f39419b.dismiss();
                return;
        }
    }
}
