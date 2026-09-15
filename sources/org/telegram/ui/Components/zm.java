package org.telegram.ui.Components;
public final class zm extends org.telegram.ui.tu0 {
    public boolean f30616a;
    public final int f30617b;
    public final un f30618c;

    public zm(un unVar, int i10) {
        this.f30618c = unVar;
        this.f30617b = i10;
    }

    @Override
    public final void D() {
        if (this.f30616a) {
            this.f30618c.b0(this.f30617b);
        }
    }

    @Override
    public final void I() {
        this.f30618c.e0(this.f30617b, null);
    }

    @Override
    public final void V() {
        this.f30616a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
