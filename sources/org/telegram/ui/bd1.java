package org.telegram.ui;
public final class bd1 implements id1 {
    public boolean f35060a;
    public final yn f35061b;

    public bd1(yn ynVar, boolean z10) {
        this.f35061b = ynVar;
        this.f35060a = z10;
    }

    @Override
    public final boolean a() {
        return this.f35060a;
    }

    @Override
    public final boolean a1() {
        return true;
    }

    @Override
    public final void q1(boolean z10) {
        boolean z11 = !this.f35060a;
        this.f35060a = z11;
        wn wnVar = this.f35061b.f43299ca;
        wnVar.i(wnVar.f42538f, wnVar.h, z10, Boolean.valueOf(z11), false);
    }
}
