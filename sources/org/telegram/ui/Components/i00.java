package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public class i00 extends CharacterStyle implements UpdateAppearance {
    public int f35853a;
    public int f35854b;
    public float f35855c;
    public final org.telegram.ui.ActionBar.i6 d;

    public i00(int i7) {
        this(i7, null);
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        this.f35853a = org.telegram.ui.ActionBar.n6.r1(this.f35855c, org.telegram.ui.ActionBar.n6.w0(this.f35854b, this.d));
        int color = textPaint.getColor();
        int i7 = this.f35853a;
        if (color != i7) {
            textPaint.setColor(i7);
        }
    }

    public i00(int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f35855c = 1.0f;
        this.f35854b = i7;
        this.d = i6Var;
    }
}
