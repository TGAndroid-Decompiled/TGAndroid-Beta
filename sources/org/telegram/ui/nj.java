package org.telegram.ui;

import android.content.Context;
public final class nj extends org.telegram.ui.Components.co {
    public final an f48057f;

    public nj(an anVar, Context context) {
        super(context);
        this.f48057f = anVar;
    }

    @Override
    public final void a(boolean z9) {
        an anVar = this.f48057f;
        anVar.H7();
        anVar.F7();
        anVar.I7();
        anVar.J7();
        hk hkVar = anVar.f44024xb;
        if (hkVar != null) {
            hkVar.setTranslationY(anVar.P9 + getCurrentHeight());
        }
        if (z9) {
            anVar.W9 = true;
            anVar.Nc();
            return;
        }
        anVar.K9();
    }
}
