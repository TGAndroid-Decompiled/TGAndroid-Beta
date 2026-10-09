package org.telegram.ui.Components;
public final class pn extends org.telegram.ui.uu0 {
    public boolean f29891a;
    public final int f29892b;
    public final lo f29893c;

    public pn(lo loVar, int i10) {
        this.f29893c = loVar;
        this.f29892b = i10;
    }

    @Override
    public final void D() {
        if (this.f29891a) {
            this.f29893c.e0(this.f29892b);
        }
    }

    @Override
    public final void I() {
        this.f29893c.h0(this.f29892b, null);
    }

    @Override
    public final void V() {
        this.f29891a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
