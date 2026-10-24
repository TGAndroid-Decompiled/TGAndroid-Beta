package org.telegram.ui.Cells;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class n8 extends CharacterStyle implements UpdateAppearance {
    public final int f22817a;
    public final org.telegram.ui.ActionBar.g6 f22818b;

    public n8(int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f22817a = i10;
        this.f22818b = g6Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(this.f22817a, this.f22818b));
        textPaint.setUnderlineText(true);
    }
}
