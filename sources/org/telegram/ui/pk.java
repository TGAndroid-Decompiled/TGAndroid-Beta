package org.telegram.ui;

import android.content.Context;
public final class pk extends org.telegram.ui.Components.gp {
    public final fo f39256f;

    public pk(fo foVar, Context context) {
        super(context);
        this.f39256f = foVar;
    }

    @Override
    public final void a(boolean z10) {
        fo foVar = this.f39256f;
        foVar.w7();
        foVar.u7();
        foVar.x7();
        foVar.y7();
        il ilVar = foVar.f35895bb;
        if (ilVar != null) {
            ilVar.setTranslationY(foVar.w9 + getCurrentHeight());
        }
        if (z10) {
            foVar.D9 = true;
            foVar.nc();
            return;
        }
        foVar.t9();
    }
}
