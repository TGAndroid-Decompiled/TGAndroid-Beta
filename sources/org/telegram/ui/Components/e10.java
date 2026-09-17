package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class e10 extends CharacterStyle implements UpdateAppearance {
    public int f25511a;
    public int f25512b;
    public float f25513c;
    public final org.telegram.ui.ActionBar.f6 d;

    public e10(int i10) {
        this(i10, null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        this.f25511a = org.telegram.ui.ActionBar.j6.l1(this.f25513c, org.telegram.ui.ActionBar.j6.v0(this.f25512b, this.d));
        int color = textPaint.getColor();
        int i10 = this.f25511a;
        if (color != i10) {
            textPaint.setColor(i10);
        }
    }

    public e10(int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f25513c = 1.0f;
        this.f25512b = i10;
        this.d = f6Var;
    }
}
