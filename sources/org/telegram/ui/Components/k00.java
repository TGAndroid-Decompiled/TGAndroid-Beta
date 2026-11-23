package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public class k00 extends CharacterStyle implements UpdateAppearance {
    public int f36726a;
    public int f36727b;
    public float f36728c;
    public final org.telegram.ui.ActionBar.h6 d;

    public k00(int i7) {
        this(i7, null);
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        this.f36726a = org.telegram.ui.ActionBar.m6.r1(this.f36728c, org.telegram.ui.ActionBar.m6.w0(this.f36727b, this.d));
        int color = textPaint.getColor();
        int i7 = this.f36726a;
        if (color != i7) {
            textPaint.setColor(i7);
        }
    }

    public k00(int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f36728c = 1.0f;
        this.f36727b = i7;
        this.d = h6Var;
    }
}
