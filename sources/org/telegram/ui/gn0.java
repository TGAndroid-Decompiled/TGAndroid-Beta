package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class gn0 implements org.telegram.ui.Components.h51 {
    public final int f46047a;
    public final org.telegram.messenger.hf f46048b;

    public gn0(org.telegram.messenger.hf hfVar, int i7) {
        this.f46047a = i7;
        this.f46048b = hfVar;
    }

    @Override
    public final void a(org.telegram.ui.Components.sy syVar) {
        int i7 = this.f46047a;
        org.telegram.messenger.hf hfVar = this.f46048b;
        switch (i7) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.Y8;
                syVar.d(new org.telegram.ui.Components.n(hfVar));
                return;
            default:
                Drawable[] drawableArr2 = PhotoViewer.Y8;
                syVar.d(new org.telegram.ui.Components.n(hfVar));
                return;
        }
    }
}
