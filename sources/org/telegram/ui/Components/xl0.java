package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class xl0 extends Drawable {
    public final RectF f32605a = new RectF();
    public final Paint f32606b;
    public final TextPaint f32607c;
    public int d;
    public String f32608e;
    public final int f32609f;
    public int f32610g;
    public final int h;

    public xl0(int i10) {
        Paint paint = new Paint(1);
        this.f32606b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f32607c = textPaint;
        this.f32610g = 255;
        this.h = 255;
        this.f32609f = i10;
        textPaint.setTextSize(AndroidUtilities.dp(11));
        textPaint.setTypeface(AndroidUtilities.bold());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        if (i10 == 0) {
            this.f32608e = LocaleController.getString(R.string.ScamMessage);
        } else {
            this.f32608e = LocaleController.getString(R.string.FakeMessage);
        }
        this.d = (int) Math.ceil(textPaint.measureText(this.f32608e));
    }

    public final void a() {
        String string;
        if (this.f32609f == 0) {
            string = LocaleController.getString(R.string.ScamMessage);
        } else {
            string = LocaleController.getString(R.string.FakeMessage);
        }
        if (!string.equals(this.f32608e)) {
            this.f32608e = string;
            this.d = (int) Math.ceil(this.f32607c.measureText(string));
        }
    }

    public final void b(int i10) {
        this.f32607c.setColor(i10);
        this.f32606b.setColor(i10);
        this.f32610g = Color.alpha(i10);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f32605a;
        rectF.set(bounds);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), this.f32606b);
        canvas.drawText(this.f32608e, rectF.left + AndroidUtilities.dp(5.0f), rectF.top + AndroidUtilities.dp(12.0f), this.f32607c);
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(16.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(10.0f) + this.d;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        if (this.h != i10) {
            int i11 = (int) ((i10 / 255.0f) * this.f32610g);
            this.f32606b.setAlpha(i11);
            this.f32607c.setAlpha(i11);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
