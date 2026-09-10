package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class m10 extends CharacterStyle implements UpdateAppearance {
    public int f25143a;
    public int f25144b;
    public float f25145c;
    public final org.telegram.ui.ActionBar.f6 d;

    public m10(int i10) {
        this(i10, null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        this.f25143a = org.telegram.ui.ActionBar.j6.l1(this.f25145c, org.telegram.ui.ActionBar.j6.v0(this.f25144b, this.d));
        int color = textPaint.getColor();
        int i10 = this.f25143a;
        if (color != i10) {
            textPaint.setColor(i10);
        }
    }

    public m10(int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f25145c = 1.0f;
        this.f25144b = i10;
        this.d = f6Var;
    }
}
