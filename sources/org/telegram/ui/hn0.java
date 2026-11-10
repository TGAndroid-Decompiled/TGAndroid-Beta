package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class hn0 implements org.telegram.ui.Components.h51 {
    public final int f46396a;
    public final org.telegram.messenger.hf f46397b;

    public hn0(org.telegram.messenger.hf hfVar, int i7) {
        this.f46396a = i7;
        this.f46397b = hfVar;
    }

    @Override
    public final void a(org.telegram.ui.Components.ry ryVar) {
        int i7 = this.f46396a;
        org.telegram.messenger.hf hfVar = this.f46397b;
        switch (i7) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.Y8;
                ryVar.d(new org.telegram.ui.Components.m(hfVar));
                return;
            default:
                Drawable[] drawableArr2 = PhotoViewer.Y8;
                ryVar.d(new org.telegram.ui.Components.m(hfVar));
                return;
        }
    }
}
