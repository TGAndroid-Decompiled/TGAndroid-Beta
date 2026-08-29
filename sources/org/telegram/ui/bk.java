package org.telegram.ui;

import android.content.Context;
public final class bk extends org.telegram.ui.Components.no {
    public final tn f36818f;

    public bk(tn tnVar, Context context) {
        super(context);
        this.f36818f = tnVar;
    }

    @Override
    public final void a(boolean z10) {
        tn tnVar = this.f36818f;
        tnVar.t7();
        tnVar.r7();
        tnVar.u7();
        tnVar.v7();
        uk ukVar = tnVar.Xa;
        if (ukVar != null) {
            ukVar.setTranslationY(tnVar.f42969s9 + getCurrentHeight());
        }
        if (z10) {
            tnVar.f43059z9 = true;
            tnVar.jc();
            return;
        }
        tnVar.o9();
    }
}
