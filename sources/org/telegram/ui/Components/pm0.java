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
    public final RectF f29661a = new RectF();
    public final Paint f29662b;
    public final TextPaint f29663c;
    public int d;
    public String f29664e;
    public final int f29665f;
    public int f29666g;
    public final int h;

    public pm0(int i10) {
        Paint paint = new Paint(1);
        this.f29662b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f29663c = textPaint;
        this.f29666g = 255;
        this.h = 255;
        this.f29665f = i10;
        textPaint.setTextSize(AndroidUtilities.dp(11));
        textPaint.setTypeface(AndroidUtilities.bold());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        if (i10 == 0) {
            this.f29664e = LocaleController.getString(R.string.ScamMessage);
        } else {
            this.f29664e = LocaleController.getString(R.string.FakeMessage);
        }
        this.d = (int) Math.ceil(textPaint.measureText(this.f29664e));
    }

    public final void a() {
        String string;
        if (this.f29665f == 0) {
            string = LocaleController.getString(R.string.ScamMessage);
        } else {
            string = LocaleController.getString(R.string.FakeMessage);
        }
        if (!string.equals(this.f29664e)) {
            this.f29664e = string;
            this.d = (int) Math.ceil(this.f29663c.measureText(string));
        }
    }

    public final void b(int i10) {
        this.f29663c.setColor(i10);
        this.f29662b.setColor(i10);
        this.f29666g = Color.alpha(i10);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f29661a;
        rectF.set(bounds);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), this.f29662b);
        canvas.drawText(this.f29664e, rectF.left + AndroidUtilities.dp(5.0f), rectF.top + AndroidUtilities.dp(12.0f), this.f29663c);
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
            int i11 = (int) ((i10 / 255.0f) * this.f29666g);
            this.f29662b.setAlpha(i11);
            this.f29663c.setAlpha(i11);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
