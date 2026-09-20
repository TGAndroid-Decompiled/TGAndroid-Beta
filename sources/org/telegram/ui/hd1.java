package org.telegram.ui;
public final class hd1 implements od1 {
    public boolean f34173a;
    public final zn f34174b;

    public hd1(zn znVar, boolean z10) {
        this.f34174b = znVar;
        this.f34173a = z10;
    }

    @Override
    public final boolean V0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f34173a;
    }

    @Override
    public final void o1(boolean z10) {
        boolean z11 = !this.f34173a;
        this.f34173a = z11;
        xn xnVar = this.f34174b.f40303ea;
        xnVar.i(xnVar.f39630f, xnVar.h, z10, Boolean.valueOf(z11), false);
    }
}
