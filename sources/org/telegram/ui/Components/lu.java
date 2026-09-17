package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class lu extends CharacterStyle {
    public final int f25969a;
    public int f25970b;

    public lu(int i10, int i11) {
        this.f25969a = i11;
        this.f25970b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f25969a) {
            case 0:
                textPaint.setAlpha((int) ((this.f25970b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.j6.l1(textPaint.getAlpha() / 255.0f, this.f25970b));
                return;
        }
    }

    public lu() {
        this.f25969a = 0;
        this.f25970b = 0;
    }
}
