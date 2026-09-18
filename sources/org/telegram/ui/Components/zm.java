package org.telegram.ui.Components;
public final class zm extends org.telegram.ui.tu0 {
    public boolean f30842a;
    public final int f30843b;
    public final un f30844c;

    public zm(un unVar, int i10) {
        this.f30844c = unVar;
        this.f30843b = i10;
    }

    @Override
    public final void D() {
        if (this.f30842a) {
            this.f30844c.b0(this.f30843b);
        }
    }

    @Override
    public final void I() {
        this.f30844c.e0(this.f30843b, null);
    }

    @Override
    public final void V() {
        this.f30842a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
