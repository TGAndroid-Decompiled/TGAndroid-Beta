package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class ev extends CharacterStyle {
    public final int f25789a;
    public int f25790b;

    public ev(int i10, int i11) {
        this.f25789a = i11;
        this.f25790b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f25789a) {
            case 0:
                textPaint.setAlpha((int) ((this.f25790b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.h6.m1(textPaint.getAlpha() / 255.0f, this.f25790b));
                return;
        }
    }

    public ev(boolean z10) {
        this.f25789a = 0;
    }

    public ev() {
        this.f25789a = 0;
        this.f25790b = 0;
    }
}
