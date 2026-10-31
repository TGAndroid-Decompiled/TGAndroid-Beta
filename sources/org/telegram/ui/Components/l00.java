package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public class l00 extends CharacterStyle implements UpdateAppearance {
    public int f27956a;
    public int f27957b;
    public float f27958c;
    public final org.telegram.ui.ActionBar.p6 d;

    public l00(int i10) {
        this(i10, null);
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        this.f27956a = org.telegram.ui.ActionBar.t6.r1(this.f27958c, org.telegram.ui.ActionBar.t6.w0(this.f27957b, this.d));
        int color = textPaint.getColor();
        int i10 = this.f27956a;
        if (color != i10) {
            textPaint.setColor(i10);
        }
    }

    public l00(int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        this.f27958c = 1.0f;
        this.f27957b = i10;
        this.d = p6Var;
    }
}
