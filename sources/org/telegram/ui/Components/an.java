package org.telegram.ui.Components;
public final class an extends org.telegram.ui.mu0 {
    public boolean f22473a;
    public final int f22474b;
    public final vn f22475c;

    public an(vn vnVar, int i10) {
        this.f22475c = vnVar;
        this.f22474b = i10;
    }

    @Override
    public final void D() {
        if (this.f22473a) {
            this.f22475c.b0(this.f22474b);
        }
    }

    @Override
    public final void I() {
        this.f22475c.e0(this.f22474b, null);
    }

    @Override
    public final void V() {
        this.f22473a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
