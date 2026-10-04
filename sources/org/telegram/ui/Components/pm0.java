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
public final class pm0 extends Drawable {
    public final RectF f29666a = new RectF();
    public final Paint f29667b;
    public final TextPaint f29668c;
    public int d;
    public String f29669e;
    public final int f29670f;
    public int f29671g;
    public final int h;

    public pm0(int i10) {
        Paint paint = new Paint(1);
        this.f29667b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f29668c = textPaint;
        this.f29671g = 255;
        this.h = 255;
        this.f29670f = i10;
        textPaint.setTextSize(AndroidUtilities.dp(11));
        textPaint.setTypeface(AndroidUtilities.bold());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        if (i10 == 0) {
            this.f29669e = LocaleController.getString(R.string.ScamMessage);
        } else {
            this.f29669e = LocaleController.getString(R.string.FakeMessage);
        }
        this.d = (int) Math.ceil(textPaint.measureText(this.f29669e));
    }

    public final void a() {
        String string;
        if (this.f29670f == 0) {
            string = LocaleController.getString(R.string.ScamMessage);
        } else {
            string = LocaleController.getString(R.string.FakeMessage);
        }
        if (!string.equals(this.f29669e)) {
            this.f29669e = string;
            this.d = (int) Math.ceil(this.f29668c.measureText(string));
        }
    }

    public final void b(int i10) {
        this.f29668c.setColor(i10);
        this.f29667b.setColor(i10);
        this.f29671g = Color.alpha(i10);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f29666a;
        rectF.set(bounds);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), this.f29667b);
        canvas.drawText(this.f29669e, rectF.left + AndroidUtilities.dp(5.0f), rectF.top + AndroidUtilities.dp(12.0f), this.f29668c);
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
            int i11 = (int) ((i10 / 255.0f) * this.f29671g);
            this.f29667b.setAlpha(i11);
            this.f29668c.setAlpha(i11);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
