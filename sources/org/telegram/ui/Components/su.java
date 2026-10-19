package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class su extends CharacterStyle {
    public final int f30331a;
    public int f30332b;

    public su(int i10, int i11) {
        this.f30331a = i11;
        this.f30332b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f30331a) {
            case 0:
                textPaint.setAlpha((int) ((this.f30332b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.h6.m1(textPaint.getAlpha() / 255.0f, this.f30332b));
                return;
        }
    }

    public su() {
        this.f30331a = 0;
        this.f30332b = 0;
    }
}
