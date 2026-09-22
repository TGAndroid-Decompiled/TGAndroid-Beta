package org.telegram.ui.Components;
public final class zr implements Runnable {
    public final int f30640a;
    public final fs f30641b;

    public zr(fs fsVar, int i10) {
        this.f30640a = i10;
        this.f30641b = fsVar;
    }

    @Override
    public final void run() {
        switch (this.f30640a) {
            case 0:
                this.f30641b.W(false);
                return;
            default:
                fs.Q(this.f30641b);
                return;
        }
    }
}
