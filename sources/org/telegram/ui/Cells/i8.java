package org.telegram.ui.Cells;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class i8 extends CharacterStyle implements UpdateAppearance {
    public final int f30826a;
    public final org.telegram.ui.ActionBar.i6 f30827b;

    public i8(int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f30826a = i7;
        this.f30827b = i6Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(this.f30826a, this.f30827b));
        textPaint.setUnderlineText(true);
    }
}
