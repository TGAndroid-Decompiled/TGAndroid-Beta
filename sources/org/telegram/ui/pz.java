package org.telegram.ui;
public final class pz implements Runnable {
    public final int f42679a;
    public final o00 f42680b;

    public pz(o00 o00Var, int i10) {
        this.f42679a = i10;
        this.f42680b = o00Var;
    }

    @Override
    public final void run() {
        switch (this.f42679a) {
            case 0:
                o00.W(this.f42680b);
                return;
            default:
                o00.X(this.f42680b);
                return;
        }
    }
}
