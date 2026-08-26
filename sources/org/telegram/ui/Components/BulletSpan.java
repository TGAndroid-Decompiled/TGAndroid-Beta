package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

public final class BulletSpan implements LeadingMarginSpan {
    public final int mBulletRadius;
    public final int mGapWidth;

    public BulletSpan(int i, int i2) {
        this.mGapWidth = i;
        this.mBulletRadius = i2;
    }

    @Override
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        if (((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint.Style style = paint.getStyle();
            int color = paint.getColor();
            paint.setColor(-11491093);
            paint.setStyle(Paint.Style.FILL);
            if (layout != null) {
                i5 -= layout.getLineForOffset(i6) != layout.getLineCount() + (-1) ? (int) layout.getSpacingAdd() : 0;
            }
            float f = (i3 + i5) / 2.0f;
            int i8 = this.mBulletRadius;
            canvas.drawCircle((i2 * i8) + i, f, i8, paint);
            paint.setColor(color);
            paint.setStyle(style);
        }
    }

    @Override
    public final int getLeadingMargin(boolean z) {
        return (this.mBulletRadius * 2) + this.mGapWidth;
    }
}
