package org.telegram.ui.Components;
public final class bn extends org.telegram.ui.lu0 {
    public boolean f23052a;
    public final int f23053b;
    public final wn f23054c;

    public bn(wn wnVar, int i10) {
        this.f23054c = wnVar;
        this.f23053b = i10;
    }

    @Override
    public final void D() {
        if (this.f23052a) {
            this.f23054c.b0(this.f23053b);
        }
    }

    @Override
    public final void I() {
        this.f23054c.e0(this.f23053b, null);
    }

    @Override
    public final void V() {
        this.f23052a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
