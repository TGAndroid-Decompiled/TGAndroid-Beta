package org.telegram.ui.Components;
public final class pn extends org.telegram.ui.uu0 {
    public boolean f29792a;
    public final int f29793b;
    public final lo f29794c;

    public pn(lo loVar, int i10) {
        this.f29794c = loVar;
        this.f29793b = i10;
    }

    @Override
    public final void D() {
        if (this.f29792a) {
            this.f29794c.e0(this.f29793b);
        }
    }

    @Override
    public final void I() {
        this.f29794c.h0(this.f29793b, null);
    }

    @Override
    public final void V() {
        this.f29792a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
