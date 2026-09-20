package org.telegram.ui;

import android.content.Context;
public final class jk extends org.telegram.ui.Components.to {
    public final zn f34943f;

    public jk(zn znVar, Context context) {
        super(context);
        this.f34943f = znVar;
    }

    @Override
    public final void a(boolean z10) {
        zn znVar = this.f34943f;
        znVar.t7();
        znVar.r7();
        znVar.u7();
        znVar.v7();
        bl blVar = znVar.f40252ab;
        if (blVar != null) {
            blVar.setTranslationY(znVar.f40526w9 + getCurrentHeight());
        }
        if (z10) {
            znVar.D9 = true;
            znVar.jc();
            return;
        }
        znVar.o9();
    }
}
