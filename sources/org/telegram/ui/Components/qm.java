package org.telegram.ui.Components;
public final class qm implements Runnable {
    public final int f28153a;
    public final qn f28154b;
    public final int f28155c;

    public qm(qn qnVar, int i10, int i11) {
        this.f28153a = i11;
        this.f28154b = qnVar;
        this.f28155c = i10;
    }

    @Override
    public final void run() {
        switch (this.f28153a) {
            case 0:
                this.f28154b.e0(this.f28155c, null);
                return;
            case 1:
                this.f28154b.b0(this.f28155c);
                return;
            default:
                this.f28154b.e0(this.f28155c, null);
                return;
        }
    }
}
