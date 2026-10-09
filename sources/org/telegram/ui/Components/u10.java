package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class u10 extends CharacterStyle implements UpdateAppearance {
    public int f31335a;
    public int f31336b;
    public float f31337c;
    public final org.telegram.ui.ActionBar.e6 d;

    public u10(int i10) {
        this(i10, null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        this.f31335a = org.telegram.ui.ActionBar.i6.m1(this.f31337c, org.telegram.ui.ActionBar.i6.w0(this.f31336b, this.d));
        int color = textPaint.getColor();
        int i10 = this.f31335a;
        if (color != i10) {
            textPaint.setColor(i10);
        }
    }

    public u10(int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f31337c = 1.0f;
        this.f31336b = i10;
        this.d = e6Var;
    }
}
