package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public class k10 extends CharacterStyle implements UpdateAppearance {
    public int f27828a;
    public int f27829b;
    public float f27830c;
    public final org.telegram.ui.ActionBar.g6 d;

    public k10(int i10) {
        this(i10, null);
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        this.f27828a = org.telegram.ui.ActionBar.k6.o1(this.f27830c, org.telegram.ui.ActionBar.k6.w0(this.f27829b, this.d));
        int color = textPaint.getColor();
        int i10 = this.f27828a;
        if (color != i10) {
            textPaint.setColor(i10);
        }
    }

    public k10(int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f27830c = 1.0f;
        this.f27829b = i10;
        this.d = g6Var;
    }
}
