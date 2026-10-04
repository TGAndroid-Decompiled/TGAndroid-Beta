package org.telegram.ui.Components;
public final class cn extends org.telegram.ui.ou0 {
    public boolean f25417a;
    public final int f25418b;
    public final xn f25419c;

    public cn(xn xnVar, int i10) {
        this.f25419c = xnVar;
        this.f25418b = i10;
    }

    @Override
    public final void D() {
        if (this.f25417a) {
            this.f25419c.b0(this.f25418b);
        }
    }

    @Override
    public final void I() {
        this.f25419c.e0(this.f25418b, null);
    }

    @Override
    public final void V() {
        this.f25417a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
