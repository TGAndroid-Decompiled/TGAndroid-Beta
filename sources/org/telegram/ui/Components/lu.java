package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class lu extends CharacterStyle {
    public final int f26006a;
    public int f26007b;

    public lu(int i10, int i11) {
        this.f26006a = i11;
        this.f26007b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f26006a) {
            case 0:
                textPaint.setAlpha((int) ((this.f26007b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.i6.l1(textPaint.getAlpha() / 255.0f, this.f26007b));
                return;
        }
    }

    public lu() {
        this.f26006a = 0;
        this.f26007b = 0;
    }
}
