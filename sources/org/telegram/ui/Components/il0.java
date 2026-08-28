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
public final class il0 extends Drawable {
    public final RectF f29455a = new RectF();
    public final Paint f29456b;
    public final TextPaint f29457c;
    public int d;
    public String f29458e;
    public final int f29459f;
    public int f29460g;
    public final int h;

    public il0(int i9) {
        Paint paint = new Paint(1);
        this.f29456b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f29457c = textPaint;
        this.f29460g = 255;
        this.h = 255;
        this.f29459f = i9;
        textPaint.setTextSize(AndroidUtilities.dp(11));
        textPaint.setTypeface(AndroidUtilities.bold());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        if (i9 == 0) {
            this.f29458e = LocaleController.getString(R.string.ScamMessage);
        } else {
            this.f29458e = LocaleController.getString(R.string.FakeMessage);
        }
        this.d = (int) Math.ceil(textPaint.measureText(this.f29458e));
    }

    public final void a() {
        String string;
        if (this.f29459f == 0) {
            string = LocaleController.getString(R.string.ScamMessage);
        } else {
            string = LocaleController.getString(R.string.FakeMessage);
        }
        if (!string.equals(this.f29458e)) {
            this.f29458e = string;
            this.d = (int) Math.ceil(this.f29457c.measureText(string));
        }
    }

    public final void b(int i9) {
        this.f29457c.setColor(i9);
        this.f29456b.setColor(i9);
        this.f29460g = Color.alpha(i9);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f29455a;
        rectF.set(bounds);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), this.f29456b);
        canvas.drawText(this.f29458e, rectF.left + AndroidUtilities.dp(5.0f), rectF.top + AndroidUtilities.dp(12.0f), this.f29457c);
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
    public final void setAlpha(int i9) {
        if (this.h != i9) {
            int i10 = (int) ((i9 / 255.0f) * this.f29460g);
            this.f29456b.setAlpha(i10);
            this.f29457c.setAlpha(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
