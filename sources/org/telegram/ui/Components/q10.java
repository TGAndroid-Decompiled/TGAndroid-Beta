package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class q10 extends CharacterStyle implements UpdateAppearance {
    public int f28160a;
    public int f28161b;
    public float f28162c;
    public final org.telegram.ui.ActionBar.c6 d;

    public q10(int i10) {
        this(i10, null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        this.f28160a = org.telegram.ui.ActionBar.g6.m1(this.f28162c, org.telegram.ui.ActionBar.g6.w0(this.f28161b, this.d));
        int color = textPaint.getColor();
        int i10 = this.f28160a;
        if (color != i10) {
            textPaint.setColor(i10);
        }
    }

    public q10(int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f28162c = 1.0f;
        this.f28161b = i10;
        this.d = c6Var;
    }
}
