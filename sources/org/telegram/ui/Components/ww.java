package org.telegram.ui.Components;

import android.content.Context;
public final class ww extends fz {
    public final sz H;

    public ww(sz szVar, Context context) {
        super(szVar, context, 2);
        this.H = szVar;
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            this.H.f32725g0.invalidate();
        }
    }
}
