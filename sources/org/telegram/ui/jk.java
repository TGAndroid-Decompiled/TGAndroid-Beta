package org.telegram.ui;

import android.content.Context;
public final class jk extends org.telegram.ui.Components.oo {
    public final zn f35314f;

    public jk(zn znVar, Context context) {
        super(context);
        this.f35314f = znVar;
    }

    @Override
    public final void a(boolean z4) {
        zn znVar = this.f35314f;
        znVar.t7();
        znVar.r7();
        znVar.u7();
        znVar.v7();
        cl clVar = znVar.Ya;
        if (clVar != null) {
            clVar.setTranslationY(znVar.t9 + getCurrentHeight());
        }
        if (z4) {
            znVar.A9 = true;
            znVar.jc();
            return;
        }
        znVar.o9();
    }
}
