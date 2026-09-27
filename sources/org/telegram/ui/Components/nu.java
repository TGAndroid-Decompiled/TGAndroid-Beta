package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class nu extends CharacterStyle {
    public final int f26895a;
    public int f26896b;

    public nu(int i10, int i11) {
        this.f26895a = i11;
        this.f26896b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f26895a) {
            case 0:
                textPaint.setAlpha((int) ((this.f26896b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.i6.l1(textPaint.getAlpha() / 255.0f, this.f26896b));
                return;
        }
    }

    public nu() {
        this.f26895a = 0;
        this.f26896b = 0;
    }
}
