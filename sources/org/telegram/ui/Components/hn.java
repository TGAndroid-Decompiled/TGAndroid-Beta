package org.telegram.ui.Components;
public final class hn extends org.telegram.ui.bu0 {
    public boolean f27083a;
    public final int f27084b;
    public final co f27085c;

    public hn(co coVar, int i10) {
        this.f27085c = coVar;
        this.f27084b = i10;
    }

    @Override
    public final void D() {
        if (this.f27083a) {
            this.f27085c.e0(this.f27084b);
        }
    }

    @Override
    public final void J() {
        this.f27085c.h0(this.f27084b, null);
    }

    @Override
    public final void W() {
        this.f27083a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
