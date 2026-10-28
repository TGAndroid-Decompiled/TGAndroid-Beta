package org.telegram.ui;

import android.content.Context;
public final class gk extends org.telegram.ui.Components.gp {
    public final wn f39638f;

    public gk(wn wnVar, Context context) {
        super(context);
        this.f39638f = wnVar;
    }

    @Override
    public final void a(boolean z10) {
        wn wnVar = this.f39638f;
        wnVar.C7();
        wnVar.A7();
        wnVar.D7();
        wnVar.E7();
        zk zkVar = wnVar.Ab;
        if (zkVar != null) {
            zkVar.setTranslationY(wnVar.M9 + getCurrentHeight());
        }
        if (z10) {
            wnVar.T9 = true;
            wnVar.Ac();
            return;
        }
        wnVar.A9();
    }
}
