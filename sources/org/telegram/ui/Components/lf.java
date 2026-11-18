package org.telegram.ui.Components;

import android.content.Context;
public final class lf extends org.telegram.ui.eg0 {
    public final ji.e E0;
    public final ChatActivityEnterView F0;

    public lf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.i6 i6Var, ji.e eVar) {
        super(context, i6Var);
        this.F0 = chatActivityEnterView;
        this.E0 = eVar;
    }

    @Override
    public final void m(long j3) {
        this.F0.setEffectId(j3);
        ji.e eVar = this.E0;
        if (eVar != null) {
            eVar.invalidate();
        }
    }
}
