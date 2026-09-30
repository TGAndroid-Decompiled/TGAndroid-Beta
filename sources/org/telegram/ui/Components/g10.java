package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class g10 extends CharacterStyle implements UpdateAppearance {
    public int f24383a;
    public int f24384b;
    public float f24385c;
    public final org.telegram.ui.ActionBar.d6 d;

    public g10(int i10) {
        this(i10, null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        this.f24383a = org.telegram.ui.ActionBar.h6.l1(this.f24385c, org.telegram.ui.ActionBar.h6.v0(this.f24384b, this.d));
        int color = textPaint.getColor();
        int i10 = this.f24383a;
        if (color != i10) {
            textPaint.setColor(i10);
        }
    }

    public g10(int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f24385c = 1.0f;
        this.f24384b = i10;
        this.d = d6Var;
    }
}
