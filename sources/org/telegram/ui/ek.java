package org.telegram.ui;

import android.content.Context;
public final class ek extends org.telegram.ui.Components.dp {
    public final sn f36547f;

    public ek(sn snVar, Context context) {
        super(context);
        this.f36547f = snVar;
    }

    @Override
    public final void a(boolean z10) {
        sn snVar = this.f36547f;
        snVar.w7();
        snVar.u7();
        snVar.x7();
        snVar.y7();
        xk xkVar = snVar.f41154bb;
        if (xkVar != null) {
            xkVar.setTranslationY(snVar.w9 + getCurrentHeight());
        }
        if (z10) {
            snVar.D9 = true;
            snVar.nc();
            return;
        }
        snVar.t9();
    }
}
