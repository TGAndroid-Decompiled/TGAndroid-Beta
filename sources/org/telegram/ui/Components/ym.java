package org.telegram.ui.Components;
public final class ym extends org.telegram.ui.su0 {
    public boolean f32972a;
    public final int f32973b;
    public final tn f32974c;

    public ym(tn tnVar, int i10) {
        this.f32974c = tnVar;
        this.f32973b = i10;
    }

    @Override
    public final void D() {
        if (this.f32972a) {
            this.f32974c.b0(this.f32973b);
        }
    }

    @Override
    public final void I() {
        this.f32974c.e0(this.f32973b, null);
    }

    @Override
    public final void V() {
        this.f32972a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
