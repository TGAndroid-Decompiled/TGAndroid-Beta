package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class fu extends CharacterStyle {
    public final int f24959a;
    public int f24960b;

    public fu(int i10, int i11) {
        this.f24959a = i11;
        this.f24960b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f24959a) {
            case 0:
                textPaint.setAlpha((int) ((this.f24960b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.j6.l1(textPaint.getAlpha() / 255.0f, this.f24960b));
                return;
        }
    }

    public fu() {
        this.f24959a = 0;
        this.f24960b = 0;
    }
}
