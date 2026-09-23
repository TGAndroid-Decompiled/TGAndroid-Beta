package org.telegram.ui;

import android.content.Context;
public final class hk extends org.telegram.ui.Components.uo {
    public final xn f33875f;

    public hk(xn xnVar, Context context) {
        super(context);
        this.f33875f = xnVar;
    }

    @Override
    public final void a(boolean z10) {
        xn xnVar = this.f33875f;
        xnVar.t7();
        xnVar.r7();
        xnVar.u7();
        xnVar.v7();
        al alVar = xnVar.f39319ab;
        if (alVar != null) {
            alVar.setTranslationY(xnVar.f39592w9 + getCurrentHeight());
        }
        if (z10) {
            xnVar.D9 = true;
            xnVar.jc();
            return;
        }
        xnVar.o9();
    }
}
