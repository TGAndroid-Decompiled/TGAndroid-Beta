package org.telegram.p009ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

public class BulletSpan implements LeadingMarginSpan {
    private final int mBulletRadius;
    private final int mColor;
    private final int mGapWidth;
    private final boolean mWantColor;

    public BulletSpan(int i, int i2, int i3) {
        this(i, i2, true, i3);
    }

    private BulletSpan(int i, int i2, boolean z, int i3) {
        this.mGapWidth = i;
        this.mBulletRadius = i3;
        this.mColor = i2;
        this.mWantColor = z;
    }

    @Override
    public int getLeadingMargin(boolean z) {
        return (this.mBulletRadius * 2) + this.mGapWidth;
    }

    @Override
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        if (((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint.Style style = paint.getStyle();
            if (this.mWantColor) {
                i8 = paint.getColor();
                paint.setColor(this.mColor);
            } else {
                i8 = 0;
            }
            paint.setStyle(Paint.Style.FILL);
            if (layout != null) {
                i5 -= layout.getLineForOffset(i6) != layout.getLineCount() + (-1) ? (int) layout.getSpacingAdd() : 0;
            }
            int i9 = this.mBulletRadius;
            canvas.drawCircle(i + (i2 * i9), (i3 + i5) / 2.0f, i9, paint);
            if (this.mWantColor) {
                paint.setColor(i8);
            }
            paint.setStyle(style);
        }
    }
}
