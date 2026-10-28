package org.telegram.ui.Components;
public final class kn extends org.telegram.ui.iu0 {
    public boolean f29987a;
    public final int f29988b;
    public final go f29989c;

    public kn(go goVar, int i10) {
        this.f29989c = goVar;
        this.f29988b = i10;
    }

    @Override
    public final void D() {
        if (this.f29987a) {
            this.f29989c.e0(this.f29988b);
        }
    }

    @Override
    public final void J() {
        this.f29989c.h0(this.f29988b, null);
    }

    @Override
    public final void W() {
        this.f29987a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
