package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class e10 extends CharacterStyle implements UpdateAppearance {
    public int f23749a;
    public int f23750b;
    public float f23751c;
    public final org.telegram.ui.ActionBar.e6 d;

    public e10(int i10) {
        this(i10, null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        this.f23749a = org.telegram.ui.ActionBar.j6.l1(this.f23751c, org.telegram.ui.ActionBar.j6.v0(this.f23750b, this.d));
        int color = textPaint.getColor();
        int i10 = this.f23749a;
        if (color != i10) {
            textPaint.setColor(i10);
        }
    }

    public e10(int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f23751c = 1.0f;
        this.f23750b = i10;
        this.d = e6Var;
    }
}
