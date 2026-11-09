package org.telegram.ui.Cells;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class i8 extends CharacterStyle implements UpdateAppearance {
    public final int f29319a;
    public final org.telegram.ui.ActionBar.g6 f29320b;

    public i8(int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f29319a = i7;
        this.f29320b = g6Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(org.telegram.ui.ActionBar.l6.w0(this.f29319a, this.f29320b));
        textPaint.setUnderlineText(true);
    }
}
