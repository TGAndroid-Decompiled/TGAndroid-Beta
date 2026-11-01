package org.telegram.ui.Cells;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class m8 extends CharacterStyle implements UpdateAppearance {
    public final int f22317a;
    public final org.telegram.ui.ActionBar.p6 f22318b;

    public m8(int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        this.f22317a = i10;
        this.f22318b = p6Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(this.f22317a, this.f22318b));
        textPaint.setUnderlineText(true);
    }
}
