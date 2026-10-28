package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public class p10 extends CharacterStyle implements UpdateAppearance {
    public int f31427a;
    public int f31428b;
    public float f31429c;
    public final org.telegram.ui.ActionBar.u6 d;

    public p10(int i10) {
        this(i10, null);
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        this.f31427a = org.telegram.ui.ActionBar.y6.o1(this.f31429c, org.telegram.ui.ActionBar.y6.w0(this.f31428b, this.d));
        int color = textPaint.getColor();
        int i10 = this.f31427a;
        if (color != i10) {
            textPaint.setColor(i10);
        }
    }

    public p10(int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        this.f31429c = 1.0f;
        this.f31428b = i10;
        this.d = u6Var;
    }
}
