package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.ui.ActionBar.Theme;

public final class EllipsizeSpanAnimator$TextAlphaSpan extends CharacterStyle {
    public final int $r8$classId;
    public int alpha;

    public EllipsizeSpanAnimator$TextAlphaSpan(int i, int i2) {
        this.$r8$classId = i2;
        this.alpha = i;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.$r8$classId) {
            case 0:
                textPaint.setAlpha((int) ((this.alpha / 255.0f) * textPaint.getAlpha()));
                break;
            default:
                textPaint.setColor(Theme.multAlpha(textPaint.getAlpha() / 255.0f, this.alpha));
                break;
        }
    }

    public EllipsizeSpanAnimator$TextAlphaSpan() {
        this.$r8$classId = 0;
        this.alpha = 0;
    }
}
