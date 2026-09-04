package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class at extends ReplacementSpan {
    public int f24453b;
    public final Paint f24452a = new Paint(1);
    public float f24454c = 3.0f;

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int color = paint.getColor();
        Paint paint2 = this.f24452a;
        if (color != 0) {
            paint2.setColor(paint.getColor());
        }
        canvas.drawCircle(f7 + (AndroidUtilities.dpf2(this.f24454c) / 2.0f), ((i14 - i12) / 2) + this.f24453b, AndroidUtilities.dpf2(3.0f) / 2.0f, paint2);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return AndroidUtilities.dp(this.f24454c);
    }
}
