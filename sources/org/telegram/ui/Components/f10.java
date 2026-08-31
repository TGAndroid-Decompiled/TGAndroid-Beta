package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class f10 extends CharacterStyle implements UpdateAppearance {
    public int f26719a;
    public int f26720b;
    public float f26721c;
    public final org.telegram.ui.ActionBar.g6 d;

    public f10(int i10) {
        this(i10, null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        this.f26719a = org.telegram.ui.ActionBar.k6.l1(this.f26721c, org.telegram.ui.ActionBar.k6.v0(this.f26720b, this.d));
        int color = textPaint.getColor();
        int i10 = this.f26719a;
        if (color != i10) {
            textPaint.setColor(i10);
        }
    }

    public f10(int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f26721c = 1.0f;
        this.f26720b = i10;
        this.d = g6Var;
    }
}
