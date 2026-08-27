package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

public final class vt extends CharacterStyle {

    public final int f34051a;

    public int f34052b;

    public vt(int i10, int i11) {
        this.f34051a = i11;
        this.f34052b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f34051a) {
            case 0:
                textPaint.setAlpha((int) ((this.f34052b / 255.0f) * textPaint.getAlpha()));
                break;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.g6.l1(textPaint.getAlpha() / 255.0f, this.f34052b));
                break;
        }
    }

    public vt() {
        this.f34051a = 0;
        this.f34052b = 0;
    }
}
