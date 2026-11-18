package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class jn0 implements org.telegram.ui.Components.u51 {
    public final int f49016a;
    public final org.telegram.messenger.ff f49017b;

    public jn0(org.telegram.messenger.ff ffVar, int i7) {
        this.f49016a = i7;
        this.f49017b = ffVar;
    }

    @Override
    public final void a(org.telegram.ui.Components.cz czVar) {
        int i7 = this.f49016a;
        org.telegram.messenger.ff ffVar = this.f49017b;
        switch (i7) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.Z8;
                czVar.d(new org.telegram.ui.Cells.b5(ffVar));
                return;
            default:
                Drawable[] drawableArr2 = PhotoViewer.Z8;
                czVar.d(new org.telegram.ui.Cells.b5(ffVar));
                return;
        }
    }
}
