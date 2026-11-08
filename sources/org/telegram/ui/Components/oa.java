package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
public final class oa implements LeadingMarginSpan {
    public final int f36598a;
    public final int f36599b;

    public oa(int i7, int i10) {
        this.f36598a = i7;
        this.f36599b = i10;
    }

    @Override
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i7, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14, int i15, boolean z9, Layout layout) {
        int i16;
        if (((Spanned) charSequence).getSpanStart(this) == i14) {
            Paint.Style style = paint.getStyle();
            int color = paint.getColor();
            paint.setColor(-11491093);
            paint.setStyle(Paint.Style.FILL);
            if (layout != null) {
                if (layout.getLineForOffset(i14) != layout.getLineCount() - 1) {
                    i16 = (int) layout.getSpacingAdd();
                } else {
                    i16 = 0;
                }
                i13 -= i16;
            }
            int i17 = this.f36599b;
            canvas.drawCircle((i10 * i17) + i7, (i11 + i13) / 2.0f, i17, paint);
            paint.setColor(color);
            paint.setStyle(style);
        }
    }

    @Override
    public final int getLeadingMargin(boolean z9) {
        return (this.f36599b * 2) + this.f36598a;
    }
}
