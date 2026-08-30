package org.telegram.ui;

import android.content.Context;
public final class hk extends org.telegram.ui.Components.po {
    public final xn f34907f;

    public hk(xn xnVar, Context context) {
        super(context);
        this.f34907f = xnVar;
    }

    @Override
    public final void a(boolean z4) {
        xn xnVar = this.f34907f;
        xnVar.t7();
        xnVar.r7();
        xnVar.u7();
        xnVar.v7();
        al alVar = xnVar.Ya;
        if (alVar != null) {
            alVar.setTranslationY(xnVar.t9 + getCurrentHeight());
        }
        if (z4) {
            xnVar.A9 = true;
            xnVar.jc();
            return;
        }
        xnVar.o9();
    }
}
