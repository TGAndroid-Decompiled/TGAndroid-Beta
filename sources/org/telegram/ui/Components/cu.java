package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class cu extends CharacterStyle {
    public final int f27571a;
    public int f27572b;

    public cu(int i10, int i11) {
        this.f27571a = i11;
        this.f27572b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f27571a) {
            case 0:
                textPaint.setAlpha((int) ((this.f27572b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.g6.l1(textPaint.getAlpha() / 255.0f, this.f27572b));
                return;
        }
    }

    public cu() {
        this.f27571a = 0;
        this.f27572b = 0;
    }
}
