package org.telegram.ui;

import android.content.Context;
public final class lk extends org.telegram.ui.Components.jp {
    public final zn f39620f;

    public lk(zn znVar, Context context) {
        super(context);
        this.f39620f = znVar;
    }

    @Override
    public final void a(boolean z10) {
        zn znVar = this.f39620f;
        znVar.w7();
        znVar.u7();
        znVar.x7();
        znVar.y7();
        el elVar = znVar.f44725bb;
        if (elVar != null) {
            elVar.setTranslationY(znVar.f44985w9 + getCurrentHeight());
        }
        if (z10) {
            znVar.D9 = true;
            znVar.nc();
            return;
        }
        znVar.t9();
    }
}
