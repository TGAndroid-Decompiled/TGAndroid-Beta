package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class ou extends CharacterStyle {
    public final int f27177a;
    public int f27178b;

    public ou(int i10, int i11) {
        this.f27177a = i11;
        this.f27178b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f27177a) {
            case 0:
                textPaint.setAlpha((int) ((this.f27178b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.h6.l1(textPaint.getAlpha() / 255.0f, this.f27178b));
                return;
        }
    }

    public ou() {
        this.f27177a = 0;
        this.f27178b = 0;
    }
}
