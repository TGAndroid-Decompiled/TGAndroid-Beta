package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class zi extends CharacterStyle {
    public final int f19541a;

    public zi(int i10) {
        this.f19541a = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f19541a) {
            case 0:
                textPaint.setTextSize(textPaint.getTextSize() * 0.8f);
                textPaint.setColor(org.telegram.ui.ActionBar.t6.T2.getColor());
                return;
            case 1:
                textPaint.setColor(org.telegram.ui.ActionBar.t6.f21130o2.linkColor);
                return;
            case 2:
                return;
            default:
                textPaint.setAlpha(128);
                return;
        }
    }

    private final void a(TextPaint textPaint) {
    }
}
