package org.telegram.ui;

import android.content.Context;
public final class di0 extends org.telegram.ui.Components.vg {
    public final org.telegram.ui.Components.vg f36638n0;
    public final boolean f36639o0;
    public final qi0 f36640p0;

    public di0(qi0 qi0Var, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.Components.vg vgVar, boolean z10) {
        super(i10, context, g6Var, false);
        this.f36640p0 = qi0Var;
        this.f36638n0 = vgVar;
        this.f36639o0 = z10;
    }

    @Override
    public final boolean d() {
        return this.f36638n0.d();
    }

    @Override
    public final boolean e() {
        return this.f36638n0.e();
    }

    @Override
    public final boolean f() {
        if (this.f36639o0 && this.f36640p0.f40837p0 && this.f31464r <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f36638n0.getFillColor();
    }

    @Override
    public final boolean j() {
        return this.f36638n0.j();
    }
}
