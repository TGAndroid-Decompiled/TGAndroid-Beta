package org.telegram.ui;

import android.content.Context;
public final class kk extends org.telegram.ui.Components.lo {
    public final un f38904f;

    public kk(un unVar, Context context) {
        super(context);
        this.f38904f = unVar;
    }

    @Override
    public final void a(boolean z10) {
        un unVar = this.f38904f;
        unVar.F7();
        unVar.D7();
        unVar.G7();
        unVar.H7();
        dl dlVar = unVar.xb;
        if (dlVar != null) {
            dlVar.setTranslationY(unVar.P9 + getCurrentHeight());
        }
        if (z10) {
            unVar.W9 = true;
            unVar.Ic();
            return;
        }
        unVar.F9();
    }
}
