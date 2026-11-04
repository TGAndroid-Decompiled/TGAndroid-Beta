package org.telegram.ui;

import android.content.Context;
public final class lf0 extends org.telegram.ui.Components.bg {
    public final org.telegram.ui.Components.bg f47321o0;
    public final boolean f47322p0;
    public final vf0 f47323q0;

    public lf0(vf0 vf0Var, Context context, int i3, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.bg bgVar, boolean z10) {
        super(i3, context, e6Var, false);
        this.f47323q0 = vf0Var;
        this.f47321o0 = bgVar;
        this.f47322p0 = z10;
    }

    @Override
    public final boolean b() {
        return this.f47321o0.b();
    }

    @Override
    public final boolean c() {
        return this.f47321o0.c();
    }

    @Override
    public final boolean d() {
        if (this.f47322p0 && this.f47323q0.f50493q0 && this.f32198r <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f47321o0.getFillColor();
    }

    @Override
    public final boolean j() {
        return this.f47321o0.j();
    }
}
