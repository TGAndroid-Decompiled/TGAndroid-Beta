package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

public final class ra implements LeadingMarginSpan {

    public final int f32117a;

    public final int f32118b;

    public ra(int i10, int i11) {
        this.f32117a = i10;
        this.f32118b = i11;
    }

    @Override
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        if (((Spanned) charSequence).getSpanStart(this) == i15) {
            Paint.Style style = paint.getStyle();
            int color = paint.getColor();
            paint.setColor(-11491093);
            paint.setStyle(Paint.Style.FILL);
            if (layout != null) {
                i14 -= layout.getLineForOffset(i15) != layout.getLineCount() + (-1) ? (int) layout.getSpacingAdd() : 0;
            }
            float f10 = (i12 + i14) / 2.0f;
            int i17 = this.f32118b;
            canvas.drawCircle((i11 * i17) + i10, f10, i17, paint);
            paint.setColor(color);
            paint.setStyle(style);
        }
    }

    @Override
    public final int getLeadingMargin(boolean z10) {
        return (this.f32118b * 2) + this.f32117a;
    }
}
