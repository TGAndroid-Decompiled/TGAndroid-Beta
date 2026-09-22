package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class e10 extends CharacterStyle implements UpdateAppearance {
    public int f23478a;
    public int f23479b;
    public float f23480c;
    public final org.telegram.ui.ActionBar.e6 d;

    public e10(int i10) {
        this(i10, null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        this.f23478a = org.telegram.ui.ActionBar.i6.l1(this.f23480c, org.telegram.ui.ActionBar.i6.v0(this.f23479b, this.d));
        int color = textPaint.getColor();
        int i10 = this.f23478a;
        if (color != i10) {
            textPaint.setColor(i10);
        }
    }

    public e10(int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f23480c = 1.0f;
        this.f23479b = i10;
        this.d = e6Var;
    }
}
