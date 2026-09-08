package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class yk extends s4.d0 {
    public final ig.e0 f32966r;

    public yk(ig.e0 e0Var, Context context) {
        super(context);
        this.f32966r = e0Var;
    }

    @Override
    public final int k(int i10, View view) {
        int k10 = super.k(i10, view);
        gl glVar = (gl) this.f32966r.V;
        return k10 - (glVar.P.getPaddingTop() - (glVar.A0 - glVar.f26485z0));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 4;
    }
}
