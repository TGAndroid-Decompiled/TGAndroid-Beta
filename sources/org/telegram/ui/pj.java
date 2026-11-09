package org.telegram.ui;

import android.content.Context;
public final class pj extends org.telegram.ui.Components.co {
    public final cn f48727f;

    public pj(cn cnVar, Context context) {
        super(context);
        this.f48727f = cnVar;
    }

    @Override
    public final void a(boolean z9) {
        cn cnVar = this.f48727f;
        cnVar.I7();
        cnVar.G7();
        cnVar.J7();
        cnVar.K7();
        jk jkVar = cnVar.f44710zb;
        if (jkVar != null) {
            jkVar.setTranslationY(cnVar.R9 + getCurrentHeight());
        }
        if (z9) {
            cnVar.Y9 = true;
            cnVar.Qc();
            return;
        }
        cnVar.L9();
    }
}
