package org.telegram.ui.Components;
public final class rm extends org.telegram.ui.xr0 {
    public boolean f30015a;
    public final int f30016b;
    public final jn f30017c;

    public rm(jn jnVar, int i10) {
        this.f30017c = jnVar;
        this.f30016b = i10;
    }

    @Override
    public final void D() {
        if (this.f30015a) {
            this.f30017c.e0(this.f30016b);
        }
    }

    @Override
    public final void J() {
        this.f30017c.h0(this.f30016b, null);
    }

    @Override
    public final void W() {
        this.f30015a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
