package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public class a10 extends ReplacementSpan {
    public final TextPaint f32413a;
    public final Paint f32414b;
    public StaticLayout f32415c;
    public float d;
    public float e;
    public int f32416f;
    public final int h;
    public CharSequence f32417n;

    public a10(int i10) {
        TextPaint textPaint = new TextPaint(1);
        this.f32413a = textPaint;
        Paint paint = new Paint(1);
        this.f32414b = paint;
        this.f32417n = "NEW";
        this.h = i10;
        textPaint.setTypeface(AndroidUtilities.bold());
        paint.setStyle(Paint.Style.FILL);
        textPaint.setTextSize(AndroidUtilities.dp(i10 < 0 ? 12.0f : i10));
    }

    public final void a() {
        if (this.f32415c == null) {
            StaticLayout staticLayout = new StaticLayout(this.f32417n, this.f32413a, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f32415c = staticLayout;
            this.d = staticLayout.getLineWidth(0);
            this.e = this.f32415c.getHeight();
        }
    }

    @Override
    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        int i15;
        float f11;
        a();
        int i16 = this.f32416f;
        if (i16 == 0) {
            i16 = paint.getColor();
        }
        Paint paint2 = this.f32414b;
        paint2.setColor(i16);
        if (AndroidUtilities.computePerceivedBrightness(i16) > 0.721f) {
            i15 = -16777216;
        } else {
            i15 = -1;
        }
        TextPaint textPaint = this.f32413a;
        textPaint.setColor(i15);
        paint2.setAlpha((int) (paint2.getAlpha() * 1.0f));
        textPaint.setAlpha((int) (textPaint.getAlpha() * 1.0f));
        float dp = f10 + AndroidUtilities.dp(2.0f);
        float dp2 = (i13 - this.e) + AndroidUtilities.dp(1.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(dp, dp2, this.d + dp, this.e + dp2);
        float dp3 = AndroidUtilities.dp(4.4f);
        float dp4 = AndroidUtilities.dp(-4.0f);
        if (this.h == 8) {
            f11 = -3.66f;
        } else {
            f11 = -2.33f;
        }
        rectF.inset(dp4, AndroidUtilities.dp(f11));
        canvas.drawRoundRect(rectF, dp3, dp3, paint2);
        canvas.save();
        canvas.translate(dp, dp2);
        this.f32415c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        a();
        return (int) (AndroidUtilities.dp(10.0f) + this.d);
    }

    public a10() {
        TextPaint textPaint = new TextPaint(1);
        this.f32413a = textPaint;
        Paint paint = new Paint(1);
        this.f32414b = paint;
        this.f32417n = "NEW";
        textPaint.setTypeface(AndroidUtilities.bold());
        paint.setStyle(Paint.Style.FILL);
        textPaint.setTextSize(AndroidUtilities.dp(10.0f));
    }
}
