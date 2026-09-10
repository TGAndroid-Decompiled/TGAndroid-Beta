package org.telegram.ui;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import org.telegram.messenger.AndroidUtilities;
public final class ju0 implements LineHeightSpan {
    public final int f34163a;

    public ju0(int i10) {
        this.f34163a = i10;
    }

    @Override
    public final void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f34163a) {
            case 0:
                fontMetricsInt.descent = AndroidUtilities.dp(4.0f) + fontMetricsInt.descent;
                fontMetricsInt.ascent = fontMetricsInt.ascent;
                return;
            default:
                fontMetricsInt.ascent -= AndroidUtilities.dp(2.0f);
                fontMetricsInt.top -= AndroidUtilities.dp(2.0f);
                return;
        }
    }
}
