package org.telegram.ui.Components;
public final class pn extends org.telegram.ui.tu0 {
    public boolean f29895a;
    public final int f29896b;
    public final lo f29897c;

    public pn(lo loVar, int i10) {
        this.f29897c = loVar;
        this.f29896b = i10;
    }

    @Override
    public final void D() {
        if (this.f29895a) {
            this.f29897c.e0(this.f29896b);
        }
    }

    @Override
    public final void I() {
        this.f29897c.h0(this.f29896b, null);
    }

    @Override
    public final void V() {
        this.f29895a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
