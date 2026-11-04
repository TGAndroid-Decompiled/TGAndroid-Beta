package org.telegram.ui.Wallet;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class n5 extends CharacterStyle implements UpdateAppearance {
    public int f42933a;

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.f42933a);
    }
}
