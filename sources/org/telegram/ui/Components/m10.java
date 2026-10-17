package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class m10 extends CharacterStyle implements UpdateAppearance {
    public int f28364a;
    public int f28365b;
    public float f28366c;
    public final org.telegram.ui.ActionBar.d6 d;

    public m10(int i10) {
        this(i10, null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        this.f28364a = org.telegram.ui.ActionBar.h6.m1(this.f28366c, org.telegram.ui.ActionBar.h6.w0(this.f28365b, this.d));
        int color = textPaint.getColor();
        int i10 = this.f28364a;
        if (color != i10) {
            textPaint.setColor(i10);
        }
    }

    public m10(int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f28366c = 1.0f;
        this.f28365b = i10;
        this.d = d6Var;
    }
}
