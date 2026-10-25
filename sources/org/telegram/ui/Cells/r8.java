package org.telegram.ui.Cells;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class r8 extends CharacterStyle implements UpdateAppearance {
    public final int f24994a;
    public final org.telegram.ui.ActionBar.u6 f24995b;

    public r8(int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        this.f24994a = i10;
        this.f24995b = u6Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(org.telegram.ui.ActionBar.y6.w0(this.f24994a, this.f24995b));
        textPaint.setUnderlineText(true);
    }
}
