package org.telegram.ui;

import android.content.Context;
public final class hi0 extends org.telegram.ui.Components.lg {
    public final org.telegram.ui.Components.lg f34678i0;
    public final boolean f34679j0;
    public final ui0 f34680k0;

    public hi0(ui0 ui0Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.lg lgVar, boolean z4) {
        super(i10, context, f6Var, false);
        this.f34680k0 = ui0Var;
        this.f34678i0 = lgVar;
        this.f34679j0 = z4;
    }

    @Override
    public final boolean d() {
        return this.f34678i0.d();
    }

    @Override
    public final boolean e() {
        return this.f34678i0.e();
    }

    @Override
    public final boolean f() {
        if (this.f34679j0 && this.f34680k0.f38842n0 && this.f26668r <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f34678i0.getFillColor();
    }

    @Override
    public final boolean j() {
        return this.f34678i0.j();
    }
}
