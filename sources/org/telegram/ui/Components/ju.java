package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class ju extends CharacterStyle {
    public final int f27570a;
    public int f27571b;

    public ju(int i10, int i11) {
        this.f27570a = i11;
        this.f27571b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f27570a) {
            case 0:
                textPaint.setAlpha((int) ((this.f27571b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.j6.l1(textPaint.getAlpha() / 255.0f, this.f27571b));
                return;
        }
    }

    public ju() {
        this.f27570a = 0;
        this.f27571b = 0;
    }
}
