package org.telegram.ui.Cells;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class i8 extends CharacterStyle implements UpdateAppearance {
    public final int f29311a;
    public final org.telegram.ui.ActionBar.f6 f29312b;

    public i8(int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f29311a = i7;
        this.f29312b = f6Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(this.f29311a, this.f29312b));
        textPaint.setUnderlineText(true);
    }
}
