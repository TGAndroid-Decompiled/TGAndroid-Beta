package org.telegram.ui.Components;
public final class zr implements Runnable {
    public final int f30945a;
    public final fs f30946b;

    public zr(fs fsVar, int i10) {
        this.f30945a = i10;
        this.f30946b = fsVar;
    }

    @Override
    public final void run() {
        switch (this.f30945a) {
            case 0:
                this.f30946b.W(false);
                return;
            default:
                fs.Q(this.f30946b);
                return;
        }
    }
}
