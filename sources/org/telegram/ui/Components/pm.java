package org.telegram.ui.Components;
public final class pm implements Runnable {
    public final int f27925a;
    public final pn f27926b;
    public final int f27927c;

    public pm(pn pnVar, int i10, int i11) {
        this.f27925a = i11;
        this.f27926b = pnVar;
        this.f27927c = i10;
    }

    @Override
    public final void run() {
        switch (this.f27925a) {
            case 0:
                this.f27926b.e0(this.f27927c, null);
                return;
            case 1:
                this.f27926b.b0(this.f27927c);
                return;
            default:
                this.f27926b.e0(this.f27927c, null);
                return;
        }
    }
}
