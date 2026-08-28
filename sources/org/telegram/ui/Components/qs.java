package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class qs extends ReplacementSpan {
    public int f32021b;
    public final Paint f32020a = new Paint(1);
    public float f32022c = 3.0f;

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int color = paint.getColor();
        Paint paint2 = this.f32020a;
        if (color != 0) {
            paint2.setColor(paint.getColor());
        }
        canvas.drawCircle(f10 + (AndroidUtilities.dpf2(this.f32022c) / 2.0f), ((i13 - i11) / 2) + this.f32021b, AndroidUtilities.dpf2(3.0f) / 2.0f, paint2);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return AndroidUtilities.dp(this.f32022c);
    }
}
