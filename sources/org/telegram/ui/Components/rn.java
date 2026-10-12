package org.telegram.ui.Components;
public final class rn extends org.telegram.ui.wu0 {
    public boolean f30189a;
    public final int f30190b;
    public final no f30191c;

    public rn(no noVar, int i10) {
        this.f30191c = noVar;
        this.f30190b = i10;
    }

    @Override
    public final void D() {
        if (this.f30189a) {
            this.f30191c.e0(this.f30190b);
        }
    }

    @Override
    public final void I() {
        this.f30191c.h0(this.f30190b, null);
    }

    @Override
    public final void V() {
        this.f30189a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
