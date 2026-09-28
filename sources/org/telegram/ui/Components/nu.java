package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class nu extends CharacterStyle {
    public final int f26860a;
    public int f26861b;

    public nu(int i10, int i11) {
        this.f26860a = i11;
        this.f26861b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f26860a) {
            case 0:
                textPaint.setAlpha((int) ((this.f26861b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.h6.l1(textPaint.getAlpha() / 255.0f, this.f26861b));
                return;
        }
    }

    public nu() {
        this.f26860a = 0;
        this.f26861b = 0;
    }
}
