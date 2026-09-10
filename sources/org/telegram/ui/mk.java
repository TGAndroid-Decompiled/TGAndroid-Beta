package org.telegram.ui;

import android.content.Context;
public final class mk extends org.telegram.ui.Components.zo {
    public final eo f34990f;

    public mk(eo eoVar, Context context) {
        super(context);
        this.f34990f = eoVar;
    }

    @Override
    public final void a(boolean z10) {
        eo eoVar = this.f34990f;
        eoVar.t7();
        eoVar.r7();
        eoVar.u7();
        eoVar.v7();
        fl flVar = eoVar.f32279bb;
        if (flVar != null) {
            flVar.setTranslationY(eoVar.f32538w9 + getCurrentHeight());
        }
        if (z10) {
            eoVar.D9 = true;
            eoVar.jc();
            return;
        }
        eoVar.o9();
    }
}
