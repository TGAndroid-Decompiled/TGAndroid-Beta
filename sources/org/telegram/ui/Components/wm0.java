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
public final class wm0 extends Drawable {
    public final RectF f32156a = new RectF();
    public final Paint f32157b;
    public final TextPaint f32158c;
    public int d;
    public String e;
    public final int f32159f;
    public int f32160g;
    public final int h;

    public wm0(int i10) {
        Paint paint = new Paint(1);
        this.f32157b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f32158c = textPaint;
        this.f32160g = 255;
        this.h = 255;
        this.f32159f = i10;
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
        if (this.f32159f == 0) {
            string = LocaleController.getString(R.string.ScamMessage);
        } else {
            string = LocaleController.getString(R.string.FakeMessage);
        }
        if (!string.equals(this.e)) {
            this.e = string;
            this.d = (int) Math.ceil(this.f32158c.measureText(string));
        }
    }

    public final void b(int i10) {
        this.f32158c.setColor(i10);
        this.f32157b.setColor(i10);
        this.f32160g = Color.alpha(i10);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f32156a;
        rectF.set(bounds);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), this.f32157b);
        canvas.drawText(this.e, rectF.left + AndroidUtilities.dp(5.0f), rectF.top + AndroidUtilities.dp(12.0f), this.f32158c);
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
            int i11 = (int) ((i10 / 255.0f) * this.f32160g);
            this.f32157b.setAlpha(i11);
            this.f32158c.setAlpha(i11);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
