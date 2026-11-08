package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public class yz extends CharacterStyle implements UpdateAppearance {
    public int f40827a;
    public int f40828b;
    public float f40829c;
    public final org.telegram.ui.ActionBar.f6 d;

    public yz(int i7) {
        this(i7, null);
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        this.f40827a = org.telegram.ui.ActionBar.k6.r1(this.f40829c, org.telegram.ui.ActionBar.k6.w0(this.f40828b, this.d));
        int color = textPaint.getColor();
        int i7 = this.f40827a;
        if (color != i7) {
            textPaint.setColor(i7);
        }
    }

    public yz(int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f40829c = 1.0f;
        this.f40828b = i7;
        this.d = f6Var;
    }
}
