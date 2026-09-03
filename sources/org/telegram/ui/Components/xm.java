package org.telegram.ui.Components;
public final class xm extends org.telegram.ui.fu0 {
    public boolean f33134a;
    public final int f33135b;
    public final rn f33136c;

    public xm(rn rnVar, int i10) {
        this.f33136c = rnVar;
        this.f33135b = i10;
    }

    @Override
    public final void D() {
        if (this.f33134a) {
            this.f33136c.b0(this.f33135b);
        }
    }

    @Override
    public final void I() {
        this.f33136c.e0(this.f33135b, null);
    }

    @Override
    public final void V() {
        this.f33134a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
