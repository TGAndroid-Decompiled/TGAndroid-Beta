package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class f10 extends CharacterStyle implements UpdateAppearance {
    public int f24766a;
    public int f24767b;
    public float f24768c;
    public final org.telegram.ui.ActionBar.f6 d;

    public f10(int i10) {
        this(i10, null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        this.f24766a = org.telegram.ui.ActionBar.j6.l1(this.f24768c, org.telegram.ui.ActionBar.j6.v0(this.f24767b, this.d));
        int color = textPaint.getColor();
        int i10 = this.f24766a;
        if (color != i10) {
            textPaint.setColor(i10);
        }
    }

    public f10(int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f24768c = 1.0f;
        this.f24767b = i10;
        this.d = f6Var;
    }
}
