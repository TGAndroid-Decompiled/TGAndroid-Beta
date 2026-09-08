package org.telegram.ui.Components;
public final class ym extends org.telegram.ui.su0 {
    public boolean f32971a;
    public final int f32972b;
    public final tn f32973c;

    public ym(tn tnVar, int i10) {
        this.f32973c = tnVar;
        this.f32972b = i10;
    }

    @Override
    public final void D() {
        if (this.f32971a) {
            this.f32973c.b0(this.f32972b);
        }
    }

    @Override
    public final void I() {
        this.f32973c.e0(this.f32972b, null);
    }

    @Override
    public final void V() {
        this.f32971a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
