package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
public final class r2 extends ReplacementSpan {
    public final int f30260a;

    public r2(int i3) {
        this.f30260a = i3;
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i3, int i10, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt == null) {
            fontMetricsInt = paint.getFontMetricsInt();
        }
        if (fontMetricsInt != null) {
            int i11 = 1 - (fontMetricsInt.descent - fontMetricsInt.ascent);
            fontMetricsInt.descent = i11;
            fontMetricsInt.bottom = i11;
            fontMetricsInt.ascent = -1;
            fontMetricsInt.top = -1;
        }
        return this.f30260a;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i10, float f10, int i11, int i12, int i13, Paint paint) {
    }
}
