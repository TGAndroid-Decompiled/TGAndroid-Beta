package org.telegram.ui.Components;
public final class kn extends org.telegram.ui.gu0 {
    public boolean f29945a;
    public final int f29946b;
    public final go f29947c;

    public kn(go goVar, int i10) {
        this.f29947c = goVar;
        this.f29946b = i10;
    }

    @Override
    public final void D() {
        if (this.f29945a) {
            this.f29947c.e0(this.f29946b);
        }
    }

    @Override
    public final void J() {
        this.f29947c.h0(this.f29946b, null);
    }

    @Override
    public final void W() {
        this.f29945a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
