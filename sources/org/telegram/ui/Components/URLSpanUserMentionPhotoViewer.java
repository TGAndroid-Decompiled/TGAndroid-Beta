package org.telegram.ui.Components;

import android.text.TextPaint;
public class URLSpanUserMentionPhotoViewer extends URLSpanUserMention {
    public URLSpanUserMentionPhotoViewer(String str, boolean z) {
        super(str, 2);
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(-1);
        textPaint.setUnderlineText(false);
    }
}
