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
    public final RectF f32606a = new RectF();
    public final Paint f32607b;
    public final TextPaint f32608c;
    public int d;
    public String f32609e;
    public final int f32610f;
    public int f32611g;
    public final int h;

    public xl0(int i10) {
        Paint paint = new Paint(1);
        this.f32607b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f32608c = textPaint;
        this.f32611g = 255;
        this.h = 255;
        this.f32610f = i10;
        textPaint.setTextSize(AndroidUtilities.dp(11));
        textPaint.setTypeface(AndroidUtilities.bold());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        if (i10 == 0) {
            this.f32609e = LocaleController.getString(R.string.ScamMessage);
        } else {
            this.f32609e = LocaleController.getString(R.string.FakeMessage);
        }
        this.d = (int) Math.ceil(textPaint.measureText(this.f32609e));
    }

    public final void a() {
        String string;
        if (this.f32610f == 0) {
            string = LocaleController.getString(R.string.ScamMessage);
        } else {
            string = LocaleController.getString(R.string.FakeMessage);
        }
        if (!string.equals(this.f32609e)) {
            this.f32609e = string;
            this.d = (int) Math.ceil(this.f32608c.measureText(string));
        }
    }

    public final void b(int i10) {
        this.f32608c.setColor(i10);
        this.f32607b.setColor(i10);
        this.f32611g = Color.alpha(i10);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f32606a;
        rectF.set(bounds);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), this.f32607b);
        canvas.drawText(this.f32609e, rectF.left + AndroidUtilities.dp(5.0f), rectF.top + AndroidUtilities.dp(12.0f), this.f32608c);
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
            int i11 = (int) ((i10 / 255.0f) * this.f32611g);
            this.f32607b.setAlpha(i11);
            this.f32608c.setAlpha(i11);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
