package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class pz0 extends ReplacementSpan {
    public float f31807a;
    public final String f31808b;
    public final int f31809c;
    public final Paint d;

    public pz0(int i10, Paint paint, String str) {
        this.f31808b = str;
        this.f31809c = i10;
        this.d = paint;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f9, int i12, int i13, int i14, Paint paint) {
        float f10 = (i12 + i14) / 2.0f;
        paint.setColor(this.f31809c);
        float dp = AndroidUtilities.dp(19.0f) / 2.0f;
        canvas.drawRoundRect(f9, f10 - dp, f9 + this.f31807a + AndroidUtilities.dp(11.33f), f10 + dp, dp, dp, this.d);
        canvas.drawText(this.f31808b, AndroidUtilities.dpf2(5.66f) + f9, i14 - AndroidUtilities.dp(6.0f), paint);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        float dpf2 = AndroidUtilities.dpf2(11.33f);
        float measureText = paint.measureText(this.f31808b);
        this.f31807a = measureText;
        return (int) (dpf2 + measureText);
    }
}
