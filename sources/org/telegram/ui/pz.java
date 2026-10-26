package org.telegram.ui;
public final class pz implements Runnable {
    public final int f42682a;
    public final o00 f42683b;

    public pz(o00 o00Var, int i10) {
        this.f42682a = i10;
        this.f42683b = o00Var;
    }

    @Override
    public final void run() {
        switch (this.f42682a) {
            case 0:
                o00.W(this.f42683b);
                return;
            default:
                o00.X(this.f42683b);
                return;
        }
    }
}
