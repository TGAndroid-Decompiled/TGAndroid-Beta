package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class m10 extends CharacterStyle implements UpdateAppearance {
    public int f28342a;
    public int f28343b;
    public float f28344c;
    public final org.telegram.ui.ActionBar.d6 d;

    public m10(int i10) {
        this(i10, null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        this.f28342a = org.telegram.ui.ActionBar.h6.m1(this.f28344c, org.telegram.ui.ActionBar.h6.w0(this.f28343b, this.d));
        int color = textPaint.getColor();
        int i10 = this.f28342a;
        if (color != i10) {
            textPaint.setColor(i10);
        }
    }

    public m10(int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f28344c = 1.0f;
        this.f28343b = i10;
        this.d = d6Var;
    }
}
