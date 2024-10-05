package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.TextStyleSpan;

public class URLSpanMono extends MetricAffectingSpan {
    private int currentEnd;
    private CharSequence currentMessage;
    private int currentStart;
    private byte currentType;
    private TextStyleSpan.TextStyleRun style;

    public URLSpanMono(CharSequence charSequence, int i, int i2, byte b, TextStyleSpan.TextStyleRun textStyleRun) {
        this.currentMessage = charSequence;
        this.currentStart = i;
        this.currentEnd = i2;
        this.currentType = b;
        this.style = textStyleRun;
    }

    public void copyToClipboard() {
        AndroidUtilities.addToClipboard(this.currentMessage.subSequence(this.currentStart, this.currentEnd).toString());
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        int color;
        textPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize - 1));
        byte b = this.currentType;
        if (b == 2) {
            color = -1;
        } else {
            color = Theme.getColor(b == 1 ? Theme.key_chat_messageTextOut : Theme.key_chat_messageTextIn);
        }
        textPaint.setColor(color);
        TextStyleSpan.TextStyleRun textStyleRun = this.style;
        if (textStyleRun != null) {
            textStyleRun.applyStyle(textPaint);
        } else {
            textPaint.setTypeface(Typeface.MONOSPACE);
            textPaint.setUnderlineText(false);
        }
    }

    @Override
    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize - 1));
        textPaint.setFlags(textPaint.getFlags() | 128);
        TextStyleSpan.TextStyleRun textStyleRun = this.style;
        if (textStyleRun != null) {
            textStyleRun.applyStyle(textPaint);
        } else {
            textPaint.setTypeface(Typeface.MONOSPACE);
        }
    }
}
