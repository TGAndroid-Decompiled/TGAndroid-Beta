package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class en0 implements org.telegram.ui.Components.g51 {
    public final int f45388a;
    public final org.telegram.messenger.hf f45389b;

    public en0(org.telegram.messenger.hf hfVar, int i7) {
        this.f45388a = i7;
        this.f45389b = hfVar;
    }

    @Override
    public final void a(org.telegram.ui.Components.ry ryVar) {
        int i7 = this.f45388a;
        org.telegram.messenger.hf hfVar = this.f45389b;
        switch (i7) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.Y8;
                ryVar.d(new org.telegram.ui.Components.n(hfVar));
                return;
            default:
                Drawable[] drawableArr2 = PhotoViewer.Y8;
                ryVar.d(new org.telegram.ui.Components.n(hfVar));
                return;
        }
    }
}
