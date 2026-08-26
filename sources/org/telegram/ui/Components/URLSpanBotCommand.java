package org.telegram.ui.Components;

import android.text.TextPaint;
import org.telegram.ui.ActionBar.Theme;

public final class URLSpanBotCommand extends URLSpanNoUnderline {
    public static boolean enabled = true;
    public final int currentType;
    public final TextStyleSpan.TextStyleRun style;

    public URLSpanBotCommand(String str, int i, TextStyleSpan.TextStyleRun textStyleRun) {
        super(str, null);
        this.currentType = i;
        this.style = textStyleRun;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i = this.currentType;
        if (i == 2) {
            textPaint.setColor(-1);
        } else if (i == 1) {
            textPaint.setColor(Theme.getColor(null, enabled ? Theme.key_chat_messageLinkOut : Theme.key_chat_messageTextOut, false));
        } else {
            textPaint.setColor(Theme.getColor(null, enabled ? Theme.key_chat_messageLinkIn : Theme.key_chat_messageTextIn, false));
        }
        TextStyleSpan.TextStyleRun textStyleRun = this.style;
        if (textStyleRun != null) {
            textStyleRun.applyStyle(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
