package org.telegram.ui;

import android.content.Context;
public final class ah0 extends org.telegram.ui.Components.zf {
    public final org.telegram.ui.Components.zf f35651n0;
    public final boolean f35652o0;
    public final kh0 f35653p0;

    public ah0(kh0 kh0Var, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.ui.Components.zf zfVar, boolean z10) {
        super(i10, context, p6Var, false);
        this.f35653p0 = kh0Var;
        this.f35651n0 = zfVar;
        this.f35652o0 = z10;
    }

    @Override
    public final boolean d() {
        return this.f35651n0.d();
    }

    @Override
    public final boolean e() {
        return this.f35651n0.e();
    }

    @Override
    public final boolean f() {
        if (this.f35652o0 && this.f35653p0.f38847p0 && this.f33046r <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f35651n0.getFillColor();
    }

    @Override
    public final boolean j() {
        return this.f35651n0.j();
    }
}
