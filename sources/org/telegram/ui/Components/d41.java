package org.telegram.ui.Components;

import android.text.TextPaint;
public final class d41 extends c41 {
    public d41(String str) {
        super(str != null ? str.replace((char) 8238, ' ') : str, (vy0) null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setUnderlineText(false);
    }
}
