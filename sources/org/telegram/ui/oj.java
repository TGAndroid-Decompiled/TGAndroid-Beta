package org.telegram.ui;

import android.content.Context;
public final class oj extends org.telegram.ui.Components.vo {
    public final bn f50609f;

    public oj(bn bnVar, Context context) {
        super(context);
        this.f50609f = bnVar;
    }

    @Override
    public final void a(boolean z10) {
        bn bnVar = this.f50609f;
        bnVar.I7();
        bnVar.G7();
        bnVar.J7();
        bnVar.K7();
        ik ikVar = bnVar.Bb;
        if (ikVar != null) {
            ikVar.setTranslationY(bnVar.T9 + getCurrentHeight());
        }
        if (z10) {
            bnVar.f45956aa = true;
            bnVar.Rc();
            return;
        }
        bnVar.M9();
    }
}
