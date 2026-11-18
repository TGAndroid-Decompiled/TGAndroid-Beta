package org.telegram.ui.Components;
public final class ym extends org.telegram.ui.oq0 {
    public boolean f42520a;
    public final int f42521b;
    public final rn f42522c;

    public ym(rn rnVar, int i7) {
        this.f42522c = rnVar;
        this.f42521b = i7;
    }

    @Override
    public final void D() {
        if (this.f42520a) {
            this.f42522c.g0(this.f42521b);
        }
    }

    @Override
    public final void J() {
        this.f42522c.j0(this.f42521b, null);
    }

    @Override
    public final void W() {
        this.f42520a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
