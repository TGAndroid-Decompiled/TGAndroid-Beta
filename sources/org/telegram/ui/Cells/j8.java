package org.telegram.ui.Cells;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class j8 extends CharacterStyle implements UpdateAppearance {
    public final int f30890a;
    public final org.telegram.ui.ActionBar.i6 f30891b;

    public j8(int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f30890a = i7;
        this.f30891b = i6Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(this.f30890a, this.f30891b));
        textPaint.setUnderlineText(true);
    }
}
