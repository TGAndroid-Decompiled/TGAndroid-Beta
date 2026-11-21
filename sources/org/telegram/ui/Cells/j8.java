package org.telegram.ui.Cells;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class j8 extends CharacterStyle implements UpdateAppearance {
    public final int f30918a;
    public final org.telegram.ui.ActionBar.h6 f30919b;

    public j8(int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f30918a = i7;
        this.f30919b = h6Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(this.f30918a, this.f30919b));
        textPaint.setUnderlineText(true);
    }
}
