package org.telegram.ui.Components;

public final class nm extends org.telegram.ui.st0 {

    public boolean f30997a;

    public final int f30998b;

    public final in f30999c;

    public nm(in inVar, int i10) {
        this.f30999c = inVar;
        this.f30998b = i10;
    }

    @Override
    public final void D() {
        if (this.f30997a) {
            this.f30999c.b0(this.f30998b);
        }
    }

    @Override
    public final void I() {
        this.f30999c.e0(this.f30998b, null);
    }

    @Override
    public final void V() {
        this.f30997a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
