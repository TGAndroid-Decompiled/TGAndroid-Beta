package org.telegram.ui.Components;
public final class zr implements Runnable {
    public final int f30861a;
    public final fs f30862b;

    public zr(fs fsVar, int i10) {
        this.f30861a = i10;
        this.f30862b = fsVar;
    }

    @Override
    public final void run() {
        switch (this.f30861a) {
            case 0:
                this.f30862b.W(false);
                return;
            default:
                fs.Q(this.f30862b);
                return;
        }
    }
}
