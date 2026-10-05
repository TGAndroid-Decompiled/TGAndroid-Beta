package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class h10 extends CharacterStyle implements UpdateAppearance {
    public int f27033a;
    public int f27034b;
    public float f27035c;
    public final org.telegram.ui.ActionBar.d6 d;

    public h10(int i10) {
        this(i10, null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        this.f27033a = org.telegram.ui.ActionBar.i6.l1(this.f27035c, org.telegram.ui.ActionBar.i6.v0(this.f27034b, this.d));
        int color = textPaint.getColor();
        int i10 = this.f27033a;
        if (color != i10) {
            textPaint.setColor(i10);
        }
    }

    public h10(int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f27035c = 1.0f;
        this.f27034b = i10;
        this.d = d6Var;
    }
}
