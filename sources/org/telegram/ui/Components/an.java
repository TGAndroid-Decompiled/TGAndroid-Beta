package org.telegram.ui.Components;
public final class an extends org.telegram.ui.lu0 {
    public boolean f22735a;
    public final int f22736b;
    public final vn f22737c;

    public an(vn vnVar, int i10) {
        this.f22737c = vnVar;
        this.f22736b = i10;
    }

    @Override
    public final void D() {
        if (this.f22735a) {
            this.f22737c.b0(this.f22736b);
        }
    }

    @Override
    public final void I() {
        this.f22737c.e0(this.f22736b, null);
    }

    @Override
    public final void V() {
        this.f22735a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
