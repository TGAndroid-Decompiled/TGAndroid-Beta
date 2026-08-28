package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class p00 extends CharacterStyle implements UpdateAppearance {
    public int f31486a;
    public int f31487b;
    public float f31488c;
    public final org.telegram.ui.ActionBar.b6 d;

    public p00(int i9) {
        this(i9, null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        this.f31486a = org.telegram.ui.ActionBar.f6.l1(this.f31488c, org.telegram.ui.ActionBar.f6.v0(this.f31487b, this.d));
        int color = textPaint.getColor();
        int i9 = this.f31486a;
        if (color != i9) {
            textPaint.setColor(i9);
        }
    }

    public p00(int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        this.f31488c = 1.0f;
        this.f31487b = i9;
        this.d = b6Var;
    }
}
