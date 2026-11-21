package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public class k00 extends CharacterStyle implements UpdateAppearance {
    public int f36731a;
    public int f36732b;
    public float f36733c;
    public final org.telegram.ui.ActionBar.h6 d;

    public k00(int i7) {
        this(i7, null);
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        this.f36731a = org.telegram.ui.ActionBar.m6.r1(this.f36733c, org.telegram.ui.ActionBar.m6.w0(this.f36732b, this.d));
        int color = textPaint.getColor();
        int i7 = this.f36731a;
        if (color != i7) {
            textPaint.setColor(i7);
        }
    }

    public k00(int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f36733c = 1.0f;
        this.f36732b = i7;
        this.d = h6Var;
    }
}
