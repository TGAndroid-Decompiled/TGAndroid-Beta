package org.telegram.ui.Components;
public final class pn extends org.telegram.ui.tu0 {
    public boolean f29772a;
    public final int f29773b;
    public final lo f29774c;

    public pn(lo loVar, int i10) {
        this.f29774c = loVar;
        this.f29773b = i10;
    }

    @Override
    public final void D() {
        if (this.f29772a) {
            this.f29774c.e0(this.f29773b);
        }
    }

    @Override
    public final void I() {
        this.f29774c.h0(this.f29773b, null);
    }

    @Override
    public final void V() {
        this.f29772a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
