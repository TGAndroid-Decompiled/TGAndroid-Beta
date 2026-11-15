package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public class b00 extends CharacterStyle implements UpdateAppearance {
    public int f33120a;
    public int f33121b;
    public float f33122c;
    public final org.telegram.ui.ActionBar.e6 d;

    public b00(int i7) {
        this(i7, null);
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        this.f33120a = org.telegram.ui.ActionBar.j6.r1(this.f33122c, org.telegram.ui.ActionBar.j6.w0(this.f33121b, this.d));
        int color = textPaint.getColor();
        int i7 = this.f33120a;
        if (color != i7) {
            textPaint.setColor(i7);
        }
    }

    public b00(int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f33122c = 1.0f;
        this.f33121b = i7;
        this.d = e6Var;
    }
}
