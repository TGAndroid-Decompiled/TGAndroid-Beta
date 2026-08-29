package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class tk extends f2.k0 {
    public final gj f32967r;

    public tk(gj gjVar, Context context) {
        super(context);
        this.f32967r = gjVar;
    }

    @Override
    public final int k(int i10, View view) {
        int k9 = super.k(i10, view);
        bl blVar = (bl) this.f32967r.V;
        return k9 - (blVar.L.getPaddingTop() - (blVar.f27177w0 - blVar.f27175v0));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 4;
    }
}
