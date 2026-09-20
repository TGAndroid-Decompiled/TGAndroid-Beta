package org.telegram.ui.Components;
public final class zm extends org.telegram.ui.tu0 {
    public boolean f30861a;
    public final int f30862b;
    public final un f30863c;

    public zm(un unVar, int i10) {
        this.f30863c = unVar;
        this.f30862b = i10;
    }

    @Override
    public final void D() {
        if (this.f30861a) {
            this.f30863c.b0(this.f30862b);
        }
    }

    @Override
    public final void I() {
        this.f30863c.e0(this.f30862b, null);
    }

    @Override
    public final void V() {
        this.f30861a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
