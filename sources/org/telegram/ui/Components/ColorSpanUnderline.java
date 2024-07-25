package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
public class ColorSpanUnderline extends ForegroundColorSpan {
    public ColorSpanUnderline(int i) {
        super(i);
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
    }
}
