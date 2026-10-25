package org.telegram.ui;

import android.content.Context;
public final class ek extends org.telegram.ui.Components.fp {
    public final un f39125f;

    public ek(un unVar, Context context) {
        super(context);
        this.f39125f = unVar;
    }

    @Override
    public final void a(boolean z10) {
        un unVar = this.f39125f;
        unVar.A7();
        unVar.y7();
        unVar.B7();
        unVar.C7();
        xk xkVar = unVar.f44465wb;
        if (xkVar != null) {
            xkVar.setTranslationY(unVar.I9 + getCurrentHeight());
        }
        if (z10) {
            unVar.P9 = true;
            unVar.wc();
            return;
        }
        unVar.x9();
    }
}
