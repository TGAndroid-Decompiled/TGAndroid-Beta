package org.telegram.ui.Cells;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class j8 extends CharacterStyle implements UpdateAppearance {
    public final int f30921a;
    public final org.telegram.ui.ActionBar.h6 f30922b;

    public j8(int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f30921a = i7;
        this.f30922b = h6Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(this.f30921a, this.f30922b));
        textPaint.setUnderlineText(true);
    }
}
