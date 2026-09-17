package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class ju extends CharacterStyle {
    public final int f27597a;
    public int f27598b;

    public ju(int i10, int i11) {
        this.f27597a = i11;
        this.f27598b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f27597a) {
            case 0:
                textPaint.setAlpha((int) ((this.f27598b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.j6.l1(textPaint.getAlpha() / 255.0f, this.f27598b));
                return;
        }
    }

    public ju() {
        this.f27597a = 0;
        this.f27598b = 0;
    }
}
