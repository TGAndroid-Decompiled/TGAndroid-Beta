package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class e10 extends CharacterStyle implements UpdateAppearance {
    public int f23481a;
    public int f23482b;
    public float f23483c;
    public final org.telegram.ui.ActionBar.e6 d;

    public e10(int i10) {
        this(i10, null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        this.f23481a = org.telegram.ui.ActionBar.i6.l1(this.f23483c, org.telegram.ui.ActionBar.i6.v0(this.f23482b, this.d));
        int color = textPaint.getColor();
        int i10 = this.f23481a;
        if (color != i10) {
            textPaint.setColor(i10);
        }
    }

    public e10(int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f23483c = 1.0f;
        this.f23482b = i10;
        this.d = e6Var;
    }
}
