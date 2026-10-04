package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class ou extends CharacterStyle {
    public final int f29451a;
    public int f29452b;

    public ou(int i10, int i11) {
        this.f29451a = i11;
        this.f29452b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f29451a) {
            case 0:
                textPaint.setAlpha((int) ((this.f29452b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.i6.l1(textPaint.getAlpha() / 255.0f, this.f29452b));
                return;
        }
    }

    public ou() {
        this.f29451a = 0;
        this.f29452b = 0;
    }
}
