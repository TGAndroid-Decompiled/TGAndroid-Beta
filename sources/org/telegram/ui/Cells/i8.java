package org.telegram.ui.Cells;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class i8 extends CharacterStyle implements UpdateAppearance {
    public final int f29315a;
    public final org.telegram.ui.ActionBar.f6 f29316b;

    public i8(int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f29315a = i7;
        this.f29316b = f6Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(this.f29315a, this.f29316b));
        textPaint.setUnderlineText(true);
    }
}
