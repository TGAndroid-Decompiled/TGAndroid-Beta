package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public class l00 extends CharacterStyle implements UpdateAppearance {
    public int f28006a;
    public int f28007b;
    public float f28008c;
    public final org.telegram.ui.ActionBar.p6 d;

    public l00(int i10) {
        this(i10, null);
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        this.f28006a = org.telegram.ui.ActionBar.t6.r1(this.f28008c, org.telegram.ui.ActionBar.t6.w0(this.f28007b, this.d));
        int color = textPaint.getColor();
        int i10 = this.f28006a;
        if (color != i10) {
            textPaint.setColor(i10);
        }
    }

    public l00(int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        this.f28008c = 1.0f;
        this.f28007b = i10;
        this.d = p6Var;
    }
}
