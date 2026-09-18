package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class e10 extends CharacterStyle implements UpdateAppearance {
    public int f23447a;
    public int f23448b;
    public float f23449c;
    public final org.telegram.ui.ActionBar.f6 d;

    public e10(int i10) {
        this(i10, null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        this.f23447a = org.telegram.ui.ActionBar.j6.l1(this.f23449c, org.telegram.ui.ActionBar.j6.v0(this.f23448b, this.d));
        int color = textPaint.getColor();
        int i10 = this.f23447a;
        if (color != i10) {
            textPaint.setColor(i10);
        }
    }

    public e10(int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f23449c = 1.0f;
        this.f23448b = i10;
        this.d = f6Var;
    }
}
