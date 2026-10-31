package org.telegram.ui;

import android.content.Context;
public final class kk extends org.telegram.ui.Components.lo {
    public final un f38881f;

    public kk(un unVar, Context context) {
        super(context);
        this.f38881f = unVar;
    }

    @Override
    public final void a(boolean z10) {
        un unVar = this.f38881f;
        unVar.B7();
        unVar.z7();
        unVar.C7();
        unVar.D7();
        dl dlVar = unVar.f42464wb;
        if (dlVar != null) {
            dlVar.setTranslationY(unVar.P9 + getCurrentHeight());
        }
        if (z10) {
            unVar.W9 = true;
            unVar.Dc();
            return;
        }
        unVar.A9();
    }
}
