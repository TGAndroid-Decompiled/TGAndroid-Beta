package org.telegram.ui.Components;
public final class kn extends org.telegram.ui.gu0 {
    public boolean f29943a;
    public final int f29944b;
    public final go f29945c;

    public kn(go goVar, int i10) {
        this.f29945c = goVar;
        this.f29944b = i10;
    }

    @Override
    public final void D() {
        if (this.f29943a) {
            this.f29945c.e0(this.f29944b);
        }
    }

    @Override
    public final void J() {
        this.f29945c.h0(this.f29944b, null);
    }

    @Override
    public final void W() {
        this.f29943a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
