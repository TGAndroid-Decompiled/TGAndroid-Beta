package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class m10 extends CharacterStyle implements UpdateAppearance {
    public int f28371a;
    public int f28372b;
    public float f28373c;
    public final org.telegram.ui.ActionBar.d6 d;

    public m10(int i10) {
        this(i10, null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        this.f28371a = org.telegram.ui.ActionBar.h6.m1(this.f28373c, org.telegram.ui.ActionBar.h6.w0(this.f28372b, this.d));
        int color = textPaint.getColor();
        int i10 = this.f28371a;
        if (color != i10) {
            textPaint.setColor(i10);
        }
    }

    public m10(int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f28373c = 1.0f;
        this.f28372b = i10;
        this.d = d6Var;
    }
}
