package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.browser.Browser;
import org.telegram.ui.LaunchActivity;

public final class URLSpanReplacement extends URLSpan {
    public boolean navigateToPremiumBot;
    public final TextStyleSpan.TextStyleRun style;

    public URLSpanReplacement(String str, TextStyleSpan.TextStyleRun textStyleRun) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.style = textStyleRun;
    }

    @Override
    public final void onClick(View view) {
        if (this.navigateToPremiumBot && (view.getContext() instanceof LaunchActivity)) {
            ((LaunchActivity) view.getContext()).navigateToPremiumBot = true;
        }
        Browser.openUrl(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        TextStyleSpan.TextStyleRun textStyleRun = this.style;
        if (textStyleRun != null) {
            textStyleRun.applyStyle(textPaint);
            textPaint.setUnderlineText(textPaint.linkColor == color);
        }
    }
}
