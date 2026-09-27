package org.telegram.ui.Components;
public final class bn extends org.telegram.ui.ou0 {
    public boolean f23073a;
    public final int f23074b;
    public final wn f23075c;

    public bn(wn wnVar, int i10) {
        this.f23075c = wnVar;
        this.f23074b = i10;
    }

    @Override
    public final void D() {
        if (this.f23073a) {
            this.f23075c.b0(this.f23074b);
        }
    }

    @Override
    public final void I() {
        this.f23075c.e0(this.f23074b, null);
    }

    @Override
    public final void V() {
        this.f23073a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
