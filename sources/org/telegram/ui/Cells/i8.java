package org.telegram.ui.Cells;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class i8 extends CharacterStyle implements UpdateAppearance {
    public final int f29330a;
    public final org.telegram.ui.ActionBar.h6 f29331b;

    public i8(int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f29330a = i7;
        this.f29331b = h6Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(this.f29330a, this.f29331b));
        textPaint.setUnderlineText(true);
    }
}
