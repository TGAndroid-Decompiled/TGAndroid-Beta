package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public class i00 extends CharacterStyle implements UpdateAppearance {
    public int f36016a;
    public int f36017b;
    public float f36018c;
    public final org.telegram.ui.ActionBar.i6 d;

    public i00(int i7) {
        this(i7, null);
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        this.f36016a = org.telegram.ui.ActionBar.n6.r1(this.f36018c, org.telegram.ui.ActionBar.n6.w0(this.f36017b, this.d));
        int color = textPaint.getColor();
        int i7 = this.f36016a;
        if (color != i7) {
            textPaint.setColor(i7);
        }
    }

    public i00(int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f36018c = 1.0f;
        this.f36017b = i7;
        this.d = i6Var;
    }
}
