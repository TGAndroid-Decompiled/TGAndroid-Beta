package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class nu extends CharacterStyle {
    public final int f26877a;
    public int f26878b;

    public nu(int i10, int i11) {
        this.f26877a = i11;
        this.f26878b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f26877a) {
            case 0:
                textPaint.setAlpha((int) ((this.f26878b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.h6.l1(textPaint.getAlpha() / 255.0f, this.f26878b));
                return;
        }
    }

    public nu() {
        this.f26877a = 0;
        this.f26878b = 0;
    }
}
