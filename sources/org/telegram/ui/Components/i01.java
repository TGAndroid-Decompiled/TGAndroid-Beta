package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class i01 extends ReplacementSpan {
    public float f23846a;
    public final String f23847b;
    public final int f23848c;
    public final Paint d;

    public i01(int i10, Paint paint, String str) {
        this.f23847b = str;
        this.f23848c = i10;
        this.d = paint;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        float f10 = (i12 + i14) / 2.0f;
        paint.setColor(this.f23848c);
        float dp = AndroidUtilities.dp(19.0f) / 2.0f;
        canvas.drawRoundRect(f7, f10 - dp, f7 + this.f23846a + AndroidUtilities.dp(11.33f), f10 + dp, dp, dp, this.d);
        canvas.drawText(this.f23847b, AndroidUtilities.dpf2(5.66f) + f7, i14 - AndroidUtilities.dp(6.0f), paint);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        float dpf2 = AndroidUtilities.dpf2(11.33f);
        float measureText = paint.measureText(this.f23847b);
        this.f23846a = measureText;
        return (int) (dpf2 + measureText);
    }
}
