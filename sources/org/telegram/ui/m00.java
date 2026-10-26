package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public class m00 extends ReplacementSpan {
    public final TextPaint f41418a;
    public final Paint f41419b;
    public StaticLayout f41420c;
    public float d;
    public float e;
    public int f41421f;
    public final int h;
    public boolean f41422n;
    public int f41423r;
    public org.telegram.ui.ActionBar.u6 f41424s;
    public CharSequence v;

    public m00(int i10) {
        TextPaint textPaint = new TextPaint(1);
        this.f41418a = textPaint;
        Paint paint = new Paint(1);
        this.f41419b = paint;
        this.v = "NEW";
        this.h = i10;
        textPaint.setTypeface(AndroidUtilities.bold());
        paint.setStyle(Paint.Style.FILL);
        textPaint.setTextSize(AndroidUtilities.dp(i10 < 0 ? 12.0f : i10));
    }

    public final void a() {
        if (this.f41420c == null) {
            StaticLayout staticLayout = new StaticLayout(this.v, this.f41418a, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f41420c = staticLayout;
            this.d = staticLayout.getLineWidth(0);
            this.e = this.f41420c.getHeight();
        }
    }

    @Override
    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int i15;
        float f10;
        a();
        if (this.f41422n) {
            this.f41421f = org.telegram.ui.ActionBar.y6.w0(this.f41423r, this.f41424s);
        }
        int i16 = this.f41421f;
        if (i16 == 0) {
            i16 = paint.getColor();
        }
        Paint paint2 = this.f41419b;
        paint2.setColor(i16);
        if (AndroidUtilities.computePerceivedBrightness(i16) > 0.721f) {
            i15 = -16777216;
        } else {
            i15 = -1;
        }
        TextPaint textPaint = this.f41418a;
        textPaint.setColor(i15);
        paint2.setAlpha((int) (paint2.getAlpha() * 1.0f));
        textPaint.setAlpha((int) (textPaint.getAlpha() * 1.0f));
        float dp = f7 + AndroidUtilities.dp(2.0f);
        float dp2 = (i13 - this.e) + AndroidUtilities.dp(1.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(dp, dp2, this.d + dp, this.e + dp2);
        float dp3 = AndroidUtilities.dp(4.4f);
        float dp4 = AndroidUtilities.dp(-4.0f);
        if (this.h == 8) {
            f10 = -3.66f;
        } else {
            f10 = -2.33f;
        }
        rectF.inset(dp4, AndroidUtilities.dp(f10));
        canvas.drawRoundRect(rectF, dp3, dp3, paint2);
        canvas.save();
        canvas.translate(dp, dp2);
        this.f41420c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        a();
        return (int) (AndroidUtilities.dp(10.0f) + this.d);
    }

    public m00() {
        TextPaint textPaint = new TextPaint(1);
        this.f41418a = textPaint;
        Paint paint = new Paint(1);
        this.f41419b = paint;
        this.v = "NEW";
        textPaint.setTypeface(AndroidUtilities.bold());
        paint.setStyle(Paint.Style.FILL);
        textPaint.setTextSize(AndroidUtilities.dp(10.0f));
    }
}
