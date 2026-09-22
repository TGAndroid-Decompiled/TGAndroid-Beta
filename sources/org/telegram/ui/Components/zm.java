package org.telegram.ui.Components;
public final class zm extends org.telegram.ui.tu0 {
    public boolean f30613a;
    public final int f30614b;
    public final un f30615c;

    public zm(un unVar, int i10) {
        this.f30615c = unVar;
        this.f30614b = i10;
    }

    @Override
    public final void D() {
        if (this.f30613a) {
            this.f30615c.b0(this.f30614b);
        }
    }

    @Override
    public final void I() {
        this.f30615c.e0(this.f30614b, null);
    }

    @Override
    public final void V() {
        this.f30613a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
