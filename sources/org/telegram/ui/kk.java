package org.telegram.ui;

import android.content.Context;
public final class kk extends org.telegram.ui.Components.to {
    public final zn f35223f;

    public kk(zn znVar, Context context) {
        super(context);
        this.f35223f = znVar;
    }

    @Override
    public final void a(boolean z10) {
        zn znVar = this.f35223f;
        znVar.t7();
        znVar.r7();
        znVar.u7();
        znVar.v7();
        cl clVar = znVar.f40273ab;
        if (clVar != null) {
            clVar.setTranslationY(znVar.f40547w9 + getCurrentHeight());
        }
        if (z10) {
            znVar.D9 = true;
            znVar.jc();
            return;
        }
        znVar.o9();
    }
}
