package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class v10 extends CharacterStyle implements UpdateAppearance {
    public int f31700a;
    public int f31701b;
    public float f31702c;
    public final org.telegram.ui.ActionBar.e6 d;

    public v10(int i10) {
        this(i10, null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        this.f31700a = org.telegram.ui.ActionBar.i6.m1(this.f31702c, org.telegram.ui.ActionBar.i6.w0(this.f31701b, this.d));
        int color = textPaint.getColor();
        int i10 = this.f31700a;
        if (color != i10) {
            textPaint.setColor(i10);
        }
    }

    public v10(int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f31702c = 1.0f;
        this.f31701b = i10;
        this.d = e6Var;
    }
}
