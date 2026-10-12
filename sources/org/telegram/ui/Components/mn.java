package org.telegram.ui.Components;
public final class mn extends org.telegram.ui.av0 {
    public boolean f27464a;
    public final int f27465b;
    public final io f27466c;

    public mn(io ioVar, int i10) {
        this.f27466c = ioVar;
        this.f27465b = i10;
    }

    @Override
    public final void D() {
        if (this.f27464a) {
            this.f27466c.e0(this.f27465b);
        }
    }

    @Override
    public final void I() {
        this.f27466c.h0(this.f27465b, null);
    }

    @Override
    public final void V() {
        this.f27464a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
