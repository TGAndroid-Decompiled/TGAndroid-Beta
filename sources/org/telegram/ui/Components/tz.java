package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public class tz extends CharacterStyle implements UpdateAppearance {
    public int f38582a;
    public int f38583b;
    public float f38584c;
    public final org.telegram.ui.ActionBar.e6 d;

    public tz(int i3) {
        this(i3, null);
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        this.f38582a = org.telegram.ui.ActionBar.k6.r1(this.f38584c, org.telegram.ui.ActionBar.k6.w0(this.f38583b, this.d));
        int color = textPaint.getColor();
        int i3 = this.f38582a;
        if (color != i3) {
            textPaint.setColor(i3);
        }
    }

    public tz(int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f38584c = 1.0f;
        this.f38583b = i3;
        this.d = e6Var;
    }
}
