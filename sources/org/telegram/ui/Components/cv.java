package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class cv extends CharacterStyle {
    public final int f25476a;
    public int f25477b;

    public cv(int i10, int i11) {
        this.f25476a = i11;
        this.f25477b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f25476a) {
            case 0:
                textPaint.setAlpha((int) ((this.f25477b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.h6.m1(textPaint.getAlpha() / 255.0f, this.f25477b));
                return;
        }
    }

    public cv(boolean z10) {
        this.f25476a = 0;
    }

    public cv() {
        this.f25476a = 0;
        this.f25477b = 0;
    }
}
