package org.telegram.ui.Components;

import android.text.TextPaint;
import org.telegram.ui.ActionBar.Theme;

public final class URLSpanUserMention extends URLSpanNoUnderline {
    public final int currentType;
    public final TextStyleSpan.TextStyleRun style;

    public URLSpanUserMention(String str, int i, TextStyleSpan.TextStyleRun textStyleRun) {
        super(str, null);
        this.currentType = i;
        this.style = textStyleRun;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i = this.currentType;
        if (i == 3) {
            textPaint.setColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteLinkText, false));
        } else if (i == 2) {
            textPaint.setColor(-1);
        } else if (i == 1) {
            textPaint.setColor(Theme.getColor(null, Theme.key_chat_messageLinkOut, false));
        } else {
            textPaint.setColor(Theme.getColor(null, Theme.key_chat_messageLinkIn, false));
        }
        TextStyleSpan.TextStyleRun textStyleRun = this.style;
        if (textStyleRun != null) {
            textStyleRun.applyStyle(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
