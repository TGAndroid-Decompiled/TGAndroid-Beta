package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public class xz extends CharacterStyle implements UpdateAppearance {
    public int f40436a;
    public int f40437b;
    public float f40438c;
    public final org.telegram.ui.ActionBar.h6 d;

    public xz(int i7) {
        this(i7, null);
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        this.f40436a = org.telegram.ui.ActionBar.m6.r1(this.f40438c, org.telegram.ui.ActionBar.m6.w0(this.f40437b, this.d));
        int color = textPaint.getColor();
        int i7 = this.f40436a;
        if (color != i7) {
            textPaint.setColor(i7);
        }
    }

    public xz(int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f40438c = 1.0f;
        this.f40437b = i7;
        this.d = h6Var;
    }
}
