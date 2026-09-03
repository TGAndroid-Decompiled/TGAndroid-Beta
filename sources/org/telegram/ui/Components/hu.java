package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class hu extends CharacterStyle {
    public final int f27627a;
    public int f27628b;

    public hu(int i10, int i11) {
        this.f27627a = i11;
        this.f27628b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f27627a) {
            case 0:
                textPaint.setAlpha((int) ((this.f27628b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.k6.l1(textPaint.getAlpha() / 255.0f, this.f27628b));
                return;
        }
    }

    public hu() {
        this.f27627a = 0;
        this.f27628b = 0;
    }
}
