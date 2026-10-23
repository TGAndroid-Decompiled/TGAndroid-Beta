package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class su extends CharacterStyle {
    public final int f30554a;
    public int f30555b;

    public su(int i10, int i11) {
        this.f30554a = i11;
        this.f30555b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f30554a) {
            case 0:
                textPaint.setAlpha((int) ((this.f30555b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.k6.o1(textPaint.getAlpha() / 255.0f, this.f30555b));
                return;
        }
    }

    public su() {
        this.f30554a = 0;
        this.f30555b = 0;
    }
}
