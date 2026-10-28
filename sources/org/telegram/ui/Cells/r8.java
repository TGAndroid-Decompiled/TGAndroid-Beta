package org.telegram.ui.Cells;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class r8 extends CharacterStyle implements UpdateAppearance {
    public final int f24998a;
    public final org.telegram.ui.ActionBar.u6 f24999b;

    public r8(int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        this.f24998a = i10;
        this.f24999b = u6Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(org.telegram.ui.ActionBar.y6.w0(this.f24998a, this.f24999b));
        textPaint.setUnderlineText(true);
    }
}
