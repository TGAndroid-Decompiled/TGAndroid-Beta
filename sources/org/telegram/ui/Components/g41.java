package org.telegram.ui.Components;

import android.text.TextPaint;
public final class g41 extends f41 {
    public g41(String str) {
        super(str != null ? str.replace((char) 8238, ' ') : str, (wy0) null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setUnderlineText(false);
    }
}
