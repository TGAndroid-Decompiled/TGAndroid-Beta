package org.telegram.ui.Components;
public final class ym extends org.telegram.ui.su0 {
    public boolean f32944a;
    public final int f32945b;
    public final tn f32946c;

    public ym(tn tnVar, int i10) {
        this.f32946c = tnVar;
        this.f32945b = i10;
    }

    @Override
    public final void D() {
        if (this.f32944a) {
            this.f32946c.b0(this.f32945b);
        }
    }

    @Override
    public final void I() {
        this.f32946c.e0(this.f32945b, null);
    }

    @Override
    public final void V() {
        this.f32944a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
