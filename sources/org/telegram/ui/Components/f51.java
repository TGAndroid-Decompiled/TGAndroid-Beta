package org.telegram.ui.Components;

import android.text.TextPaint;
public final class f51 extends e51 {
    public f51(String str) {
        super(str != null ? str.replace((char) 8238, ' ') : str, (yz0) null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        textPaint.setUnderlineText(false);
    }
}
