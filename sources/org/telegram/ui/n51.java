package org.telegram.ui;
public final class n51 implements Runnable {
    public final int f39422a;
    public final o51 f39423b;

    public n51(o51 o51Var, int i10) {
        this.f39422a = i10;
        this.f39423b = o51Var;
    }

    @Override
    public final void run() {
        switch (this.f39422a) {
            case 0:
                o51.a(this.f39423b);
                return;
            default:
                this.f39423b.dismiss();
                return;
        }
    }
}
