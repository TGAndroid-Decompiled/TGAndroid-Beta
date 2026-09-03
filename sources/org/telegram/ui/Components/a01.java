package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class a01 extends ReplacementSpan {
    public float f25095a;
    public final String f25096b;
    public final int f25097c;
    public final Paint d;

    public a01(int i10, Paint paint, String str) {
        this.f25096b = str;
        this.f25097c = i10;
        this.d = paint;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        float f11 = (i12 + i14) / 2.0f;
        paint.setColor(this.f25097c);
        float dp = AndroidUtilities.dp(19.0f) / 2.0f;
        canvas.drawRoundRect(f10, f11 - dp, f10 + this.f25095a + AndroidUtilities.dp(11.33f), f11 + dp, dp, dp, this.d);
        canvas.drawText(this.f25096b, AndroidUtilities.dpf2(5.66f) + f10, i14 - AndroidUtilities.dp(6.0f), paint);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        float dpf2 = AndroidUtilities.dpf2(11.33f);
        float measureText = paint.measureText(this.f25096b);
        this.f25095a = measureText;
        return (int) (dpf2 + measureText);
    }
}
