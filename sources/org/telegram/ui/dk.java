package org.telegram.ui;

import android.content.Context;
public final class dk extends org.telegram.ui.Components.bp {
    public final sn f36638f;

    public dk(sn snVar, Context context) {
        super(context);
        this.f36638f = snVar;
    }

    @Override
    public final void a(boolean z10) {
        sn snVar = this.f36638f;
        snVar.w7();
        snVar.u7();
        snVar.x7();
        snVar.y7();
        wk wkVar = snVar.f41618nb;
        if (wkVar != null) {
            wkVar.setTranslationY(snVar.I9 + getCurrentHeight());
        }
        if (z10) {
            snVar.P9 = true;
            snVar.qc();
            return;
        }
        snVar.t9();
    }
}
