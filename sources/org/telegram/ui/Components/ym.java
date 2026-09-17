package org.telegram.ui.Components;
public final class ym extends org.telegram.ui.su0 {
    public boolean f32945a;
    public final int f32946b;
    public final tn f32947c;

    public ym(tn tnVar, int i10) {
        this.f32947c = tnVar;
        this.f32946b = i10;
    }

    @Override
    public final void D() {
        if (this.f32945a) {
            this.f32947c.b0(this.f32946b);
        }
    }

    @Override
    public final void I() {
        this.f32947c.e0(this.f32946b, null);
    }

    @Override
    public final void V() {
        this.f32945a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
