package org.telegram.ui.Components;
public final class bn extends org.telegram.ui.lu0 {
    public boolean f23051a;
    public final int f23052b;
    public final wn f23053c;

    public bn(wn wnVar, int i10) {
        this.f23053c = wnVar;
        this.f23052b = i10;
    }

    @Override
    public final void D() {
        if (this.f23051a) {
            this.f23053c.b0(this.f23052b);
        }
    }

    @Override
    public final void I() {
        this.f23053c.e0(this.f23052b, null);
    }

    @Override
    public final void V() {
        this.f23051a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
