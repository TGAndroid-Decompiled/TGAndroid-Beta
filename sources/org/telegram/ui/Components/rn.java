package org.telegram.ui.Components;
public final class rn extends org.telegram.ui.wu0 {
    public boolean f30193a;
    public final int f30194b;
    public final no f30195c;

    public rn(no noVar, int i10) {
        this.f30195c = noVar;
        this.f30194b = i10;
    }

    @Override
    public final void D() {
        if (this.f30193a) {
            this.f30195c.e0(this.f30194b);
        }
    }

    @Override
    public final void I() {
        this.f30195c.h0(this.f30194b, null);
    }

    @Override
    public final void V() {
        this.f30193a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
