package org.telegram.ui.Cells;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class h8 extends CharacterStyle implements UpdateAppearance {
    public final int f29350a;
    public final org.telegram.ui.ActionBar.e6 f29351b;

    public h8(int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f29350a = i3;
        this.f29351b = e6Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(this.f29350a, this.f29351b));
        textPaint.setUnderlineText(true);
    }
}
