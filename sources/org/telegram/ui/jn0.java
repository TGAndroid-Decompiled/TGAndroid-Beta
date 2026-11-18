package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class jn0 implements org.telegram.ui.Components.u51 {
    public final int f48993a;
    public final org.telegram.messenger.ff f48994b;

    public jn0(org.telegram.messenger.ff ffVar, int i7) {
        this.f48993a = i7;
        this.f48994b = ffVar;
    }

    @Override
    public final void a(org.telegram.ui.Components.cz czVar) {
        int i7 = this.f48993a;
        org.telegram.messenger.ff ffVar = this.f48994b;
        switch (i7) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.Z8;
                czVar.d(new org.telegram.ui.Cells.c5(ffVar));
                return;
            default:
                Drawable[] drawableArr2 = PhotoViewer.Z8;
                czVar.d(new org.telegram.ui.Cells.c5(ffVar));
                return;
        }
    }
}
