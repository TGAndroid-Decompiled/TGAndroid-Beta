package org.telegram.ui;

import android.content.Context;
public final class fi0 extends org.telegram.ui.Components.lg {
    public final org.telegram.ui.Components.lg f34264i0;
    public final boolean f34265j0;
    public final si0 f34266k0;

    public fi0(si0 si0Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.lg lgVar, boolean z4) {
        super(i10, context, f6Var, false);
        this.f34266k0 = si0Var;
        this.f34264i0 = lgVar;
        this.f34265j0 = z4;
    }

    @Override
    public final boolean d() {
        return this.f34264i0.d();
    }

    @Override
    public final boolean e() {
        return this.f34264i0.e();
    }

    @Override
    public final boolean f() {
        if (this.f34265j0 && this.f34266k0.f38367n0 && this.f26651r <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f34264i0.getFillColor();
    }

    @Override
    public final boolean j() {
        return this.f34264i0.j();
    }
}
