package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class mu extends CharacterStyle {
    public final int f26574a;
    public int f26575b;

    public mu(int i10, int i11) {
        this.f26574a = i11;
        this.f26575b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f26574a) {
            case 0:
                textPaint.setAlpha((int) ((this.f26575b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.h6.l1(textPaint.getAlpha() / 255.0f, this.f26575b));
                return;
        }
    }

    public mu() {
        this.f26574a = 0;
        this.f26575b = 0;
    }
}
