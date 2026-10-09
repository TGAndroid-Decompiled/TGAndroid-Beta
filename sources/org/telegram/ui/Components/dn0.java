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
public final class dn0 extends Drawable {
    public final RectF f25743a = new RectF();
    public final Paint f25744b;
    public final TextPaint f25745c;
    public int d;
    public String f25746e;
    public final int f25747f;
    public int f25748g;
    public final int h;

    public dn0(int i10) {
        Paint paint = new Paint(1);
        this.f25744b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f25745c = textPaint;
        this.f25748g = 255;
        this.h = 255;
        this.f25747f = i10;
        textPaint.setTextSize(AndroidUtilities.dp(11));
        textPaint.setTypeface(AndroidUtilities.bold());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        if (i10 == 0) {
            this.f25746e = LocaleController.getString(R.string.ScamMessage);
        } else {
            this.f25746e = LocaleController.getString(R.string.FakeMessage);
        }
        this.d = (int) Math.ceil(textPaint.measureText(this.f25746e));
    }

    public final void a() {
        String string;
        if (this.f25747f == 0) {
            string = LocaleController.getString(R.string.ScamMessage);
        } else {
            string = LocaleController.getString(R.string.FakeMessage);
        }
        if (!string.equals(this.f25746e)) {
            this.f25746e = string;
            this.d = (int) Math.ceil(this.f25745c.measureText(string));
        }
    }

    public final void b(int i10) {
        this.f25745c.setColor(i10);
        this.f25744b.setColor(i10);
        this.f25748g = Color.alpha(i10);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f25743a;
        rectF.set(bounds);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), this.f25744b);
        canvas.drawText(this.f25746e, rectF.left + AndroidUtilities.dp(5.0f), rectF.top + AndroidUtilities.dp(12.0f), this.f25745c);
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
            int i11 = (int) ((i10 / 255.0f) * this.f25748g);
            this.f25744b.setAlpha(i11);
            this.f25745c.setAlpha(i11);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
