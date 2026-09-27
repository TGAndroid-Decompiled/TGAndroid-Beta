package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class g10 extends CharacterStyle implements UpdateAppearance {
    public int f24427a;
    public int f24428b;
    public float f24429c;
    public final org.telegram.ui.ActionBar.e6 d;

    public g10(int i10) {
        this(i10, null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        this.f24427a = org.telegram.ui.ActionBar.i6.l1(this.f24429c, org.telegram.ui.ActionBar.i6.v0(this.f24428b, this.d));
        int color = textPaint.getColor();
        int i10 = this.f24427a;
        if (color != i10) {
            textPaint.setColor(i10);
        }
    }

    public g10(int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f24429c = 1.0f;
        this.f24428b = i10;
        this.d = e6Var;
    }
}
