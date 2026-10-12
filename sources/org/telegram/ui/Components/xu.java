package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class xu extends CharacterStyle {
    public final int f31329a;
    public int f31330b;

    public xu(int i10, int i11) {
        this.f31329a = i11;
        this.f31330b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f31329a) {
            case 0:
                textPaint.setAlpha((int) ((this.f31330b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.g6.m1(textPaint.getAlpha() / 255.0f, this.f31330b));
                return;
        }
    }

    public xu(boolean z10) {
        this.f31329a = 0;
    }

    public xu() {
        this.f31329a = 0;
        this.f31330b = 0;
    }
}
