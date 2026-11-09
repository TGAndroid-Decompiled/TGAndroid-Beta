package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public class yz extends CharacterStyle implements UpdateAppearance {
    public int f40841a;
    public int f40842b;
    public float f40843c;
    public final org.telegram.ui.ActionBar.g6 d;

    public yz(int i7) {
        this(i7, null);
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        this.f40841a = org.telegram.ui.ActionBar.l6.r1(this.f40843c, org.telegram.ui.ActionBar.l6.w0(this.f40842b, this.d));
        int color = textPaint.getColor();
        int i7 = this.f40841a;
        if (color != i7) {
            textPaint.setColor(i7);
        }
    }

    public yz(int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f40843c = 1.0f;
        this.f40842b = i7;
        this.d = g6Var;
    }
}
