package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class xu extends CharacterStyle {
    public final int f31010a;
    public int f31011b;

    public xu(int i10, int i11) {
        this.f31010a = i11;
        this.f31011b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f31010a) {
            case 0:
                textPaint.setAlpha((int) ((this.f31011b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.g6.m1(textPaint.getAlpha() / 255.0f, this.f31011b));
                return;
        }
    }

    public xu(boolean z10) {
        this.f31010a = 0;
    }

    public xu() {
        this.f31010a = 0;
        this.f31011b = 0;
    }
}
