package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public class xz extends CharacterStyle implements UpdateAppearance {
    public int f40445a;
    public int f40446b;
    public float f40447c;
    public final org.telegram.ui.ActionBar.f6 d;

    public xz(int i7) {
        this(i7, null);
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        this.f40445a = org.telegram.ui.ActionBar.k6.r1(this.f40447c, org.telegram.ui.ActionBar.k6.w0(this.f40446b, this.d));
        int color = textPaint.getColor();
        int i7 = this.f40445a;
        if (color != i7) {
            textPaint.setColor(i7);
        }
    }

    public xz(int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f40447c = 1.0f;
        this.f40446b = i7;
        this.d = f6Var;
    }
}
