package org.telegram.ui;

import android.content.Context;
public final class ii0 extends org.telegram.ui.Components.wg {
    public final org.telegram.ui.Components.wg f34626l0;
    public final boolean m0;
    public final vi0 f34627n0;

    public ii0(vi0 vi0Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.wg wgVar, boolean z10) {
        super(i10, context, d6Var, false);
        this.f34627n0 = vi0Var;
        this.f34626l0 = wgVar;
        this.m0 = z10;
    }

    @Override
    public final boolean d() {
        return this.f34626l0.d();
    }

    @Override
    public final boolean e() {
        return this.f34626l0.e();
    }

    @Override
    public final boolean f() {
        if (this.m0 && this.f34627n0.f38836q0 && this.f29953r <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f34626l0.getFillColor();
    }

    @Override
    public final boolean j() {
        return this.f34626l0.j();
    }
}
