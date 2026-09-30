package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class h10 extends CharacterStyle implements UpdateAppearance {
    public int f24713a;
    public int f24714b;
    public float f24715c;
    public final org.telegram.ui.ActionBar.d6 d;

    public h10(int i10) {
        this(i10, null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        this.f24713a = org.telegram.ui.ActionBar.h6.l1(this.f24715c, org.telegram.ui.ActionBar.h6.v0(this.f24714b, this.d));
        int color = textPaint.getColor();
        int i10 = this.f24713a;
        if (color != i10) {
            textPaint.setColor(i10);
        }
    }

    public h10(int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f24715c = 1.0f;
        this.f24714b = i10;
        this.d = d6Var;
    }
}
