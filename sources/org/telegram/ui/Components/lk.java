package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

public final class lk extends f2.l0 {

    public final zi f30403r;

    public lk(zi ziVar, Context context) {
        super(context);
        this.f30403r = ziVar;
    }

    @Override
    public final int k(int i10, View view) {
        int iK = super.k(i10, view);
        tk tkVar = (tk) this.f30403r.V;
        return iK - (tkVar.L.getPaddingTop() - (tkVar.f32823w0 - tkVar.f32821v0));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 4;
    }
}
