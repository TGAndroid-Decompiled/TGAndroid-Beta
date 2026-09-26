package org.telegram.ui.Components;
public final class an extends org.telegram.ui.lu0 {
    public boolean f22734a;
    public final int f22735b;
    public final vn f22736c;

    public an(vn vnVar, int i10) {
        this.f22736c = vnVar;
        this.f22735b = i10;
    }

    @Override
    public final void D() {
        if (this.f22734a) {
            this.f22736c.b0(this.f22735b);
        }
    }

    @Override
    public final void I() {
        this.f22736c.e0(this.f22735b, null);
    }

    @Override
    public final void V() {
        this.f22734a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
