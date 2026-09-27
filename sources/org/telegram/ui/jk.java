package org.telegram.ui;

import android.content.Context;
public final class jk extends org.telegram.ui.Components.vo {
    public final xn f34753f;

    public jk(xn xnVar, Context context) {
        super(context);
        this.f34753f = xnVar;
    }

    @Override
    public final void a(boolean z10) {
        xn xnVar = this.f34753f;
        xnVar.t7();
        xnVar.r7();
        xnVar.u7();
        xnVar.v7();
        bl blVar = xnVar.f39699ab;
        if (blVar != null) {
            blVar.setTranslationY(xnVar.f39973w9 + getCurrentHeight());
        }
        if (z10) {
            xnVar.D9 = true;
            xnVar.jc();
            return;
        }
        xnVar.o9();
    }
}
