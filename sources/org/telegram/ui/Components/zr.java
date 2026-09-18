package org.telegram.ui.Components;
public final class zr implements Runnable {
    public final int f30589a;
    public final fs f30590b;

    public zr(fs fsVar, int i10) {
        this.f30589a = i10;
        this.f30590b = fsVar;
    }

    @Override
    public final void run() {
        switch (this.f30589a) {
            case 0:
                this.f30590b.W(false);
                return;
            default:
                fs.Q(this.f30590b);
                return;
        }
    }
}
