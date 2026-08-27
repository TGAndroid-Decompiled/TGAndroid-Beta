package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

public final class s00 extends CharacterStyle implements UpdateAppearance {

    public int f32286a;

    public int f32287b;

    public float f32288c;
    public final org.telegram.ui.ActionBar.c6 d;

    public s00(int i10) {
        this(i10, null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        this.f32286a = org.telegram.ui.ActionBar.g6.l1(this.f32288c, org.telegram.ui.ActionBar.g6.v0(this.f32287b, this.d));
        int color = textPaint.getColor();
        int i10 = this.f32286a;
        if (color != i10) {
            textPaint.setColor(i10);
        }
    }

    public s00(int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f32288c = 1.0f;
        this.f32287b = i10;
        this.d = c6Var;
    }
}
