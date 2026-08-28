package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public class l00 extends ReplacementSpan {
    public final TextPaint f39959a;
    public final Paint f39960b;
    public StaticLayout f39961c;
    public float d;
    public float f39962e;
    public int f39963f;
    public final int h;
    public CharSequence f39964n;

    public l00(int i9) {
        TextPaint textPaint = new TextPaint(1);
        this.f39959a = textPaint;
        Paint paint = new Paint(1);
        this.f39960b = paint;
        this.f39964n = "NEW";
        this.h = i9;
        textPaint.setTypeface(AndroidUtilities.bold());
        paint.setStyle(Paint.Style.FILL);
        textPaint.setTextSize(AndroidUtilities.dp(i9 < 0 ? 12.0f : i9));
    }

    public final void a() {
        if (this.f39961c == null) {
            StaticLayout staticLayout = new StaticLayout(this.f39964n, this.f39959a, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f39961c = staticLayout;
            this.d = staticLayout.getLineWidth(0);
            this.f39962e = this.f39961c.getHeight();
        }
    }

    @Override
    public void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int i14;
        float f11;
        a();
        int i15 = this.f39963f;
        if (i15 == 0) {
            i15 = paint.getColor();
        }
        Paint paint2 = this.f39960b;
        paint2.setColor(i15);
        if (AndroidUtilities.computePerceivedBrightness(i15) > 0.721f) {
            i14 = -16777216;
        } else {
            i14 = -1;
        }
        TextPaint textPaint = this.f39959a;
        textPaint.setColor(i14);
        paint2.setAlpha((int) (paint2.getAlpha() * 1.0f));
        textPaint.setAlpha((int) (textPaint.getAlpha() * 1.0f));
        float dp = f10 + AndroidUtilities.dp(2.0f);
        float dp2 = (i12 - this.f39962e) + AndroidUtilities.dp(1.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(dp, dp2, this.d + dp, this.f39962e + dp2);
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
        this.f39961c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        a();
        return (int) (AndroidUtilities.dp(10.0f) + this.d);
    }

    public l00() {
        TextPaint textPaint = new TextPaint(1);
        this.f39959a = textPaint;
        Paint paint = new Paint(1);
        this.f39960b = paint;
        this.f39964n = "NEW";
        textPaint.setTypeface(AndroidUtilities.bold());
        paint.setStyle(Paint.Style.FILL);
        textPaint.setTextSize(AndroidUtilities.dp(10.0f));
    }
}
