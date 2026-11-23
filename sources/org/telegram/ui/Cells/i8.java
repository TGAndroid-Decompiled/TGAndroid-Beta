package org.telegram.ui.Cells;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class i8 extends CharacterStyle implements UpdateAppearance {
    public final int f30921a;
    public final org.telegram.ui.ActionBar.i6 f30922b;

    public i8(int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f30921a = i7;
        this.f30922b = i6Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(this.f30921a, this.f30922b));
        textPaint.setUnderlineText(true);
    }
}
