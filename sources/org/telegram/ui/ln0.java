package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class ln0 implements org.telegram.ui.Components.w51 {
    public final int f49785a;
    public final org.telegram.messenger.ff f49786b;

    public ln0(org.telegram.messenger.ff ffVar, int i7) {
        this.f49785a = i7;
        this.f49786b = ffVar;
    }

    @Override
    public final void a(org.telegram.ui.Components.bz bzVar) {
        int i7 = this.f49785a;
        org.telegram.messenger.ff ffVar = this.f49786b;
        switch (i7) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.f43272f9;
                bzVar.d(new org.telegram.ui.ActionBar.i5(ffVar));
                return;
            default:
                Drawable[] drawableArr2 = PhotoViewer.f43272f9;
                bzVar.d(new org.telegram.ui.ActionBar.i5(ffVar));
                return;
        }
    }
}
