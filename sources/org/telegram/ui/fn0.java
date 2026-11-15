package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class fn0 implements org.telegram.ui.Components.j51 {
    public final int f47171a;
    public final org.telegram.messenger.gf f47172b;

    public fn0(org.telegram.messenger.gf gfVar, int i7) {
        this.f47171a = i7;
        this.f47172b = gfVar;
    }

    @Override
    public final void b(org.telegram.ui.Components.wy wyVar) {
        int i7 = this.f47171a;
        org.telegram.messenger.gf gfVar = this.f47172b;
        switch (i7) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.Z8;
                wyVar.d(new org.telegram.ui.Components.cf(gfVar));
                return;
            default:
                Drawable[] drawableArr2 = PhotoViewer.Z8;
                wyVar.d(new org.telegram.ui.Components.cf(gfVar));
                return;
        }
    }
}
