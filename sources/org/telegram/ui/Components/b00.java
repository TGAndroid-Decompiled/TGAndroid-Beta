package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public class b00 extends CharacterStyle implements UpdateAppearance {
    public int f33123a;
    public int f33124b;
    public float f33125c;
    public final org.telegram.ui.ActionBar.e6 d;

    public b00(int i7) {
        this(i7, null);
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        this.f33123a = org.telegram.ui.ActionBar.j6.r1(this.f33125c, org.telegram.ui.ActionBar.j6.w0(this.f33124b, this.d));
        int color = textPaint.getColor();
        int i7 = this.f33123a;
        if (color != i7) {
            textPaint.setColor(i7);
        }
    }

    public b00(int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f33125c = 1.0f;
        this.f33124b = i7;
        this.d = e6Var;
    }
}
