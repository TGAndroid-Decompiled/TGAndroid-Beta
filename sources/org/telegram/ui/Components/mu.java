package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class mu extends CharacterStyle {
    public final int f26275a;
    public int f26276b;

    public mu(int i10, int i11) {
        this.f26275a = i11;
        this.f26276b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f26275a) {
            case 0:
                textPaint.setAlpha((int) ((this.f26276b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.h6.l1(textPaint.getAlpha() / 255.0f, this.f26276b));
                return;
        }
    }

    public mu() {
        this.f26275a = 0;
        this.f26276b = 0;
    }
}
