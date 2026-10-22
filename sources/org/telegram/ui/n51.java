package org.telegram.ui;
public final class n51 implements Runnable {
    public final int f39427a;
    public final o51 f39428b;

    public n51(o51 o51Var, int i10) {
        this.f39427a = i10;
        this.f39428b = o51Var;
    }

    @Override
    public final void run() {
        switch (this.f39427a) {
            case 0:
                o51.a(this.f39428b);
                return;
            default:
                this.f39428b.dismiss();
                return;
        }
    }
}
