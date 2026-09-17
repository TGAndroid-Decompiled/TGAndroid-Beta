package org.telegram.ui;

import android.content.Context;
public final class kk extends org.telegram.ui.Components.so {
    public final co f38084f;

    public kk(co coVar, Context context) {
        super(context);
        this.f38084f = coVar;
    }

    @Override
    public final void a(boolean z10) {
        co coVar = this.f38084f;
        coVar.t7();
        coVar.r7();
        coVar.u7();
        coVar.v7();
        dl dlVar = coVar.f35210bb;
        if (dlVar != null) {
            dlVar.setTranslationY(coVar.f35470w9 + getCurrentHeight());
        }
        if (z10) {
            coVar.D9 = true;
            coVar.jc();
            return;
        }
        coVar.o9();
    }
}
