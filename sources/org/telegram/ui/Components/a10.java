package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class a10 extends CharacterStyle implements UpdateAppearance {
    public int f26616a;
    public int f26617b;
    public float f26618c;
    public final org.telegram.ui.ActionBar.c6 d;

    public a10(int i10) {
        this(i10, null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        this.f26616a = org.telegram.ui.ActionBar.g6.l1(this.f26618c, org.telegram.ui.ActionBar.g6.v0(this.f26617b, this.d));
        int color = textPaint.getColor();
        int i10 = this.f26616a;
        if (color != i10) {
            textPaint.setColor(i10);
        }
    }

    public a10(int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f26618c = 1.0f;
        this.f26617b = i10;
        this.d = c6Var;
    }
}
