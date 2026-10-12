package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class x10 extends CharacterStyle implements UpdateAppearance {
    public int f32611a;
    public int f32612b;
    public float f32613c;
    public final org.telegram.ui.ActionBar.c6 d;

    public x10(int i10) {
        this(i10, null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        this.f32611a = org.telegram.ui.ActionBar.h6.m1(this.f32613c, org.telegram.ui.ActionBar.h6.w0(this.f32612b, this.d));
        int color = textPaint.getColor();
        int i10 = this.f32611a;
        if (color != i10) {
            textPaint.setColor(i10);
        }
    }

    public x10(int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f32613c = 1.0f;
        this.f32612b = i10;
        this.d = c6Var;
    }
}
