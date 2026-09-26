package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class f10 extends CharacterStyle implements UpdateAppearance {
    public int f24031a;
    public int f24032b;
    public float f24033c;
    public final org.telegram.ui.ActionBar.d6 d;

    public f10(int i10) {
        this(i10, null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        this.f24031a = org.telegram.ui.ActionBar.h6.l1(this.f24033c, org.telegram.ui.ActionBar.h6.v0(this.f24032b, this.d));
        int color = textPaint.getColor();
        int i10 = this.f24031a;
        if (color != i10) {
            textPaint.setColor(i10);
        }
    }

    public f10(int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f24033c = 1.0f;
        this.f24032b = i10;
        this.d = d6Var;
    }
}
