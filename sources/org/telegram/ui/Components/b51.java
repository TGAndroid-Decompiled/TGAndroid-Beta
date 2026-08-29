package org.telegram.ui.Components;

import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
public final class b51 extends a51 {
    public b51(String str) {
        super(str != null ? str.replace((char) 8238, ' ') : str, (h01) null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setUnderlineText(false);
    }
}
