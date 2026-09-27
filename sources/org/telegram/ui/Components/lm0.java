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
public final class lm0 extends Drawable {
    public final RectF f26087a = new RectF();
    public final Paint f26088b;
    public final TextPaint f26089c;
    public int d;
    public String e;
    public final int f26090f;
    public int f26091g;
    public final int h;

    public lm0(int i10) {
        Paint paint = new Paint(1);
        this.f26088b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f26089c = textPaint;
        this.f26091g = 255;
        this.h = 255;
        this.f26090f = i10;
        textPaint.setTextSize(AndroidUtilities.dp(11));
        textPaint.setTypeface(AndroidUtilities.bold());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        if (i10 == 0) {
            this.e = LocaleController.getString(R.string.ScamMessage);
        } else {
            this.e = LocaleController.getString(R.string.FakeMessage);
        }
        this.d = (int) Math.ceil(textPaint.measureText(this.e));
    }

    public final void a() {
        String string;
        if (this.f26090f == 0) {
            string = LocaleController.getString(R.string.ScamMessage);
        } else {
            string = LocaleController.getString(R.string.FakeMessage);
        }
        if (!string.equals(this.e)) {
            this.e = string;
            this.d = (int) Math.ceil(this.f26089c.measureText(string));
        }
    }

    public final void b(int i10) {
        this.f26089c.setColor(i10);
        this.f26088b.setColor(i10);
        this.f26091g = Color.alpha(i10);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f26087a;
        rectF.set(bounds);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), this.f26088b);
        canvas.drawText(this.e, rectF.left + AndroidUtilities.dp(5.0f), rectF.top + AndroidUtilities.dp(12.0f), this.f26089c);
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
            int i11 = (int) ((i10 / 255.0f) * this.f26091g);
            this.f26088b.setAlpha(i11);
            this.f26089c.setAlpha(i11);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
