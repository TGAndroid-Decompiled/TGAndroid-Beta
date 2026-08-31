package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class hu extends CharacterStyle {
    public final int f27588a;
    public int f27589b;

    public hu(int i10, int i11) {
        this.f27588a = i11;
        this.f27589b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f27588a) {
            case 0:
                textPaint.setAlpha((int) ((this.f27589b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.k6.l1(textPaint.getAlpha() / 255.0f, this.f27589b));
                return;
        }
    }

    public hu() {
        this.f27588a = 0;
        this.f27589b = 0;
    }
}
