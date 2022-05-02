package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.TextStyleSpan;

public class URLSpanNoUnderline extends URLSpan {
    private boolean forceNoUnderline;
    private TLObject object;
    private TextStyleSpan.TextStyleRun style;

    public URLSpanNoUnderline(String str) {
        this(str, (TextStyleSpan.TextStyleRun) null);
    }

    public URLSpanNoUnderline(String str, boolean z) {
        this(str, (TextStyleSpan.TextStyleRun) null);
        this.forceNoUnderline = z;
    }

    public URLSpanNoUnderline(String str, TextStyleSpan.TextStyleRun textStyleRun) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.forceNoUnderline = false;
        this.style = textStyleRun;
    }

    @Override
    public void onClick(View view) {
        String url = getURL();
        if (url.startsWith("@")) {
            Browser.openUrl(view.getContext(), Uri.parse("https://t.me/" + url.substring(1)));
            return;
        }
        Browser.openUrl(view.getContext(), url);
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

    public void setObject(TLObject tLObject) {
        this.object = tLObject;
    }

    public TLObject getObject() {
        return this.object;
    }
}
