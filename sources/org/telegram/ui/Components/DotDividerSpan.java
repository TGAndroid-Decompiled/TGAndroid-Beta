package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;

public final class DotDividerSpan extends ReplacementSpan {
    public final Paint p = new Paint(1);
    public float size = 3.0f;
    public int topPadding;

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int color = paint.getColor();
        Paint paint2 = this.p;
        if (color != 0) {
            paint2.setColor(paint.getColor());
        }
        canvas.drawCircle(f + (AndroidUtilities.dpf2(this.size) / 2.0f), ((i5 - i3) / 2) + this.topPadding, AndroidUtilities.dpf2(3.0f) / 2.0f, paint2);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return AndroidUtilities.dp(this.size);
    }
}
