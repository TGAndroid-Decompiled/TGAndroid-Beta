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
public final class jn0 extends Drawable {
    public final RectF f27571a = new RectF();
    public final Paint f27572b;
    public final TextPaint f27573c;
    public int d;
    public String f27574e;
    public final int f27575f;
    public int f27576g;
    public final int h;

    public jn0(int i10) {
        Paint paint = new Paint(1);
        this.f27572b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f27573c = textPaint;
        this.f27576g = 255;
        this.h = 255;
        this.f27575f = i10;
        textPaint.setTextSize(AndroidUtilities.dp(11));
        textPaint.setTypeface(AndroidUtilities.bold());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        if (i10 == 0) {
            this.f27574e = LocaleController.getString(R.string.ScamMessage);
        } else {
            this.f27574e = LocaleController.getString(R.string.FakeMessage);
        }
        this.d = (int) Math.ceil(textPaint.measureText(this.f27574e));
    }

    public final void a() {
        String string;
        if (this.f27575f == 0) {
            string = LocaleController.getString(R.string.ScamMessage);
        } else {
            string = LocaleController.getString(R.string.FakeMessage);
        }
        if (!string.equals(this.f27574e)) {
            this.f27574e = string;
            this.d = (int) Math.ceil(this.f27573c.measureText(string));
        }
    }

    public final void b(int i10) {
        this.f27573c.setColor(i10);
        this.f27572b.setColor(i10);
        this.f27576g = Color.alpha(i10);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f27571a;
        rectF.set(bounds);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), this.f27572b);
        canvas.drawText(this.f27574e, rectF.left + AndroidUtilities.dp(5.0f), rectF.top + AndroidUtilities.dp(12.0f), this.f27573c);
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
            int i11 = (int) ((i10 / 255.0f) * this.f27576g);
            this.f27572b.setAlpha(i11);
            this.f27573c.setAlpha(i11);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
