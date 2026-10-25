package org.telegram.ui.Components;

import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
public final class y61 extends x61 {
    public y61(String str) {
        super(str != null ? str.replace((char) 8238, ' ') : str, (y11) null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setUnderlineText(false);
    }
}
