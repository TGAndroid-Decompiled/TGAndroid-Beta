package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class dz0 extends ReplacementSpan {
    public float f27847a;
    public final String f27848b;
    public final int f27849c;
    public final Paint d;

    public dz0(int i9, Paint paint, String str) {
        this.f27848b = str;
        this.f27849c = i9;
        this.d = paint;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        float f11 = (i11 + i13) / 2.0f;
        paint.setColor(this.f27849c);
        float dp = AndroidUtilities.dp(19.0f) / 2.0f;
        canvas.drawRoundRect(f10, f11 - dp, f10 + this.f27847a + AndroidUtilities.dp(11.33f), f11 + dp, dp, dp, this.d);
        canvas.drawText(this.f27848b, AndroidUtilities.dpf2(5.66f) + f10, i13 - AndroidUtilities.dp(6.0f), paint);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        float dpf2 = AndroidUtilities.dpf2(11.33f);
        float measureText = paint.measureText(this.f27848b);
        this.f27847a = measureText;
        return (int) (dpf2 + measureText);
    }
}
