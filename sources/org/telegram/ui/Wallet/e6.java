package org.telegram.ui.Wallet;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class e6 extends CharacterStyle implements UpdateAppearance {
    public int f44123a;

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.f44123a);
    }
}
