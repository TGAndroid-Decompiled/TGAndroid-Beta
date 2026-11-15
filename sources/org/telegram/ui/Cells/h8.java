package org.telegram.ui.Cells;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class h8 extends CharacterStyle implements UpdateAppearance {
    public final int f30409a;
    public final org.telegram.ui.ActionBar.e6 f30410b;

    public h8(int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f30409a = i7;
        this.f30410b = e6Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(this.f30409a, this.f30410b));
        textPaint.setUnderlineText(true);
    }
}
