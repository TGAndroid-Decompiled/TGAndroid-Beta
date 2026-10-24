package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class qu extends CharacterStyle {
    public final int f29996a;
    public int f29997b;

    public qu(int i10, int i11) {
        this.f29996a = i11;
        this.f29997b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f29996a) {
            case 0:
                textPaint.setAlpha((int) ((this.f29997b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.k6.o1(textPaint.getAlpha() / 255.0f, this.f29997b));
                return;
        }
    }

    public qu() {
        this.f29996a = 0;
        this.f29997b = 0;
    }
}
