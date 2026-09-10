package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class pu extends CharacterStyle {
    public final int f26249a;
    public int f26250b;

    public pu(int i10, int i11) {
        this.f26249a = i11;
        this.f26250b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f26249a) {
            case 0:
                textPaint.setAlpha((int) ((this.f26250b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.j6.l1(textPaint.getAlpha() / 255.0f, this.f26250b));
                return;
        }
    }

    public pu() {
        this.f26249a = 0;
        this.f26250b = 0;
    }
}
