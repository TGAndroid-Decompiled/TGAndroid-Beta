package org.telegram.ui.Wallet;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class p5 extends CharacterStyle implements UpdateAppearance {
    public int f42976a;

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.f42976a);
    }
}
