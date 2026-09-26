package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class zk extends s4.d0 {
    public final hg.g0 f30912r;

    public zk(hg.g0 g0Var, Context context) {
        super(context);
        this.f30912r = g0Var;
    }

    @Override
    public final int k(int i10, View view) {
        int k10 = super.k(i10, view);
        hl hlVar = (hl) this.f30912r.V;
        return k10 - (hlVar.P.getPaddingTop() - (hlVar.A0 - hlVar.f24827z0));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 4;
    }
}
