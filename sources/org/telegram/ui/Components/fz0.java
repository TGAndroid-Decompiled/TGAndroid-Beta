package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;

public final class fz0 extends ReplacementSpan {

    public float f28471a;

    public final String f28472b;

    public final int f28473c;
    public final Paint d;

    public fz0(int i10, Paint paint, String str) {
        this.f28472b = str;
        this.f28473c = i10;
        this.d = paint;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        float f11 = (i12 + i14) / 2.0f;
        float fDp = AndroidUtilities.dp(19.0f);
        paint.setColor(this.f28473c);
        float f12 = fDp / 2.0f;
        canvas.drawRoundRect(f10, f11 - f12, f10 + this.f28471a + AndroidUtilities.dp(11.33f), f11 + f12, f12, f12, this.d);
        canvas.drawText(this.f28472b, AndroidUtilities.dpf2(5.66f) + f10, i14 - AndroidUtilities.dp(6.0f), paint);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        float fDpf2 = AndroidUtilities.dpf2(11.33f);
        float fMeasureText = paint.measureText(this.f28472b);
        this.f28471a = fMeasureText;
        return (int) (fDpf2 + fMeasureText);
    }
}
