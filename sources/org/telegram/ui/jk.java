package org.telegram.ui;

import android.content.Context;
public final class jk extends org.telegram.ui.Components.to {
    public final zn f34900f;

    public jk(zn znVar, Context context) {
        super(context);
        this.f34900f = znVar;
    }

    @Override
    public final void a(boolean z10) {
        zn znVar = this.f34900f;
        znVar.t7();
        znVar.r7();
        znVar.u7();
        znVar.v7();
        bl blVar = znVar.f40210ab;
        if (blVar != null) {
            blVar.setTranslationY(znVar.f40484w9 + getCurrentHeight());
        }
        if (z10) {
            znVar.D9 = true;
            znVar.jc();
            return;
        }
        znVar.o9();
    }
}
