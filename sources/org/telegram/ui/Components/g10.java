package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class g10 extends CharacterStyle implements UpdateAppearance {
    public int f24394a;
    public int f24395b;
    public float f24396c;
    public final org.telegram.ui.ActionBar.d6 d;

    public g10(int i10) {
        this(i10, null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        this.f24394a = org.telegram.ui.ActionBar.h6.l1(this.f24396c, org.telegram.ui.ActionBar.h6.v0(this.f24395b, this.d));
        int color = textPaint.getColor();
        int i10 = this.f24394a;
        if (color != i10) {
            textPaint.setColor(i10);
        }
    }

    public g10(int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f24396c = 1.0f;
        this.f24395b = i10;
        this.d = d6Var;
    }
}
