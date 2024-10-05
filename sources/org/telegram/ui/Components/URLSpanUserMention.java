package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.Components.TextStyleSpan;

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
    public void updateDrawState(android.text.TextPaint r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.URLSpanUserMention.updateDrawState(android.text.TextPaint):void");
    }
}
