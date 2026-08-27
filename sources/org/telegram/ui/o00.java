package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;

public class o00 extends ReplacementSpan {

    public final TextPaint f40966a;

    public final Paint f40967b;

    public StaticLayout f40968c;
    public float d;

    public float f40969e;

    public int f40970f;
    public final int h;

    public CharSequence f40971n;

    public o00(int i10) {
        TextPaint textPaint = new TextPaint(1);
        this.f40966a = textPaint;
        Paint paint = new Paint(1);
        this.f40967b = paint;
        this.f40971n = "NEW";
        this.h = i10;
        textPaint.setTypeface(AndroidUtilities.bold());
        paint.setStyle(Paint.Style.FILL);
        textPaint.setTextSize(AndroidUtilities.dp(i10 < 0 ? 12.0f : i10));
    }

    public final void a() {
        if (this.f40968c == null) {
            StaticLayout staticLayout = new StaticLayout(this.f40971n, this.f40966a, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f40968c = staticLayout;
            this.d = staticLayout.getLineWidth(0);
            this.f40969e = this.f40968c.getHeight();
        }
    }

    @Override
    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        a();
        int color = this.f40970f;
        if (color == 0) {
            color = paint.getColor();
        }
        Paint paint2 = this.f40967b;
        paint2.setColor(color);
        int i15 = AndroidUtilities.computePerceivedBrightness(color) > 0.721f ? -16777216 : -1;
        TextPaint textPaint = this.f40966a;
        textPaint.setColor(i15);
        paint2.setAlpha((int) (paint2.getAlpha() * 1.0f));
        textPaint.setAlpha((int) (textPaint.getAlpha() * 1.0f));
        float fDp = f10 + AndroidUtilities.dp(2.0f);
        float fDp2 = (i13 - this.f40969e) + AndroidUtilities.dp(1.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(fDp, fDp2, this.d + fDp, this.f40969e + fDp2);
        float fDp3 = AndroidUtilities.dp(4.4f);
        rectF.inset(AndroidUtilities.dp(-4.0f), AndroidUtilities.dp(this.h == 8 ? -3.66f : -2.33f));
        canvas.drawRoundRect(rectF, fDp3, fDp3, paint2);
        canvas.save();
        canvas.translate(fDp, fDp2);
        this.f40968c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        a();
        return (int) (AndroidUtilities.dp(10.0f) + this.d);
    }

    public o00() {
        TextPaint textPaint = new TextPaint(1);
        this.f40966a = textPaint;
        Paint paint = new Paint(1);
        this.f40967b = paint;
        this.f40971n = "NEW";
        textPaint.setTypeface(AndroidUtilities.bold());
        paint.setStyle(Paint.Style.FILL);
        textPaint.setTextSize(AndroidUtilities.dp(10.0f));
    }
}
