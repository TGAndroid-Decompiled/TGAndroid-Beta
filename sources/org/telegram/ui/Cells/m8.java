package org.telegram.ui.Cells;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class m8 extends CharacterStyle implements UpdateAppearance {
    public final int f22316a;
    public final org.telegram.ui.ActionBar.p6 f22317b;

    public m8(int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        this.f22316a = i10;
        this.f22317b = p6Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(this.f22316a, this.f22317b));
        textPaint.setUnderlineText(true);
    }
}
