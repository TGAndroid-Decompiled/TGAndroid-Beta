package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class tu extends CharacterStyle {
    public final int f33148a;
    public int f33149b;

    public tu(int i10, int i11) {
        this.f33148a = i11;
        this.f33149b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f33148a) {
            case 0:
                textPaint.setAlpha((int) ((this.f33149b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.y6.o1(textPaint.getAlpha() / 255.0f, this.f33149b));
                return;
        }
    }

    public tu() {
        this.f33148a = 0;
        this.f33149b = 0;
    }
}
