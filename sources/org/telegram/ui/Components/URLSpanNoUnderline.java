package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLObject;

public class URLSpanNoUnderline extends URLSpan {
    public boolean forceNoUnderline;
    public String label;
    public TLObject object;
    public final TextStyleSpan.TextStyleRun style;

    public URLSpanNoUnderline(String str) {
        this(str, null);
    }

    @Override
    public void onClick(View view) {
        String url = getURL();
        if (!url.startsWith("@")) {
            Browser.openUrl(view.getContext(), url);
            return;
        }
        Browser.openUrl(view.getContext(), Uri.parse("https://t.me/" + url.substring(1)), true, true);
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        int i = textPaint.linkColor;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        TextStyleSpan.TextStyleRun textStyleRun = this.style;
        if (textStyleRun != null) {
            textStyleRun.applyStyle(textPaint);
        }
        textPaint.setUnderlineText(i == color && !this.forceNoUnderline);
    }

    public URLSpanNoUnderline(String str, TextStyleSpan.TextStyleRun textStyleRun) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.forceNoUnderline = false;
        this.style = textStyleRun;
    }
}
