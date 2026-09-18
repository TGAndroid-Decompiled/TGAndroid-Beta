package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class lu extends CharacterStyle {
    public final int f25972a;
    public int f25973b;

    public lu(int i10, int i11) {
        this.f25972a = i11;
        this.f25973b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f25972a) {
            case 0:
                textPaint.setAlpha((int) ((this.f25973b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.j6.l1(textPaint.getAlpha() / 255.0f, this.f25973b));
                return;
        }
    }

    public lu() {
        this.f25972a = 0;
        this.f25973b = 0;
    }
}
