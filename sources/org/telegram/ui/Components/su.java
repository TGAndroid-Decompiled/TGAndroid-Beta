package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class su extends CharacterStyle {
    public final int f30362a;
    public int f30363b;

    public su(int i10, int i11) {
        this.f30362a = i11;
        this.f30363b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f30362a) {
            case 0:
                textPaint.setAlpha((int) ((this.f30363b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.h6.m1(textPaint.getAlpha() / 255.0f, this.f30363b));
                return;
        }
    }

    public su() {
        this.f30362a = 0;
        this.f30363b = 0;
    }
}
