package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class cv extends CharacterStyle {
    public final int f25414a;
    public int f25415b;

    public cv(int i10, int i11) {
        this.f25414a = i11;
        this.f25415b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f25414a) {
            case 0:
                textPaint.setAlpha((int) ((this.f25415b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.i6.m1(textPaint.getAlpha() / 255.0f, this.f25415b));
                return;
        }
    }

    public cv(boolean z10) {
        this.f25414a = 0;
    }

    public cv() {
        this.f25414a = 0;
        this.f25415b = 0;
    }
}
