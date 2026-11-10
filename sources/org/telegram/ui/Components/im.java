package org.telegram.ui.Components;
public final class im extends org.telegram.ui.qq0 {
    public boolean f34703a;
    public final int f34704b;
    public final an f34705c;

    public im(an anVar, int i7) {
        this.f34705c = anVar;
        this.f34704b = i7;
    }

    @Override
    public final void D() {
        if (this.f34703a) {
            this.f34705c.g0(this.f34704b);
        }
    }

    @Override
    public final void J() {
        this.f34705c.j0(this.f34704b, null);
    }

    @Override
    public final void W() {
        this.f34703a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
