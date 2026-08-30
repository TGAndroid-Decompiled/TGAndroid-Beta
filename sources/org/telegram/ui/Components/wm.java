package org.telegram.ui.Components;
public final class wm extends org.telegram.ui.yt0 {
    public boolean f30387a;
    public final int f30388b;
    public final qn f30389c;

    public wm(qn qnVar, int i10) {
        this.f30389c = qnVar;
        this.f30388b = i10;
    }

    @Override
    public final void D() {
        if (this.f30387a) {
            this.f30389c.b0(this.f30388b);
        }
    }

    @Override
    public final void I() {
        this.f30389c.e0(this.f30388b, null);
    }

    @Override
    public final void V() {
        this.f30387a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
