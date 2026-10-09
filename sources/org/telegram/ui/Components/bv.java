package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class bv extends CharacterStyle {
    public final int f25106a;
    public int f25107b;

    public bv(int i10, int i11) {
        this.f25106a = i11;
        this.f25107b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f25106a) {
            case 0:
                textPaint.setAlpha((int) ((this.f25107b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.i6.m1(textPaint.getAlpha() / 255.0f, this.f25107b));
                return;
        }
    }

    public bv(boolean z10) {
        this.f25106a = 0;
    }

    public bv() {
        this.f25106a = 0;
        this.f25107b = 0;
    }
}
