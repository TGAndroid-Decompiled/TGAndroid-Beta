package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class h10 extends CharacterStyle implements UpdateAppearance {
    public int f26968a;
    public int f26969b;
    public float f26970c;
    public final org.telegram.ui.ActionBar.d6 d;

    public h10(int i10) {
        this(i10, null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        this.f26968a = org.telegram.ui.ActionBar.i6.l1(this.f26970c, org.telegram.ui.ActionBar.i6.v0(this.f26969b, this.d));
        int color = textPaint.getColor();
        int i10 = this.f26968a;
        if (color != i10) {
            textPaint.setColor(i10);
        }
    }

    public h10(int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f26970c = 1.0f;
        this.f26969b = i10;
        this.d = d6Var;
    }
}
