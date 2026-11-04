package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class qk extends u4.c0 {
    public final lg.d0 f37483r;

    public qk(lg.d0 d0Var, Context context) {
        super(context);
        this.f37483r = d0Var;
    }

    @Override
    public final int k(int i3, View view) {
        int k10 = super.k(i3, view);
        uk ukVar = (uk) this.f37483r.V;
        return k10 - (ukVar.M.getPaddingTop() - (ukVar.f38798r0 - ukVar.f38796q0));
    }

    @Override
    public final int m(int i3) {
        return super.m(i3) * 4;
    }
}
