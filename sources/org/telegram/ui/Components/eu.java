package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class eu extends CharacterStyle {
    public final int f24692a;
    public int f24693b;

    public eu(int i10, int i11) {
        this.f24692a = i11;
        this.f24693b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f24692a) {
            case 0:
                textPaint.setAlpha((int) ((this.f24693b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.j6.l1(textPaint.getAlpha() / 255.0f, this.f24693b));
                return;
        }
    }

    public eu() {
        this.f24692a = 0;
        this.f24693b = 0;
    }
}
