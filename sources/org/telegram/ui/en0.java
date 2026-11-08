package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class en0 implements org.telegram.ui.Components.g51 {
    public final int f45347a;
    public final org.telegram.messenger.hf f45348b;

    public en0(org.telegram.messenger.hf hfVar, int i7) {
        this.f45347a = i7;
        this.f45348b = hfVar;
    }

    @Override
    public final void a(org.telegram.ui.Components.sy syVar) {
        int i7 = this.f45347a;
        org.telegram.messenger.hf hfVar = this.f45348b;
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
