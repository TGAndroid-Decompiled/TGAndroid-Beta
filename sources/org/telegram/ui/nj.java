package org.telegram.ui;

import android.content.Context;
public final class nj extends org.telegram.ui.Components.mo {
    public final an f49570f;

    public nj(an anVar, Context context) {
        super(context);
        this.f49570f = anVar;
    }

    @Override
    public final void a(boolean z10) {
        an anVar = this.f49570f;
        anVar.I7();
        anVar.G7();
        anVar.J7();
        anVar.K7();
        hk hkVar = anVar.Ab;
        if (hkVar != null) {
            hkVar.setTranslationY(anVar.S9 + getCurrentHeight());
        }
        if (z10) {
            anVar.Z9 = true;
            anVar.Rc();
            return;
        }
        anVar.M9();
    }
}
