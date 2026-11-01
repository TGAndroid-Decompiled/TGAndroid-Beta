package org.telegram.ui.Components;

import android.text.TextPaint;
public final class g51 extends f51 {
    public g51(String str) {
        super(str != null ? str.replace((char) 8238, ' ') : str, (zz0) null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        textPaint.setUnderlineText(false);
    }
}
