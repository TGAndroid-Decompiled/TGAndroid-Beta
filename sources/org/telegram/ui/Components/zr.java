package org.telegram.ui.Components;
public final class zr implements Runnable {
    public final int f30911a;
    public final fs f30912b;

    public zr(fs fsVar, int i10) {
        this.f30911a = i10;
        this.f30912b = fsVar;
    }

    @Override
    public final void run() {
        switch (this.f30911a) {
            case 0:
                this.f30912b.W(false);
                return;
            default:
                fs.Q(this.f30912b);
                return;
        }
    }
}
