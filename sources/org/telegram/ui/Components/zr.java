package org.telegram.ui.Components;
public final class zr implements Runnable {
    public final int f30643a;
    public final fs f30644b;

    public zr(fs fsVar, int i10) {
        this.f30643a = i10;
        this.f30644b = fsVar;
    }

    @Override
    public final void run() {
        switch (this.f30643a) {
            case 0:
                this.f30644b.W(false);
                return;
            default:
                fs.Q(this.f30644b);
                return;
        }
    }
}
