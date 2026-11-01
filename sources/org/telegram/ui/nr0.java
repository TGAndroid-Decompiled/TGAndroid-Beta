package org.telegram.ui;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
public final class nr0 implements LineHeightSpan {
    public final int f39961a;

    public nr0(int i10) {
        this.f39961a = i10;
    }

    @Override
    public final void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f39961a) {
            case 0:
                fontMetricsInt.descent = org.telegram.messenger.i0.L(4.0f) + fontMetricsInt.descent;
                fontMetricsInt.ascent = fontMetricsInt.ascent;
                return;
            default:
                fontMetricsInt.ascent -= org.telegram.messenger.i0.L(2.0f);
                fontMetricsInt.top -= org.telegram.messenger.i0.L(2.0f);
                return;
        }
    }
}
