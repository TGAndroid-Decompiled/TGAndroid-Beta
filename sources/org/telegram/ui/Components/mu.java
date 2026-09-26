package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class mu extends CharacterStyle {
    public final int f26581a;
    public int f26582b;

    public mu(int i10, int i11) {
        this.f26581a = i11;
        this.f26582b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f26581a) {
            case 0:
                textPaint.setAlpha((int) ((this.f26582b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.h6.l1(textPaint.getAlpha() / 255.0f, this.f26582b));
                return;
        }
    }

    public mu() {
        this.f26581a = 0;
        this.f26582b = 0;
    }
}
