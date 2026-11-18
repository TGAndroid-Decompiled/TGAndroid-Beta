package org.telegram.ui.Cells;

import android.text.TextPaint;
import org.telegram.ui.Components.i00;
public final class u3 extends i00 {
    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
    }
}
