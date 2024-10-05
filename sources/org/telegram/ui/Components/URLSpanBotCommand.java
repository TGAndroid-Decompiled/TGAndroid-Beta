package org.telegram.ui.Components;

import android.text.TextPaint;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.TextStyleSpan;

public class URLSpanBotCommand extends URLSpanNoUnderline {
    public static boolean enabled = true;
    public int currentType;
    private TextStyleSpan.TextStyleRun style;

    public URLSpanBotCommand(String str, int i) {
        this(str, i, null);
    }

    public URLSpanBotCommand(String str, int i, TextStyleSpan.TextStyleRun textStyleRun) {
        super(str);
        this.currentType = i;
        this.style = textStyleRun;
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        int color;
        super.updateDrawState(textPaint);
        int i = this.currentType;
        if (i == 2) {
            color = -1;
        } else {
            color = Theme.getColor(i == 1 ? enabled ? Theme.key_chat_messageLinkOut : Theme.key_chat_messageTextOut : enabled ? Theme.key_chat_messageLinkIn : Theme.key_chat_messageTextIn);
        }
        textPaint.setColor(color);
        TextStyleSpan.TextStyleRun textStyleRun = this.style;
        if (textStyleRun != null) {
            textStyleRun.applyStyle(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
