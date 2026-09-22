package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class lu extends CharacterStyle {
    public final int f26009a;
    public int f26010b;

    public lu(int i10, int i11) {
        this.f26009a = i11;
        this.f26010b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f26009a) {
            case 0:
                textPaint.setAlpha((int) ((this.f26010b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.i6.l1(textPaint.getAlpha() / 255.0f, this.f26010b));
                return;
        }
    }

    public lu() {
        this.f26009a = 0;
        this.f26010b = 0;
    }
}
