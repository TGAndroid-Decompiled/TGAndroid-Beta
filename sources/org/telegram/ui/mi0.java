package org.telegram.ui;

import android.content.Context;
public final class mi0 extends org.telegram.ui.Components.wg {
    public final org.telegram.ui.Components.wg f38638l0;
    public final boolean m0;
    public final zi0 f38639n0;

    public mi0(zi0 zi0Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.wg wgVar, boolean z10) {
        super(i10, context, d6Var, false);
        this.f38639n0 = zi0Var;
        this.f38638l0 = wgVar;
        this.m0 = z10;
    }

    @Override
    public final boolean d() {
        return this.f38638l0.d();
    }

    @Override
    public final boolean e() {
        return this.f38638l0.e();
    }

    @Override
    public final boolean f() {
        if (this.m0 && this.f38639n0.f43823q0 && this.f32637r <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f38638l0.getFillColor();
    }

    @Override
    public final boolean j() {
        return this.f38638l0.j();
    }
}
