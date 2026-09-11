package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
public final class cb implements LeadingMarginSpan {
    public final int f24958a;
    public final int f24959b;

    public cb(int i10, int i11) {
        this.f24958a = i10;
        this.f24959b = i11;
    }

    @Override
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        int i17;
        if (((Spanned) charSequence).getSpanStart(this) == i15) {
            Paint.Style style = paint.getStyle();
            int color = paint.getColor();
            paint.setColor(-11491093);
            paint.setStyle(Paint.Style.FILL);
            if (layout != null) {
                if (layout.getLineForOffset(i15) != layout.getLineCount() - 1) {
                    i17 = (int) layout.getSpacingAdd();
                } else {
                    i17 = 0;
                }
                i14 -= i17;
            }
            int i18 = this.f24959b;
            canvas.drawCircle((i11 * i18) + i10, (i12 + i14) / 2.0f, i18, paint);
            paint.setColor(color);
            paint.setStyle(style);
        }
    }

    @Override
    public final int getLeadingMargin(boolean z10) {
        return (this.f24959b * 2) + this.f24958a;
    }
}
