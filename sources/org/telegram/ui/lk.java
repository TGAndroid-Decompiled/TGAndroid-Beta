package org.telegram.ui;

import android.content.Context;
public final class lk extends org.telegram.ui.Components.jp {
    public final zn f39693f;

    public lk(zn znVar, Context context) {
        super(context);
        this.f39693f = znVar;
    }

    @Override
    public final void a(boolean z10) {
        zn znVar = this.f39693f;
        znVar.w7();
        znVar.u7();
        znVar.x7();
        znVar.y7();
        el elVar = znVar.f44724bb;
        if (elVar != null) {
            elVar.setTranslationY(znVar.f44984w9 + getCurrentHeight());
        }
        if (z10) {
            znVar.D9 = true;
            znVar.nc();
            return;
        }
        znVar.t9();
    }
}
