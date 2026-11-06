package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public class xz extends CharacterStyle implements UpdateAppearance {
    public int f40485a;
    public int f40486b;
    public float f40487c;
    public final org.telegram.ui.ActionBar.f6 d;

    public xz(int i7) {
        this(i7, null);
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        this.f40485a = org.telegram.ui.ActionBar.k6.r1(this.f40487c, org.telegram.ui.ActionBar.k6.w0(this.f40486b, this.d));
        int color = textPaint.getColor();
        int i7 = this.f40485a;
        if (color != i7) {
            textPaint.setColor(i7);
        }
    }

    public xz(int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f40487c = 1.0f;
        this.f40486b = i7;
        this.d = f6Var;
    }
}
