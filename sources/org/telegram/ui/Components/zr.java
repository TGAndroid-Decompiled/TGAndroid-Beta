package org.telegram.ui.Components;
public final class zr implements Runnable {
    public final int f30586a;
    public final fs f30587b;

    public zr(fs fsVar, int i10) {
        this.f30586a = i10;
        this.f30587b = fsVar;
    }

    @Override
    public final void run() {
        switch (this.f30586a) {
            case 0:
                this.f30587b.W(false);
                return;
            default:
                fs.Q(this.f30587b);
                return;
        }
    }
}
