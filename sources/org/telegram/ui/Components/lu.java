package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class lu extends CharacterStyle {
    public final int f26175a;
    public int f26176b;

    public lu(int i10, int i11) {
        this.f26175a = i11;
        this.f26176b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f26175a) {
            case 0:
                textPaint.setAlpha((int) ((this.f26176b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.j6.l1(textPaint.getAlpha() / 255.0f, this.f26176b));
                return;
        }
    }

    public lu() {
        this.f26175a = 0;
        this.f26176b = 0;
    }
}
