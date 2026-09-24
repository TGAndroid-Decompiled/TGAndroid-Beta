package org.telegram.ui.Components;
public final class an extends org.telegram.ui.lu0 {
    public boolean f22716a;
    public final int f22717b;
    public final vn f22718c;

    public an(vn vnVar, int i10) {
        this.f22718c = vnVar;
        this.f22717b = i10;
    }

    @Override
    public final void D() {
        if (this.f22716a) {
            this.f22718c.b0(this.f22717b);
        }
    }

    @Override
    public final void I() {
        this.f22718c.e0(this.f22717b, null);
    }

    @Override
    public final void V() {
        this.f22716a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
