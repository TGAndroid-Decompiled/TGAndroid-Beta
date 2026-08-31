package org.telegram.ui;
public final class oc1 implements vc1 {
    public boolean f39723a;
    public final xn f39724b;

    public oc1(xn xnVar, boolean z4) {
        this.f39724b = xnVar;
        this.f39723a = z4;
    }

    @Override
    public final boolean T0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f39723a;
    }

    @Override
    public final void l1(boolean z4) {
        boolean z10 = !this.f39723a;
        this.f39723a = z10;
        vn vnVar = this.f39724b.f43136ba;
        vnVar.i(vnVar.f42262f, vnVar.h, z4, Boolean.valueOf(z10), false);
    }
}
