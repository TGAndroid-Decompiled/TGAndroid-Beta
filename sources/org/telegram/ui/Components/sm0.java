package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

public final class sm0 extends ig.o0 {

    public final tm0 f32486h0;

    public sm0(tm0 tm0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.c6 c6Var) {
        super(null, i10, view, tL_reactionCount, false, true, c6Var);
        this.f32486h0 = tm0Var;
    }

    @Override
    public final boolean e() {
        return this.f11403w > 0 || this.f11402u || this.F.f29784l != 1.0f;
    }

    @Override
    public final boolean i() {
        return !e();
    }

    @Override
    public final int j() {
        return 18;
    }

    @Override
    public final void s(float f10) {
        int i10 = this.f11390i;
        tm0 tm0Var = this.f32486h0;
        this.N = i0.b.d(f10, i10, org.telegram.ui.ActionBar.g6.v0(tm0Var.f32838e ? org.telegram.ui.ActionBar.g6.Fj : org.telegram.ui.ActionBar.g6.f23377va, tm0Var.f32842s.f33128c));
        int iD = i0.b.d(f10, this.f11388g, tm0Var.f32838e ? org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Cj, tm0Var.f32842s.f33128c) : 0);
        this.O = iD;
        this.N = org.telegram.ui.ActionBar.g6.v(iD, this.N);
        this.P = i0.b.d(f10, this.h, tm0Var.f32838e ? 1526726655 : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.wa, tm0Var.f32842s.f33128c));
    }
}
