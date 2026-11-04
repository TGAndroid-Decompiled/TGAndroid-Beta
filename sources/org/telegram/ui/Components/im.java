package org.telegram.ui.Components;
public final class im extends org.telegram.ui.eq0 {
    public boolean f34742a;
    public final int f34743b;
    public final an f34744c;

    public im(an anVar, int i3) {
        this.f34744c = anVar;
        this.f34743b = i3;
    }

    @Override
    public final void D() {
        if (this.f34742a) {
            this.f34744c.g0(this.f34743b);
        }
    }

    @Override
    public final void J() {
        this.f34744c.j0(this.f34743b, null);
    }

    @Override
    public final void W() {
        this.f34742a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
