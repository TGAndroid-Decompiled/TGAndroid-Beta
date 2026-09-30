package org.telegram.ui.Components;
public final class bn extends org.telegram.ui.lu0 {
    public boolean f23021a;
    public final int f23022b;
    public final wn f23023c;

    public bn(wn wnVar, int i10) {
        this.f23023c = wnVar;
        this.f23022b = i10;
    }

    @Override
    public final void D() {
        if (this.f23021a) {
            this.f23023c.b0(this.f23022b);
        }
    }

    @Override
    public final void I() {
        this.f23023c.e0(this.f23022b, null);
    }

    @Override
    public final void V() {
        this.f23021a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
