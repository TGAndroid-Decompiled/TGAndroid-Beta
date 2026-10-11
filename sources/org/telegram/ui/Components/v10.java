package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class v10 extends CharacterStyle implements UpdateAppearance {
    public int f31782a;
    public int f31783b;
    public float f31784c;
    public final org.telegram.ui.ActionBar.d6 d;

    public v10(int i10) {
        this(i10, null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        this.f31782a = org.telegram.ui.ActionBar.h6.m1(this.f31784c, org.telegram.ui.ActionBar.h6.w0(this.f31783b, this.d));
        int color = textPaint.getColor();
        int i10 = this.f31782a;
        if (color != i10) {
            textPaint.setColor(i10);
        }
    }

    public v10(int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f31784c = 1.0f;
        this.f31783b = i10;
        this.d = d6Var;
    }
}
