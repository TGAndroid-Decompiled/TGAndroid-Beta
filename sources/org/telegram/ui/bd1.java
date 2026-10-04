package org.telegram.ui;
public final class bd1 implements id1 {
    public boolean f35066a;
    public final yn f35067b;

    public bd1(yn ynVar, boolean z10) {
        this.f35067b = ynVar;
        this.f35066a = z10;
    }

    @Override
    public final boolean a() {
        return this.f35066a;
    }

    @Override
    public final boolean a1() {
        return true;
    }

    @Override
    public final void q1(boolean z10) {
        boolean z11 = !this.f35066a;
        this.f35066a = z11;
        wn wnVar = this.f35067b.f43307ca;
        wnVar.i(wnVar.f42546f, wnVar.h, z10, Boolean.valueOf(z11), false);
    }
}
