package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class en0 implements org.telegram.ui.Components.b51 {
    public final int f45359a;
    public final org.telegram.messenger.hf f45360b;

    public en0(org.telegram.messenger.hf hfVar, int i7) {
        this.f45359a = i7;
        this.f45360b = hfVar;
    }

    @Override
    public final void a(org.telegram.ui.Components.ry ryVar) {
        int i7 = this.f45359a;
        org.telegram.messenger.hf hfVar = this.f45360b;
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
