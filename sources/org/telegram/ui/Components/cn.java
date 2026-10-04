package org.telegram.ui.Components;
public final class cn extends org.telegram.ui.ou0 {
    public boolean f25422a;
    public final int f25423b;
    public final xn f25424c;

    public cn(xn xnVar, int i10) {
        this.f25424c = xnVar;
        this.f25423b = i10;
    }

    @Override
    public final void D() {
        if (this.f25422a) {
            this.f25424c.b0(this.f25423b);
        }
    }

    @Override
    public final void I() {
        this.f25424c.e0(this.f25423b, null);
    }

    @Override
    public final void V() {
        this.f25422a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
