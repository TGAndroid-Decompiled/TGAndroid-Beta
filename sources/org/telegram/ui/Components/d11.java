package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class d11 extends ReplacementSpan {
    public float f27329a;
    public final String f27330b;
    public final int f27331c;
    public final Paint d;

    public d11(int i10, Paint paint, String str) {
        this.f27330b = str;
        this.f27331c = i10;
        this.d = paint;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        float f10 = (i12 + i14) / 2.0f;
        paint.setColor(this.f27331c);
        float dp = AndroidUtilities.dp(19.0f) / 2.0f;
        canvas.drawRoundRect(f7, f10 - dp, f7 + this.f27329a + AndroidUtilities.dp(11.33f), f10 + dp, dp, dp, this.d);
        canvas.drawText(this.f27330b, AndroidUtilities.dpf2(5.66f) + f7, i14 - AndroidUtilities.dp(6.0f), paint);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        float dpf2 = AndroidUtilities.dpf2(11.33f);
        float measureText = paint.measureText(this.f27330b);
        this.f27329a = measureText;
        return (int) (dpf2 + measureText);
    }
}
