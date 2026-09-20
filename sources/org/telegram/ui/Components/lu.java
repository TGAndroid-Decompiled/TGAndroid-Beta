package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class lu extends CharacterStyle {
    public final int f26236a;
    public int f26237b;

    public lu(int i10, int i11) {
        this.f26236a = i11;
        this.f26237b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f26236a) {
            case 0:
                textPaint.setAlpha((int) ((this.f26237b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.j6.l1(textPaint.getAlpha() / 255.0f, this.f26237b));
                return;
        }
    }

    public lu() {
        this.f26236a = 0;
        this.f26237b = 0;
    }
}
