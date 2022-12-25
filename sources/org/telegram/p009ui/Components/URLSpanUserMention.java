package org.telegram.p009ui.Components;

import android.text.TextPaint;
import android.view.View;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.TextStyleSpan;

public class URLSpanUserMention extends URLSpanNoUnderline {
    private int currentType;
    private TextStyleSpan.TextStyleRun style;

    public URLSpanUserMention(String str, int i) {
        this(str, i, null);
    }

    public URLSpanUserMention(String str, int i, TextStyleSpan.TextStyleRun textStyleRun) {
        super(str);
        this.currentType = i;
        this.style = textStyleRun;
    }

    @Override
    public void onClick(View view) {
        super.onClick(view);
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i = this.currentType;
        if (i == 3) {
            textPaint.setColor(Theme.getColor("windowBackgroundWhiteLinkText"));
        } else if (i == 2) {
            textPaint.setColor(-1);
        } else if (i == 1) {
            textPaint.setColor(Theme.getColor("chat_messageLinkOut"));
        } else {
            textPaint.setColor(Theme.getColor("chat_messageLinkIn"));
        }
        TextStyleSpan.TextStyleRun textStyleRun = this.style;
        if (textStyleRun != null) {
            textStyleRun.applyStyle(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
