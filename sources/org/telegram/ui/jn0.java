package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class jn0 implements org.telegram.ui.Components.x51 {
    public final int f49034a;
    public final org.telegram.messenger.gf f49035b;

    public jn0(org.telegram.messenger.gf gfVar, int i7) {
        this.f49034a = i7;
        this.f49035b = gfVar;
    }

    @Override
    public final void a(org.telegram.ui.Components.ez ezVar) {
        int i7 = this.f49034a;
        org.telegram.messenger.gf gfVar = this.f49035b;
        switch (i7) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.Z8;
                ezVar.d(new org.telegram.ui.Cells.c5(gfVar));
                return;
            default:
                Drawable[] drawableArr2 = PhotoViewer.Z8;
                ezVar.d(new org.telegram.ui.Cells.c5(gfVar));
                return;
        }
    }
}
