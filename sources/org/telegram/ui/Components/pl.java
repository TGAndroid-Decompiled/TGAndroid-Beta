package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class pl extends s4.e0 {
    public final hg.f0 f29883r;

    public pl(hg.f0 f0Var, Context context) {
        super(context);
        this.f29883r = f0Var;
    }

    @Override
    public final int k(int i10, View view) {
        int k10 = super.k(i10, view);
        xl xlVar = (xl) this.f29883r.V;
        return k10 - (xlVar.P.getPaddingTop() - (xlVar.A0 - xlVar.f32934z0));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 4;
    }
}
