package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class ju extends CharacterStyle {
    public final int f27569a;
    public int f27570b;

    public ju(int i10, int i11) {
        this.f27569a = i11;
        this.f27570b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f27569a) {
            case 0:
                textPaint.setAlpha((int) ((this.f27570b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.j6.l1(textPaint.getAlpha() / 255.0f, this.f27570b));
                return;
        }
    }

    public ju() {
        this.f27569a = 0;
        this.f27570b = 0;
    }
}
