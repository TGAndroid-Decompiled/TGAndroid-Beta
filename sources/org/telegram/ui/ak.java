package org.telegram.ui;

import android.content.Context;

public final class ak extends org.telegram.ui.Components.ho {

    public final rn f36555f;

    public ak(rn rnVar, Context context) {
        super(context);
        this.f36555f = rnVar;
    }

    @Override
    public final void a(boolean z10) {
        rn rnVar = this.f36555f;
        rnVar.t7();
        rnVar.r7();
        rnVar.u7();
        rnVar.v7();
        tk tkVar = rnVar.Xa;
        if (tkVar != null) {
            tkVar.setTranslationY(rnVar.f42209s9 + getCurrentHeight());
        }
        if (!z10) {
            rnVar.o9();
        } else {
            rnVar.f42299z9 = true;
            rnVar.jc();
        }
    }
}
