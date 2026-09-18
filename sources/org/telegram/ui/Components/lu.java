package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class lu extends CharacterStyle {
    public final int f26247a;
    public int f26248b;

    public lu(int i10, int i11) {
        this.f26247a = i11;
        this.f26248b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f26247a) {
            case 0:
                textPaint.setAlpha((int) ((this.f26248b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.j6.l1(textPaint.getAlpha() / 255.0f, this.f26248b));
                return;
        }
    }

    public lu() {
        this.f26247a = 0;
        this.f26248b = 0;
    }
}
