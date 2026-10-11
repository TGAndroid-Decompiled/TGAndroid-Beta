package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class v10 extends CharacterStyle implements UpdateAppearance {
    public int f31640a;
    public int f31641b;
    public float f31642c;
    public final org.telegram.ui.ActionBar.d6 d;

    public v10(int i10) {
        this(i10, null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        this.f31640a = org.telegram.ui.ActionBar.h6.m1(this.f31642c, org.telegram.ui.ActionBar.h6.w0(this.f31641b, this.d));
        int color = textPaint.getColor();
        int i10 = this.f31640a;
        if (color != i10) {
            textPaint.setColor(i10);
        }
    }

    public v10(int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f31642c = 1.0f;
        this.f31641b = i10;
        this.d = d6Var;
    }
}
