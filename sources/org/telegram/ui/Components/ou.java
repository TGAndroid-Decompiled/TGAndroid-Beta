package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class ou extends CharacterStyle {
    public final int f29548a;
    public int f29549b;

    public ou(int i10, int i11) {
        this.f29548a = i11;
        this.f29549b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f29548a) {
            case 0:
                textPaint.setAlpha((int) ((this.f29549b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.i6.l1(textPaint.getAlpha() / 255.0f, this.f29549b));
                return;
        }
    }

    public ou() {
        this.f29548a = 0;
        this.f29549b = 0;
    }
}
