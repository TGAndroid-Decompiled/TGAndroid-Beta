package org.telegram.ui.Components;
public final class zm extends org.telegram.ui.vu0 {
    public boolean f30541a;
    public final int f30542b;
    public final un f30543c;

    public zm(un unVar, int i10) {
        this.f30543c = unVar;
        this.f30542b = i10;
    }

    @Override
    public final void D() {
        if (this.f30541a) {
            this.f30543c.b0(this.f30542b);
        }
    }

    @Override
    public final void I() {
        this.f30543c.e0(this.f30542b, null);
    }

    @Override
    public final void V() {
        this.f30541a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
