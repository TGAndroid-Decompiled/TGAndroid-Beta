package org.telegram.ui;

import android.content.Context;
public final class ci0 extends org.telegram.ui.Components.tg {
    public final org.telegram.ui.Components.tg f36355n0;
    public final boolean f36356o0;
    public final pi0 f36357p0;

    public ci0(pi0 pi0Var, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.Components.tg tgVar, boolean z10) {
        super(i10, context, g6Var, false);
        this.f36357p0 = pi0Var;
        this.f36355n0 = tgVar;
        this.f36356o0 = z10;
    }

    @Override
    public final boolean d() {
        return this.f36355n0.d();
    }

    @Override
    public final boolean e() {
        return this.f36355n0.e();
    }

    @Override
    public final boolean f() {
        if (this.f36356o0 && this.f36357p0.f40568p0 && this.f30828r <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f36355n0.getFillColor();
    }

    @Override
    public final boolean j() {
        return this.f36355n0.j();
    }
}
