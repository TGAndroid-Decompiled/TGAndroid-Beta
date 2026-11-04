package org.telegram.ui;

import android.content.Context;
public final class jj extends org.telegram.ui.Components.bo {
    public final wm f46628f;

    public jj(wm wmVar, Context context) {
        super(context);
        this.f46628f = wmVar;
    }

    @Override
    public final void a(boolean z10) {
        wm wmVar = this.f46628f;
        wmVar.H7();
        wmVar.F7();
        wmVar.I7();
        wmVar.J7();
        dk dkVar = wmVar.f51558yb;
        if (dkVar != null) {
            dkVar.setTranslationY(wmVar.Q9 + getCurrentHeight());
        }
        if (z10) {
            wmVar.X9 = true;
            wmVar.Nc();
            return;
        }
        wmVar.K9();
    }
}
