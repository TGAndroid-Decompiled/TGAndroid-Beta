package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class su extends CharacterStyle {
    public final int f30361a;
    public int f30362b;

    public su(int i10, int i11) {
        this.f30361a = i11;
        this.f30362b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f30361a) {
            case 0:
                textPaint.setAlpha((int) ((this.f30362b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.h6.m1(textPaint.getAlpha() / 255.0f, this.f30362b));
                return;
        }
    }

    public su() {
        this.f30361a = 0;
        this.f30362b = 0;
    }
}
