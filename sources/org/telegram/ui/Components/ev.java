package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class ev extends CharacterStyle {
    public final int f25787a;
    public int f25788b;

    public ev(int i10, int i11) {
        this.f25787a = i11;
        this.f25788b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f25787a) {
            case 0:
                textPaint.setAlpha((int) ((this.f25788b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.h6.m1(textPaint.getAlpha() / 255.0f, this.f25788b));
                return;
        }
    }

    public ev(boolean z10) {
        this.f25787a = 0;
    }

    public ev() {
        this.f25787a = 0;
        this.f25788b = 0;
    }
}
