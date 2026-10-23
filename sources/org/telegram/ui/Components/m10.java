package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public class m10 extends CharacterStyle implements UpdateAppearance {
    public int f28468a;
    public int f28469b;
    public float f28470c;
    public final org.telegram.ui.ActionBar.g6 d;

    public m10(int i10) {
        this(i10, null);
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        this.f28468a = org.telegram.ui.ActionBar.k6.o1(this.f28470c, org.telegram.ui.ActionBar.k6.w0(this.f28469b, this.d));
        int color = textPaint.getColor();
        int i10 = this.f28468a;
        if (color != i10) {
            textPaint.setColor(i10);
        }
    }

    public m10(int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f28470c = 1.0f;
        this.f28469b = i10;
        this.d = g6Var;
    }
}
