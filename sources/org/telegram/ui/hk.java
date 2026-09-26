package org.telegram.ui;

import android.content.Context;
public final class hk extends org.telegram.ui.Components.uo {
    public final wn f34242f;

    public hk(wn wnVar, Context context) {
        super(context);
        this.f34242f = wnVar;
    }

    @Override
    public final void a(boolean z10) {
        wn wnVar = this.f34242f;
        wnVar.t7();
        wnVar.r7();
        wnVar.u7();
        wnVar.v7();
        al alVar = wnVar.f39418ab;
        if (alVar != null) {
            alVar.setTranslationY(wnVar.f39691w9 + getCurrentHeight());
        }
        if (z10) {
            wnVar.D9 = true;
            wnVar.jc();
            return;
        }
        wnVar.o9();
    }
}
