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
public final class vl0 extends Drawable {
    public final RectF f33568a = new RectF();
    public final Paint f33569b;
    public final TextPaint f33570c;
    public int d;
    public String f33571e;
    public final int f33572f;
    public int f33573g;
    public final int h;

    public vl0(int i10) {
        Paint paint = new Paint(1);
        this.f33569b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f33570c = textPaint;
        this.f33573g = 255;
        this.h = 255;
        this.f33572f = i10;
        textPaint.setTextSize(AndroidUtilities.dp(11));
        textPaint.setTypeface(AndroidUtilities.bold());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        if (i10 == 0) {
            this.f33571e = LocaleController.getString(R.string.ScamMessage);
        } else {
            this.f33571e = LocaleController.getString(R.string.FakeMessage);
        }
        this.d = (int) Math.ceil(textPaint.measureText(this.f33571e));
    }

    public final void a() {
        String string;
        if (this.f33572f == 0) {
            string = LocaleController.getString(R.string.ScamMessage);
        } else {
            string = LocaleController.getString(R.string.FakeMessage);
        }
        if (!string.equals(this.f33571e)) {
            this.f33571e = string;
            this.d = (int) Math.ceil(this.f33570c.measureText(string));
        }
    }

    public final void b(int i10) {
        this.f33570c.setColor(i10);
        this.f33569b.setColor(i10);
        this.f33573g = Color.alpha(i10);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f33568a;
        rectF.set(bounds);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), this.f33569b);
        canvas.drawText(this.f33571e, rectF.left + AndroidUtilities.dp(5.0f), rectF.top + AndroidUtilities.dp(12.0f), this.f33570c);
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
            int i11 = (int) ((i10 / 255.0f) * this.f33573g);
            this.f33569b.setAlpha(i11);
            this.f33570c.setAlpha(i11);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
