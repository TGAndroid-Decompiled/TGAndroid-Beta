package org.telegram.ui;

import android.content.Context;
public final class pk extends org.telegram.ui.Components.lp {
    public final eo f40983f;

    public pk(eo eoVar, Context context) {
        super(context);
        this.f40983f = eoVar;
    }

    @Override
    public final void a(boolean z10) {
        eo eoVar = this.f40983f;
        eoVar.w7();
        eoVar.u7();
        eoVar.x7();
        eoVar.y7();
        il ilVar = eoVar.f37218bb;
        if (ilVar != null) {
            ilVar.setTranslationY(eoVar.f37478w9 + getCurrentHeight());
        }
        if (z10) {
            eoVar.D9 = true;
            eoVar.nc();
            return;
        }
        eoVar.t9();
    }
}
