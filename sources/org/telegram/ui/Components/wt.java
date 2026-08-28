package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class wt extends CharacterStyle {
    public final int f34359a;
    public int f34360b;

    public wt(int i9, int i10) {
        this.f34359a = i10;
        this.f34360b = i9;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f34359a) {
            case 0:
                textPaint.setAlpha((int) ((this.f34360b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.f6.l1(textPaint.getAlpha() / 255.0f, this.f34360b));
                return;
        }
    }

    public wt() {
        this.f34359a = 0;
        this.f34360b = 0;
    }
}
