package org.telegram.ui.Components;
public final class jn extends org.telegram.ui.bu0 {
    public boolean f27565a;
    public final int f27566b;
    public final fo f27567c;

    public jn(fo foVar, int i10) {
        this.f27567c = foVar;
        this.f27566b = i10;
    }

    @Override
    public final void D() {
        if (this.f27565a) {
            this.f27567c.e0(this.f27566b);
        }
    }

    @Override
    public final void J() {
        this.f27567c.h0(this.f27566b, null);
    }

    @Override
    public final void W() {
        this.f27565a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
