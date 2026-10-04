package org.telegram.ui;

import android.content.Context;
public final class hk extends org.telegram.ui.Components.wo {
    public final yn f37112f;

    public hk(yn ynVar, Context context) {
        super(context);
        this.f37112f = ynVar;
    }

    @Override
    public final void a(boolean z10) {
        yn ynVar = this.f37112f;
        ynVar.t7();
        ynVar.r7();
        ynVar.u7();
        ynVar.v7();
        al alVar = ynVar.Ya;
        if (alVar != null) {
            alVar.setTranslationY(ynVar.f43522u9 + getCurrentHeight());
        }
        if (z10) {
            ynVar.B9 = true;
            ynVar.ic();
            return;
        }
        ynVar.o9();
    }
}
