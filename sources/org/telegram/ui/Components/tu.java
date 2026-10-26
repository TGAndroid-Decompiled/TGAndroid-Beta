package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class tu extends CharacterStyle {
    public final int f33154a;
    public int f33155b;

    public tu(int i10, int i11) {
        this.f33154a = i11;
        this.f33155b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f33154a) {
            case 0:
                textPaint.setAlpha((int) ((this.f33155b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.y6.o1(textPaint.getAlpha() / 255.0f, this.f33155b));
                return;
        }
    }

    public tu() {
        this.f33154a = 0;
        this.f33155b = 0;
    }
}
