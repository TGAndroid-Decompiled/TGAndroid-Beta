package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class f10 extends CharacterStyle implements UpdateAppearance {
    public int f23802a;
    public int f23803b;
    public float f23804c;
    public final org.telegram.ui.ActionBar.d6 d;

    public f10(int i10) {
        this(i10, null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        this.f23802a = org.telegram.ui.ActionBar.h6.l1(this.f23804c, org.telegram.ui.ActionBar.h6.v0(this.f23803b, this.d));
        int color = textPaint.getColor();
        int i10 = this.f23802a;
        if (color != i10) {
            textPaint.setColor(i10);
        }
    }

    public f10(int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f23804c = 1.0f;
        this.f23803b = i10;
        this.d = d6Var;
    }
}
