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
public final class fn0 extends Drawable {
    public final RectF f26398a = new RectF();
    public final Paint f26399b;
    public final TextPaint f26400c;
    public int d;
    public String f26401e;
    public final int f26402f;
    public int f26403g;
    public final int h;

    public fn0(int i10) {
        Paint paint = new Paint(1);
        this.f26399b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f26400c = textPaint;
        this.f26403g = 255;
        this.h = 255;
        this.f26402f = i10;
        textPaint.setTextSize(AndroidUtilities.dp(11));
        textPaint.setTypeface(AndroidUtilities.bold());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        if (i10 == 0) {
            this.f26401e = LocaleController.getString(R.string.ScamMessage);
        } else {
            this.f26401e = LocaleController.getString(R.string.FakeMessage);
        }
        this.d = (int) Math.ceil(textPaint.measureText(this.f26401e));
    }

    public final void a() {
        String string;
        if (this.f26402f == 0) {
            string = LocaleController.getString(R.string.ScamMessage);
        } else {
            string = LocaleController.getString(R.string.FakeMessage);
        }
        if (!string.equals(this.f26401e)) {
            this.f26401e = string;
            this.d = (int) Math.ceil(this.f26400c.measureText(string));
        }
    }

    public final void b(int i10) {
        this.f26400c.setColor(i10);
        this.f26399b.setColor(i10);
        this.f26403g = Color.alpha(i10);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f26398a;
        rectF.set(bounds);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), this.f26399b);
        canvas.drawText(this.f26401e, rectF.left + AndroidUtilities.dp(5.0f), rectF.top + AndroidUtilities.dp(12.0f), this.f26400c);
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
            int i11 = (int) ((i10 / 255.0f) * this.f26403g);
            this.f26399b.setAlpha(i11);
            this.f26400c.setAlpha(i11);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
