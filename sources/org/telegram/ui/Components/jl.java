package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class jl extends s4.d0 {
    public final jg.e0 f29693r;

    public jl(jg.e0 e0Var, Context context) {
        super(context);
        this.f29693r = e0Var;
    }

    @Override
    public final int k(int i10, View view) {
        int k10 = super.k(i10, view);
        sl slVar = (sl) this.f29693r.V;
        return k10 - (slVar.N.getPaddingTop() - (slVar.f32641x0 - slVar.f32639w0));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 4;
    }
}
