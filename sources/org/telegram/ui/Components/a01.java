package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class a01 extends ReplacementSpan {
    public float f23231a;
    public final String f23232b;
    public final int f23233c;
    public final Paint d;

    public a01(int i10, Paint paint, String str) {
        this.f23232b = str;
        this.f23233c = i10;
        this.d = paint;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        float f11 = (i12 + i14) / 2.0f;
        paint.setColor(this.f23233c);
        float dp = AndroidUtilities.dp(19.0f) / 2.0f;
        canvas.drawRoundRect(f10, f11 - dp, f10 + this.f23231a + AndroidUtilities.dp(11.33f), f11 + dp, dp, dp, this.d);
        canvas.drawText(this.f23232b, AndroidUtilities.dpf2(5.66f) + f10, i14 - AndroidUtilities.dp(6.0f), paint);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        float dpf2 = AndroidUtilities.dpf2(11.33f);
        float measureText = paint.measureText(this.f23232b);
        this.f23231a = measureText;
        return (int) (dpf2 + measureText);
    }
}
